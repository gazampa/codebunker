package generic;

public class State{

    private String name;
    private String flower;

    State(){}

    public State(String name, String flower){
    	this.name=name;
    	this.flower=flower;
    }


    public String getName(){
		return name;
	}

    public String getFlower(){
		return flower;
	}

}
