class TestCache{


	public static void main(String[] args){

		Cache instance = Cache.instance;

		instance.userCache.put("a", "a");

		System.out.println(instance.userCache);

	}

}