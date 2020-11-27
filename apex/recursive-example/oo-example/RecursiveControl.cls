public class RecursiveControl {
	// vulnerable to typos still only one shared copy
    // if you ever had parallel processing of triggers, you would have to make non singleton and control instantiation in the trigger to first level
    private Integer level = 0;
    
    private Map<String, Integer> counter;
    
    // no user defined methods in apex enums, but no reflection in apex either
    private static final RecursiveControl instance = new RecursiveControl();
    
    public static RecursiveControl getInstance(){
        
        return instance; 
        
    }
    
    private RecursiveControl(){
        
        counter = new Map<String, Integer>();
        
    }
    
    public void count(String name){
        
        if ( counter.keySet().contains(name)){
        
            Integer count = counter.get(name);
            
            counter.put(name, ++count);
        	    
        } else {
            
            counter.put(name, 1);
        
        }
        
    }
    
    public boolean execute( String name, Integer level ) {
        
        System.debug( ' ---> execute ' + counter.get(name) );
        
        if ( counter.get(name) > level ){ return false; }
        
        return true;
        
    }
       
    public void callCount(){
        
        level++;
        
    }

}