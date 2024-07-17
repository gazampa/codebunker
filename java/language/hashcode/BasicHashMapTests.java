package tests;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import main.hash.BasicHashMap;
import main.hash.BasicHashMap.GoodKey;
import main.hash.BasicHashMap.BadKey;
import main.hash.BasicHashMap.WorstKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
public class BasicHashMapTests {

    @Test
    public void testGoodKeys(){
      //Good Performace O(1) keys are repeatable and Uniformly Distributed across size of Array, Values are differentiable
      BasicHashMap hash = new BasicHashMap(); 
  
      HashMap<GoodKey, Integer> map = hash.getGoodMap();
      
      Set<GoodKey> keys = map.keySet();

      System.out.println(keys.toString());

      assertEquals(5, map.size());

      ArrayList<Integer> values = new ArrayList<Integer>();

      for ( Integer v : map.values() ){
        values.add(v);  
      }
      assertEquals(values.contains(6), true);

    }

    @Test
    public void testBadKeys(){
      // Bad Performance O(n)  keys are similiar and have Poor to Zero Distribution of Keys across size of Array, Values are differentiable.
      BasicHashMap hash = new BasicHashMap(); 
  
      HashMap<BadKey, Integer> map = hash.getBadMap();
      
      Set<BadKey> keys = map.keySet();

      System.out.println(keys.toString());

      assertEquals(5, map.size());

      ArrayList<Integer> values = new ArrayList<Integer>();

      for ( Integer v : map.values() ){
        values.add(v);  
      }
      assertEquals(values.contains(6), true);

    }

    @Test
    public void testWorstKeys(){
      // Data Overwritten - keys are similiar and Values are not differentiable
      BasicHashMap hash = new BasicHashMap(); 
  
      HashMap<WorstKey, Integer> map = hash.getWorstMap();
      
      Set<WorstKey> keys = map.keySet();

      System.out.println(keys.toString());
      
      assertEquals(1, map.size());

      ArrayList<Integer> values = new ArrayList<Integer>();

      for ( Integer v : map.values() ){
        values.add(v);  
      }
      assertEquals(values.contains(6), true);

    }
  
}
