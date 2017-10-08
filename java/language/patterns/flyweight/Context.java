public class Context{

	private int extrinsicState;

	public Context(){
		extrinsicState = 0;
	}

	public Context(int val){
		extrinsicState = val;
	}

	public int getExtrinsicState(){
		return extrinsicState;
	}

}