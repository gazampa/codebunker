trigger CustomObjectControlling on Custom_Object__c (before insert, after update) {
                   
    System.debug('---> Trigger Entrant');
    
    RecursiveControl recursionControl = RecursiveControl.getInstance();                                         
    
    recursionControl.callCount();                                        
                                              
	if ( Trigger.isBefore){
    
        System.debug('---> trigger level ( before ) : ');
        
        if (Trigger.isInsert){
            
			CustomObjectHandler.methodA();
            
        }
        
        if ( Trigger.isUpdate ){
                   
        
        }
    
        if (Trigger.isDelete){

            
		}
        
    }

    if ( Trigger.isAfter){
        
        System.debug('---> trigger level ( after ) : ');
        
        if (Trigger.isInsert){

        
        }
        
        if ( Trigger.isUpdate ){

            recursionControl.count('CustomObjectHandler.methodB');
            
            if ( recursionControl.execute('CustomObjectHandler.methodB', 5) ) {
            
        		CustomObjectHandler.methodB();
            
            }
            
            //this method goes up to 11
            CustomObjectHandler.methodC();
            
            //this is only to kick off a recursive process
            CustomObjectHandler.triggerRecursion( true );
            
        }
    
        if (Trigger.isDelete){
        
	    }    
                                          
	}
    
    System.debug('---> Trigger Exit ');
                                              
}