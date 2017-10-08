public class TCPConnection{

	private State state = null;

	public TCPConnection( States states ){
		this.state = states.getState();
	}

	private void setState(State state){
		this.state = state;
	}

	public void changeState(States states){
		if ( states!=null )
			setState(states.getState());
	}

	private State getState(){
		return state;
	}

	protected String getCurrentStateName(){
		String result = new String();
		if ( state!=null)
			result = state.getName();
		return result;
	}

	protected void showPossibleStates(){
		System.out.print("POSSIBLE STATES : ");
		for (States s : States.values()){
			State state = s.getState();
			System.out.print(state.getName() + " ");
		}
		System.out.println();
	}


	protected void open(){

//		System.out.println( "Current State" + getState() );
//		System.out.println( States.LISTENING );

/*		if ( States.LISTENING.getState().equals( state ) ) {
			state.open();
		}else if ( States.ESTABLISHED.getState().equals(state) ){
			state.open();
		}else if ( States.CLOSED.getState().equals(state) ){
			state.open();
		}else{
			System.out.println("Inconsitent State");
		}
*/
		switch( state.getType() ) {
			case LISTENING : state.open();break;
			case ESTABLISHED : state.open();break;
			case CLOSED : state.open();break;
			default : System.out.println("Inconsistant State"); break;
		}
	}

}