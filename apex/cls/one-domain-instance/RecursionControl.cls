public class RecursionControl {
	// vulnerable to typos - sequential execution only, memory would be shared if triggers execute in parralel
    static Map<String, Integer> counter = new Map<String, Integer>();
    
    public static void count(String name){
        
        if ( counter.keySet().contains(name)){
        
            Integer count = counter.get(name);
            
            counter.put(name, ++count);
        	    
        } else {
            
            counter.put(name, 1);
        
        }
        
    }
    
    public static boolean execute( String name, Integer level ) {
        
        System.debug( ' ---> execute ' + counter.get(name) );
        
        if ( counter.get(name) > level ){ return false; }
        
        return true;
        
    }
    
    public static Integer getCount(String name){
        
        return ( counter.get(name) );
        
    }
    
}