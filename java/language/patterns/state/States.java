public enum States{

	LISTENING( new StateListening()),ESTABLISHED ( new StateEstablished() ), CLOSED ( new StateClosed() );

	private final State state;

	private States(State s){
		state = s;
	}

	public State getState(){
		return state;
	}

}