package heuristic.search.e.reducegc;

import heuristic.search.SearchAlgorithm;
import heuristic.search.SearchResult;
import heuristic.search.e.reducegc.Tiles.TileState;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * The tile solver class.
 * 
 * @author Matthew Hatem
 *
 */
public class TileSolver {

  /**
   * The main entry point for the tile solver.
   * 
   * @param args
   */
  public static void main(String[] args) {    
    Tiles tiles = null;
    
    // parse the problem instance
    if (args.length > 0) {
      try {
        tiles = new Tiles(new FileInputStream(new File(args[0])));
      } catch (FileNotFoundException e) {
        e.printStackTrace();
      }
    }
    else {
      tiles = new Tiles(System.in);
    }
      
    long t = 0L, td = 0L;
    SearchResult<TileState> result = null;
    SearchAlgorithm<TileState> algo =
        new Astar<TileState>(tiles);
      
  	t = System.currentTimeMillis();
  	result = algo.search(tiles.initial());
  	td = System.currentTimeMillis();
        
    result.setInitialH(tiles.h(tiles.initial()));
    result.setStartTime(t);
    result.setEndTime(td);
    
    System.out.println(result);
  }

}
