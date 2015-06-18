public final class StateEstablished implements State{

	private static final String name = "ESTABLISHED";

	public void open(){
		System.out.println(" Establised : open command ");
	};
	public void close(){
		System.out.println(" Establised : close command ");
	};
	public void acknowledge(){
		System.out.println(" Establised : acknowledge command ");
	};
	public String getName(){
		return name;
	}
	public boolean equals(Object o){
		boolean result = false;
		if (o instanceof StateEstablished)
			result = true;
		return result;
	}
	public int hashCode(){
		return Integer.parseInt(name);
	}

	public States getType(){
		States result = null;
		if ( this.equals( States.ESTABLISHED.getState() ) )
			result = States.ESTABLISHED;
		return result;
	}

}