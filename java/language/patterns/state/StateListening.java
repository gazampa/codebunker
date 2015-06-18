public final class StateListening implements State{

	private static final String name = "LISTENING";

	public void open(){
		System.out.println(" Listening : open command ");
	};
	public void close(){
		System.out.println(" Listening : close command ");
	};
	public void acknowledge(){
		System.out.println(" Listening : acknowledge command ");
	};
	public String getName(){
		return name;
	}

	public boolean equals(Object o){
		boolean result = false;
		if (o instanceof StateListening)
			result = true;
		return result;
	}

	public int hashCode(){
		return Integer.parseInt(name);
	}

	public States getType(){
		States result = null;
		if ( this.equals( States.LISTENING.getState() ) )
			result = States.LISTENING;
		return result;
	}

}