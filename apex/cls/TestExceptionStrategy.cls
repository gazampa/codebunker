@isTest
public class TestExceptionStrategy {
      
    @isTest
    public static void testPartialInsert(){
        
        Test.startTest();
        
        Account acc1 = new Account(Name='1st Account');
        Account acc2 = new Account();
        Contact con = new Contact(LastName='Jones');
        
        try {
        
        	insert acc1;
        
            try {
                
                insert acc2;    
    
            } catch (Exception ex ){
                System.debug('---catching account ' + ex.getMessage());
                //throw ex;
            }
        
        	insert con;
            
        } catch ( Exception ex ){
            system.debug('---catching outer ( trigger level ) ' + ex.getMessage());
        }
        
        Test.stopTest();
        
        List<Account> accounts = [select id from Account];
        
        List<Contact> contacts = [select id from Contact];
     
        System.debug('---r accounts : ' + accounts.size());
        
        System.debug('---r contacts : ' + contacts.size());
    
    }   
    
    //@isTest
    static void testRollback() {
     
        Savepoint sp = Database.setSavepoint();
        
        try{
            
            Account a = new Account(name='test');

			insert a;
                        
            Contact c = new Contact(lastname='test', AccountId='not_an_id');
            
            insert c;
            
        } catch( Exception e ) {
                        
            System.debug( e.getMessage() );
            
            Database.rollback(sp);
            
        }  finally {}
        
        List<Account> result = [select id, name from Account];
        
        System.assert(result.size() == 0 );
        
    }
    
}