abstract class ComponentBuilder{

	protected Component component;

	public void createComponent(){
		component = new Component();
	}


	public Component getComponent(){
		return component;
	}

	public abstract void buildInstanceVar1();

	public abstract void buildInstanceVar2();

	public abstract void buildInstanceVar3();

}