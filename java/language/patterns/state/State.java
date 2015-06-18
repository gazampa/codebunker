public interface State{

	public void open();
	public void close();
	public void acknowledge();
	public String getName();
	public States getType();

}