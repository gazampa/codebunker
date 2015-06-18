import java.util.Properties;
import java.util.Enumeration;

class GetSystemProperties{

	public static void main(String[] args){

		Properties p = System.getProperties();
		Enumeration keys = p.keys();
		while (keys.hasMoreElements()) {
		  String key = (String)keys.nextElement();
		  String value = (String)p.get(key);
		  System.out.println(key + ": " + value);
		}
	}

}
