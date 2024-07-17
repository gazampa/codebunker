package main.hash;

import java.util.HashMap;
//Unsynchronized, permits nulls
public class BasicHashMap {
    
    //ref: class defs below for equals/hashcode override implementations
    private HashMap<GoodKey, Integer> gm; 
    private HashMap<BadKey, Integer> bm;
    private HashMap<WorstKey, Integer> wm;

    public BasicHashMap(){
        gm = new HashMap<GoodKey, Integer>();
        gm.put(new GoodKey("ONE"), 1);
        gm.put(new GoodKey("TWO"), 2);
        gm.put(new GoodKey("THREE"), 3);
        gm.put(new GoodKey("FOUR"), 4);
        gm.put(new GoodKey("FIVE"), 5);
        gm.put(new GoodKey("FIVE"), 6); // duplicate key entry overwrites by default
        bm = new HashMap<BadKey, Integer>();
        bm.put(new BadKey("ONE"), 1);
        bm.put(new BadKey("TWO"), 2);
        bm.put(new BadKey("THREE"), 3);
        bm.put(new BadKey("FOUR"), 4);
        bm.put(new BadKey("FIVE"), 5);
        bm.put(new BadKey("FIVE"), 6);
        wm = new HashMap<WorstKey, Integer>();
        wm.put(new WorstKey("ONE"), 1);
        wm.put(new WorstKey("TWO"), 2);
        wm.put(new WorstKey("THREE"), 3);
        wm.put(new WorstKey("FOUR"), 4);
        wm.put(new WorstKey("FIVE"), 5);
        wm.put(new WorstKey("FIVE"), 6);        
    }

    public HashMap<GoodKey, Integer> getGoodMap(){
        return gm;
    }

    public HashMap<BadKey, Integer> getBadMap(){
        return bm;
    }

    public HashMap<WorstKey, Integer> getWorstMap(){
        return wm;
    }


public class GoodKey{

    private String name;

    public GoodKey(String val){
        name = val;
    }

    @Override
    public boolean equals(Object obj){
        if ( obj == null || getClass() != obj.getClass() ) return false;
        GoodKey other = (GoodKey)obj;
        return ( name==other.name );
    }
    @Override
    public int hashCode(){                  //polynomial, multipliction is better performance than exponents, 
        char[] chrs = name.toCharArray();   // 31 is one of a best guesstimate for uniform distribution of calculated codes for strings across map size
        int hcode = 1;                      // maps resize in factors of ^2
        for ( char c : chrs ){
            hcode= hcode * 31 + (int)c; 
        }
        return hcode;  //O(1)
    }
    @Override
    public String toString(){
        return name;
    }
}

public class BadKey{

    private String name;

    public BadKey(String val){
        name = val;
    }

    @Override
    public boolean equals(Object obj){
        if ( obj == null || getClass() != obj.getClass() ) return false;
        BadKey other = (BadKey)obj;
        return ( name==other.name ); // equals still working, differentiated by equals, bad performance, some data overwritten
    }
    @Override
    public int hashCode(){
        return 0;// O(n) equals above still working, all keys the same, max collisions, total uniformity 
    }
    @Override
    public String toString(){
        return name;
    }

}
public class WorstKey{

    private String name;

    public WorstKey(String val){
        name = val;
    }

    @Override
    public boolean equals(Object obj){
        return true; //  unable to differentiate, data overwritten  
    }
    @Override
    public int hashCode(){
        return 0;// all keys the same, max collisions, total uniformity 
    }
    @Override
    public String toString(){
        return name;
    }
}
    
}
