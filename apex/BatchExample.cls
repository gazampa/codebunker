global with sharing class BatchExample implements
                    Database.Batchable<sObject>, Database.Stateful {
    
    // instance member to retain state across transactions
    global List<String> errors = new List<String>();
        
    global Integer recordsProcessed = 0;
                        
    global Integer executeIdx = 0;
    
    global List<Integer> idx = new List<Integer>();
                        
    global Database.QueryLocator start(Database.BatchableContext bc) {

        String soqlQuery = 'SELECT ID, Name, ( SELECT ID, FirstName, LastName FROM Contacts ) FROM Account';

        return Database.getQueryLocator( soqlQuery );
    
    }
        
    global void execute(Database.BatchableContext bc, List<Account> scope){
        // process each batch of records
        
        List<Contact> contacts = new List<Contact>();
        
        for (Account a : scope) {
            
            idx.add(scope.size() );
            
            contacts.clear();
            
            System.debug(' ---> : execute index = ' + idx + ' : contacts size = ' + contacts.size() );
			
            executeIdx++;
            
            for ( Contact c : a.Contacts ) {
                
                // for every 10th contact, trigger a problem
                if ( Math.mod( recordsProcessed, 10 ) == 0 ) {

                    c.LastName = null;
                
                    // add contact to list to be updated
                    contacts.add(c);
                                        
                }
                                
                // increment the instance member counter
                recordsProcessed = recordsProcessed + 1;
            
            }
        
        }
        
        Database.SaveResult[] sr = Database.update ( contacts, false );

        Integer recordIndex = 0;
        
        for ( Integer i = 0; i < sr.size(); i++ ) {
            
            Database.SaveResult result = sr.get(i);
            
            if ( ! result.isSuccess() ){
                
                for(Database.Error err : result.getErrors()) {
                    
                    System.debug(' --> err ' + contacts[i]);
                    
                    String message = 'The following error has occurred for : ' + contacts[i].id + ' ';                    
                    
                    message+= err.getStatusCode() + ': ' + err.getMessage();
                    
                    message+='Contact fields that affected this error: ' + err.getFields();
                	
                    errors.add(message);
                
                }
                
                recordIndex++;
                
            }
            
        }

    }    
    global void finish(Database.BatchableContext bc){
        
        System.debug(recordsProcessed + ' records processed.');
        
        AsyncApexJob job = [SELECT Id, Status, NumberOfErrors, 
                            JobItemsProcessed,
                            TotalJobItems, CreatedBy.Email
                            FROM AsyncApexJob
                            WHERE Id = :bc.getJobId()];
        
        // call some utility to send email
        //EmailUtils.sendMessage(job, recordsProcessed);
    
        for ( String msg : errors ) {

            System.debug('---> batch : ' + msg);

        }

    }

}