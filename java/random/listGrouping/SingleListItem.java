public class SingleListItem{
	String name;
	String group;

	public SingleListItem(String name, String group){
		this.name = name;
		this.group = group;
	}

	private void setName(String name){
		name = name;
	}

	public String getName(){
		return name;
	}

	private void setGroup(String group){
		group = group;
	}

	public String getGroup(){
		return group;
	}

}
