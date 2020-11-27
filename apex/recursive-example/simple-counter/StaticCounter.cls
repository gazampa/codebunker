public class StaticCounter {

    public static Integer value = 0;
	// each trigger context can get a counter, ie, before, after, insert, update, delete
	
    // utility methods to set and reset values
    
    // for demo
    private static String[] letters = new String[]{'a','b','c','d','e'};

    public static String getLetter( Integer index ) {
            
        String result = ''; // default will be empty
            
        if ( index < letters.size() ) {
            	
            result = letters[index];

        }
            
        return result;
        
    }
        
}