public class LoggingService {
 // boiler plate for logging service
  
    private static boolean config { get { return Application_Configuration__c.getValues('Logging').Enabled__c; } set; }

    private static boolean enabled { get { return ( config == true ); } set; }
    
    private static boolean disabled { get { return ( config == false ); } set; }
    
    private static boolean batch { get { return System.isBatch(); } set; }
    
    //seperate calls for each type of log, wouldnt it be good to be invokable
    @AuraEnabled
    public static void logToObject( String errorMessage ) {

        // if not enabled or in batch, quit
        if ( disabled || batch ) { return; }
        
        System.debug('---> sending to queue');
        
        System.enqueueJob( new DatabaseLog( errorMessage) );
        
        System.debug('---> sending to queue complete');
        
    }
    
    @AuraEnabled
    public static void logToEmail( String errorMessage ) {

		if ( disabled || batch ) { return; }	        

        System.debug('---> sending to queue');
        
        System.enqueueJob( new EmailNotificationLog( errorMessage) );
        
        System.debug('---> sending to queue complete');
    
    }

    @AuraEnabled
    public static void logToPlatformEvent( String errorMessage ) {
    
        if ( disabled || batch ) { return; }

        System.debug('---> sending to queue');
        
        System.enqueueJob( new PlatformEventLog( errorMessage) );
        
        System.debug('---> sending to queue complete');
    
    }
    
    // possible to chain another job that adds functionality...kinda expensive in terms of jobs, what ways to add functionality ?
    // try to composition
    class DatabaseLog implements Queueable {
       	
        String message;
        
        public DatabaseLog(String errMsg) {
            
            message = errMsg;
            
        }
        
        public void execute( QueueableContext context ) {
            
            performTask();
        
        }
        
        private void performTask(){
			
            System.debug('--> create a database record');
			
            Custom_Object__c logEntry = new Custom_Object__c( Area_of_Text__c = message );
        
    	    Database.insert( logEntry );
            
        }
        
    }

    class EmailNotificationLog implements Queueable {
       	
        String message;
        
        public EmailNotificationLog(String errMsg) {
            
            message = errMsg;
            
        }
        
        public void execute( QueueableContext context ) {
            
			performTask();
            
        }
        
        private void performTask(){
            System.debug('--> sending an email');
            // send an email with an email sending utility

        }
        
    }

    class PlatformEventLog implements Queueable {
       	
        String message;
        
        public PlatformEventLog(String errMsg) {
            
            message = errMsg;
            
        }
        
        public void execute( QueueableContext context ) {
            
			performTask();
            
        }
        
        private void performTask(){
			// register an event            
			System.debug('--> registering an event');
            
            List<LoggingEvent__e> logEvents = new List<LoggingEvent__e>();
            
			logEvents.add( new LoggingEvent__e( message__c=message ) );         
            
        }
    
    }
                
}