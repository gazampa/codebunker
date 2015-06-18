class Director{

	private ComponentBuilder componentBuilder;

	public void setComponentBuilder(ComponentBuilder cb){
		componentBuilder = cb;
	}

	public Component getComponent(){
		return componentBuilder.getComponent();
	}

	public void constructComponent(){
		componentBuilder.createComponent();
		componentBuilder.buildInstanceVar1();
		componentBuilder.buildInstanceVar2();
		componentBuilder.buildInstanceVar3();
	}

}