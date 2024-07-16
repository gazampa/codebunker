@isTest
public class TestCustomObjectTrigger {

    static testmethod void testTrigger(){
        
        List<Custom_Object__c> objs = new List<Custom_Object__c>();
        
        for ( integer i = 0; i < 10; i ++ ) {
            
            objs.add ( new Custom_Object__c(name='test insert ' + i) );
            
        }
        
        insert objs;
        
        objs = [select id, name from Custom_Object__c limit 100];
        
        for ( integer i = 0; i < 10; i ++ ) {
           
            objs[i].name = objs[i].name + ' UPDATED';
            	
        }

        update objs;

        List<Custom_Object__c> result = [select id, name from Custom_Object__c limit 100 ];
    
        for ( integer i = 0; i < result.size(); i++ ) {
            
            System.debug('---> result ' + result[i]);
            
        }

    }
        
}