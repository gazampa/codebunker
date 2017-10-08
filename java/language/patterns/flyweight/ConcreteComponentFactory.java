import java.util.ArrayList;
import java.util.List;
public class ConcreteComponentFactory{

	List<ConcreteComponent> list = new ArrayList<ConcreteComponent>();

	public Component getComponentWithState(String state){

		for (ConcreteComponent component : list){
			if ( component.getIntrinsicState().equals(state ) ){
				return component;
			}
		}

		ConcreteComponent newComponent = new ConcreteComponent(state);
		list.add(newComponent);
		return newComponent;
	}

	public int getTotalConcreteStates(){
		return list.size();
	}

}