@isTest
public class TestTriggerHelperInstance {

    
    @testSetup
    static void createData(){
     
        List<Account> accounts = new List<Account>();
        for (integer i = 0; i < 10; i ++){
            Account a = new Account(name='Account ' + i);
            accounts.add(a);
        }
//        insert accounts;
    }
    
    @isTest
    public static void testInstanceMaps(){

    Test.startTest();

        List<Account> accounts = new List<Account>();
        for (integer i = 0; i < 10; i ++){
            Account a = new Account(name='Account ' + i);
            accounts.add(a);
        }
        insert accounts;  
        
        for ( Account a : accounts ){
            a.name = a.name + ' updated';
        }
        
        update accounts;
        
    Test.stopTest();

        
    }

    
    
}