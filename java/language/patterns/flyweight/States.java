public enum States{

	A("State A"),B("State B"), C("State C"), BLANK("State Blank");

	private final String state;

	private States(String val){
		state=val;
	}

	public String getState(){
		return state;
	}

}