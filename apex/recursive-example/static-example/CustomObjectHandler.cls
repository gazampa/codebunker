public class CustomObjectHandler {

    static integer counterA = 0;
    
    static integer counterB = 0;
    
    static integer counterC = 0;
    
    static integer level = 0;
    
    public static void methodA() {
        
        counterA++;
        
        System.debug(' ---> method A ' + counterA);
        
    }
    
    public static void methodB() {
        
        counterB++;
        
        System.debug(' ---> method B ' + counterB);

    }
    
    public static void methodC() {
        
        counterC++;
        
        System.debug(' ---> method C ' + counterC);
        
    }
    
    public static void triggerRecursion(boolean run ) {
        
        level++;
        
        if ( !run ) return;
        
        if ( level >= 11 ) return; // block on 11 iterations, sf limit is 16, this block only runs 10 times
        
        List<Custom_Object__c> objs = [ select id, name from Custom_Object__c limit 100 ]; 
        
        for (Custom_Object__c obj : objs ){

        	obj.name = obj.name + level + ' ';
        
        }
    
        Database.update( objs );
        
    }
    
    
}