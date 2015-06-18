public final class StateClosed implements State{

	private static final String name = "CLOSED";

	public void open(){
		System.out.println(" Closed : open command ");
	};

	public void close(){
		System.out.println(" Closed : close command ");
	};

	public void acknowledge(){
		System.out.println(" Closed : acknowledge command ");
	};

	public String getName(){
		return name;
	}

	public boolean equals(Object o){
		boolean result = false;
		if (o instanceof StateClosed)
			result = true;
		return result;
	}

	public int hashCode(){
		return Integer.parseInt(name);
	}

	public States getType(){
		States result = null;
		if ( this.equals( States.CLOSED.getState() ) )
			result = States.CLOSED;
		return result;
	}

}