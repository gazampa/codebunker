public class MazeGame{

	public static void main(String[] args){

		AbstractMazeFactory mazeFactory = new MazeFactory();
		Maze maze = mazeFactory.makeMaze();
		Room room1 = mazeFactory.makeRoom();
		Room room2 = mazeFactory.makeRoom();

	}

}