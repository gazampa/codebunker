public class MainMethod{

	static Component[] concretes = new ConcreteComponent[100];
	static Context[] contexts = new Context[100];
	static int requestsMade = 0;
	static ConcreteComponentFactory concreteFactory;

	static void makeRequest(String intrinsicState, int extrinsicState){
		concretes[requestsMade] = concreteFactory.getComponentWithState(intrinsicState);
		contexts[requestsMade++] = new Context(extrinsicState);
	}

	public static void main(String args[]){
		concreteFactory = new ConcreteComponentFactory();
		makeRequest(States.A.getState(), 1);
		makeRequest(States.B.getState(), 1);
		makeRequest(States.C.getState(), 1);
		makeRequest(States.A.getState(), 1);
		makeRequest(States.A.getState(), 1);
		makeRequest(States.A.getState(), 1);
		makeRequest("State X", 1);
		makeRequest("State X", 1);

		System.out.println("Number of Components : " + concreteFactory.getTotalConcreteStates());

		for ( int i = 0; i < requestsMade ; i++ ){
			System.out.println(concretes[i]);
			System.out.println(contexts[i]);
		}


	}

}