class X{

	private static final X INSTANCE = new X();

	public static X getInstance(){
		return INSTANCE;
	}

	private X(){}


	public int doSomething(){

		return 1;
	}


}