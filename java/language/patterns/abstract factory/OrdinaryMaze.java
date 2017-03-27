public class OrdinaryMaze implements Maze{

	private AbstractMazeFactory factory;

	public OrdinaryMaze(){}

	public OrdinaryMaze(AbstractMazeFactory f){
			factory = f;
	}

}