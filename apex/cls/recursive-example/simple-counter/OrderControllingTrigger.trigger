trigger OrderControllingTrigger on Order (before insert, before update, before delete,
                                          after insert, after update, after delete) {
    
    /**
    
    this example starts with an insert and then updates the same record in an after trigger
    kicking off the recursive cycle. 

    It uses a basic static variable to reduce complexity and highlight whats going on.

    More sophisticated recursion control can track individual trigger contexts and handler classes 
    that are firing for more fine grained control   
    
    */

    //basic recursion control with static variable
    Integer count = StaticCounter.value;
    
    // i prefer static controllers as in the provided one trigger pattern example
    // its more basic but a little easier to immediately see whats being passed into methods
    // signatures for this kind of handler have cleaner signatures
    OrderTriggerHandler handler = new OrderTriggerHandler( System.Trigger.new, System.Trigger.OldMap);                                          
                                                  
	if ( Trigger.isBefore){
    
        System.debug('---> trigger level ( before ) : ' + count + ' before ');
        
        if (Trigger.isInsert){
            
            handler.methodA();

        }
        
        if ( Trigger.isUpdate ){
                   
        
        }
    
        if (Trigger.isDelete){

            
		}
        
    }

    if ( Trigger.isAfter){
        
        System.debug('---> trigger level ( after ) : ' + count );
        
        if (Trigger.isInsert){
                      
           	handler.methodB();
        
        }
        
        if ( Trigger.isUpdate ){
            //Increment recursion counter, allow 5 iterations then block
            StaticCounter.value++;
            
            if ( StaticCounter.value < 5 ){
  
  	          handler.methodB();
            
            }
        
        }
    
        if (Trigger.isDelete){
        
	    }
        
   }    
                                          
}