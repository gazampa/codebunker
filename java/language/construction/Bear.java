public class Bear extends Animal{
	boolean isABear;
	boolean itsATalkingBear=false;
	String noise;
	String[] bearTalk = {"Sometimes you eat the bear","Sometimes the bear eats you","Oh my aching back","Its a bears life","Unbelievable"};

	public Bear(){
		super(true);
		isABear=true;
	}

	public Bear(boolean pParam){
		itsATalkingBear=pParam;
	}

	public Bear( String pParam){
		noise = pParam;
	}

	private String makeANoise(){
		return "Grrrrooowwwl";
	}


	protected boolean isATalkingBear(){
		return itsATalkingBear;
	}

	protected void setBearTalking(boolean pParam){
		itsATalkingBear = pParam;
	}

	private String saySomething(){
		if ( itsATalkingBear ){
			int x = (int) (Math.random()*5);
			return bearTalk[x];
		}else{
			return makeANoise();
		}
	}


}