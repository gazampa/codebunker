import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

public class TestHashtable {
  public static void main(String[] s) {
    Hashtable table = new Hashtable();
    table.put("key1", "value1");
    table.put("key2", "value2");
    table.put("key3", "value3");

    Enumeration e = table.keys();
    while (e.hasMoreElements()) {
      String key = (String) e.nextElement();
      System.out.println(key + " : " + table.get(key));
    }

  	ArrayList<String> result = new ArrayList<String>();
  	String[] arrayStr = (String[])result.toArray(new String[result.size()]);


  }
}