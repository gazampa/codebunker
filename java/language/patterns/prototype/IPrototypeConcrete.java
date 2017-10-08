package patterns.prototype;
public class IPrototypeConcrete implements IPrototype{

	private final String name = "A";
	private String id;

	public IPrototypeConcrete(){}
	public IPrototypeConcrete(String str){ id = str; }

	public Object cloneit() throws CloneNotSupportedException { id="X"; return this.clone(); }

	public void setId(String str){ id = str; }
	public String getId(){ return id; }

	public Object clone()throws CloneNotSupportedException{ return super.clone();}


}