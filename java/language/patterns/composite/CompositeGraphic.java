import java.util.List;
import java.util.ArrayList;

public class CompositeGraphic implements Graphic{

	private List<Graphic> listOfGraphics = new ArrayList<Graphic>();

	public void print(){
		for ( Graphic graphic : listOfGraphics ){
			graphic.print();
		}
	}

	public void add(Graphic graphic){
		listOfGraphics.add(graphic);
	}

	public void remove(Graphic graphic){
		listOfGraphics.remove(graphic);
	}

}