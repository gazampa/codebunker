public abstract class AbstractComponentBuilder{

	protected Component component;

	public Component getComponent(){
		return component;
	}

	public void createNewComponent(){
		component = new Component();
	}

	public abstract void buildInstance1();
	public abstract void buildInstance2();
	public abstract void buildInstance3();

}