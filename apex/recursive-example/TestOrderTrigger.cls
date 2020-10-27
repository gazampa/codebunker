@isTest
public class TestOrderTrigger {

    public static testmethod void testMethodA(){
        
        List<Account> accs = new List<Account>();
        
        for ( Integer i = 0; i < 1; i++) {
            
            accs.add(new Account(Name='Test'));
            
        }
        
        insert accs;
        
        List<Order> orders = new List<Order>();
        
        for (Integer i = 0; i < 10; i++) {
            
            orders.add(new Order(AccountID=accs[0].Id, EffectiveDate = Date.today(), status = 'Draft'));
            
        }
        
        Test.startTest();
        
        	insert orders;   
        
        Test.stopTest();
        
        List<Order> inserted = [select id, name, BillingCity from Order];
        
        for ( Order o : inserted ) {
            
            System.debug(' ---> name : ' + o.name + ' : ' + o.BillingCity );
            
        }
        
        System.assert( inserted.size() == 10 );
        
    }
    

}