import java.util.Map;
import java.util.HashMap;

class Cache {

	static final Cache instance = new Cache();

	Map<String, String> userCache = new HashMap<String, String>();

	private Cache(){} // private constructor //..

}