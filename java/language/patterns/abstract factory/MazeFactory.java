class MazeFactory extends AbstractMazeFactory{

	public MazeFactory(){}

	public Maze makeMaze(){ return new OrdinaryMaze(); }

	public Room makeRoom(){ return new OrdinaryRoom(); }

}