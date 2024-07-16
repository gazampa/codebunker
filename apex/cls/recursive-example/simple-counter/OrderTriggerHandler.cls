public class OrderTriggerHandler {

    private List<Order> newTrigger;
    
    private Map<ID, Order> oldMap;
    
    public OrderTriggerHandler(List<Order> newT, Map<Id, Order> oldM){
        
        newTrigger = newT;
        oldMap = oldM;
        
    }
    
    public void methodA(){
        
        for (Order o : newTrigger ){
            
			o.Name = 'test';
            
        }
        
    }
    
    public void methodB(){
        
        System.debug(' ---> executing methodb');
        
        List<Order> rePulled = [select id, billingcity from order where id=:newTrigger]; 
        
        for (Order o : rePulled ){

            if ( o.BillingCity==null ) {
                
                o.BillingCity = StaticCounter.getLetter(StaticCounter.value);
            
            } else { 
                
                o.BillingCity += StaticCounter.getLetter(StaticCounter.value);
            
            }
        
        }
    
        Database.update( rePulled );
    }
    
}