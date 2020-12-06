@isTest
public class TestLoggingService {

    static testmethod void testLoggingService() {
        // turn on logging
        Application_Configuration__c settings = new Application_Configuration__c(Name='Logging', Enabled__c = true);
        
        insert settings;
        
        System.debug(' ---> ' + settings);

        // example of client calling code
        
        Test.startTest();
        
        // Strings have no max limit other than heap, 6MB, text area long is 128k...        
        String parameters = '{ [ "A":"134", "B"="5678", "C"="wertqert", "D"="SDFASEF"] }';
                
        try {
        	// THIS OVERWRITES THE ERROR MESSAGE
        	String errorMessage = 'custom error message : ' + parameters;
            
            throw new CustomException(errorMessage);
                
        } catch (CustomException e) {
			
            // standard
            System.debug( e.getMessage() );
        	
            // new method to log to database - 
            e.logit( e.getMessage() );
            
        } finally {
            
        }
        
        Test.stopTest();

        System.debug( 'test class dml ' + Limits.getDmlStatements() );
        
        List<Custom_Object__c> cos = [select id, Field_of_Text__c, Area_of_Text__c from Custom_Object__c limit 100];
        
        String result = '';
        
        for (Custom_Object__c co : cos ) {
            
            result = co.Area_of_Text__c;
            
            System.debug(' --- > ' + result);
            
        }
    
        System.assert(true, result.contains('custom error message'));
        
    }

}