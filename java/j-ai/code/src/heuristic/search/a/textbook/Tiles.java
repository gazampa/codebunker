package heuristic.search.a.textbook;

import heuristic.search.a.textbook.Tiles.TileState;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * The tiles domain class.
 * 
 * @author Matthew Hatem
 *
 */
public final class Tiles implements Domain<TileState> {
  
  private static final int width = 4;
  private static final int height = 4;
  private static final int Ntiles = width * height;
  private static int init[] = new int[Ntiles];
  private static int md[][] = new int[Ntiles][Ntiles];
  static int mdincr[][][] = new int[Ntiles][Ntiles][Ntiles];    
  private static int optab_n[] = new int[Ntiles]; 
  private static int optab_ops[][] = new int[Ntiles][4]; 
    
  /**
   * The constructor reads a tiles problem instance from the specified
   * input stream.
   * 
   * @param stream the input stream
   */
  public Tiles(InputStream stream) {
    try {
      BufferedReader reader = new BufferedReader(
          new InputStreamReader(stream));
      String line = reader.readLine();
      
      String dim[] = line.split(" ");
      /*width =*/ Integer.parseInt(dim[0]);
      /*height =*/ Integer.parseInt(dim[0]);
      
      line = reader.readLine(); 
      for (int t = 0; t < Ntiles; t++) {
        int p = Integer.parseInt(reader.readLine());
        init[p] = t;
      }
      
      line = reader.readLine(); 
      for (int t = 0; t < Ntiles; t++) {
        int p = Integer.parseInt(reader.readLine());
        if (p != t)
          throw new IllegalArgumentException("Non-canonical goal positions");
      }
    }
    catch (IOException exception) {
      exception.printStackTrace();
    }

    initmd();
    initoptab();
  }
  
  /* (non-Javadoc)
   * @see edu.unh.ai.search.Domain#initial()
   */
  public TileState initial() {
    int blank = -1;
    int tiles[] = new int[Ntiles];
    for (int i = 0; i < Ntiles; i++) {
        if (init[i] == 0)
            blank = i;
        tiles[i] = init[i];
    }
    if (blank < 0)
        throw new IllegalArgumentException("No blank tile");
    return new TileState(tiles, blank, mdist(blank, tiles));
  }
  
  /* (non-Javadoc)
   * @see edu.unh.ai.search.Domain#h(java.lang.Object)
   */
  public int h(TileState s) {
    return s.h;
  }
  
  /* (non-Javadoc)
   * @see edu.unh.ai.search.Domain#isGoal(java.lang.Object)
   */
  public boolean isGoal(TileState state) {
    return state.h == 0;
  }
  
  /* (non-Javadoc)
   * @see edu.unh.ai.search.Domain#nops(java.lang.Object)
   */
  public int numActions(TileState state) {
    return optab_n[state.blank];
  }

  /* (non-Javadoc)
   * @see edu.unh.ai.search.Domain#nthop(java.lang.Object, int)
   */
  public int nthAction(TileState state, int n) {
    return optab_ops[state.blank][n];
  }
  
  /* (non-Javadoc)
   * @see edu.unh.ai.search.Domain#copy(java.lang.Object)
   */
  public TileState copy(TileState state) {
    return new TileState(state.tiles, state.blank, state.h);
  }  
  
  /* (non-Javadoc)
   * @see edu.unh.ai.search.Domain#apply(java.lang.Object, int)
   */
  public Edge<TileState> apply(TileState state, int op) {
    Edge<TileState> edge = new Edge<TileState>(1, op, state.blank);
    int tile = state.tiles[op];
    state.tiles[state.blank] = tile;
    state.h += mdincr[tile][op][state.blank];
    state.blank = op;
    return edge;
  }
   
  /*
   * Computes the Manhattan distance for the specified blank and tile
   * configuration.
   */
  private int mdist(int blank, int tiles[]) {
    int sum = 0;
    for (int i = 0; i < Ntiles; i++) {
      if (i == blank)
        continue;
      int row = i / width, col = i % width;
      int grow = tiles[i] / width, gcol = tiles[i] % width;
      sum += Math.abs(gcol - col) + Math.abs(grow - row);
    }
    return sum;
  }

  /*
   * Initializes the Manhattan distance heuristic table.
   */
  private void initmd() {
    for (int t = 1; t < Ntiles; t++) {
      int grow = t / width, gcol = t % width;
        for (int l = 0; l < Ntiles; l++) {
          int row = l / width, col = l % width;
          md[t][l] = Math.abs(col - gcol) + Math.abs(row - grow);
        }
    }
    for (int t = 1; t < Ntiles; t++) {
      for (int d = 0; d < Ntiles; d++) {
        int newmd = md[t][d];
        for (int s = 0; s < Ntiles; s++)
          mdincr[t][d][s] = -100; // some invalid value.                 
        if (d >= width)
          mdincr[t][d][d - width] = md[t][d - width] - newmd;
        if (d % width > 0)
          mdincr[t][d][d - 1] = md[t][d - 1] - newmd;
        if (d % width < width - 1)
          mdincr[t][d][d + 1] = md[t][d + 1] - newmd;
        if (d < Ntiles - width)
          mdincr[t][d][d + width] = md[t][d + width] - newmd;
      }
    }
  }
  
  /*
   * Initializes the pre-computed operator table.
   */
  private void initoptab() {
    for (int i = 0; i < Ntiles; i++) {
      optab_n[i] = 0;
      if (i >= width)
              optab_ops[i][optab_n[i]++] =  i - width;
      if (i % width > 0)
              optab_ops[i][optab_n[i]++] =  i - 1;
      if (i % width < width - 1)
              optab_ops[i][optab_n[i]++] =  i + 1;
      if (i < Ntiles - width)
              optab_ops[i][optab_n[i]++] =  i + width;
      assert (optab_n[i] <= 4);
    }
  }
  
  /*
   * The tile state class.
   */
  public static final class TileState {  
    int tiles[];
    int blank;
    int h;
    
    public TileState(int[] tiles, int blank, int h) {
      this.tiles = new int[tiles.length];
      System.arraycopy(tiles, 0, this.tiles, 0, tiles.length);
      this.blank = blank;
      this.h = h;
    }

    public boolean equals(Object obj) {
      if (blank != ((TileState)obj).blank)
        return false;
      for (int i = 0; i < Ntiles; i++) {
        if (i != blank && tiles[i] != ((TileState)obj).tiles[i])
          return false;
      }
      return true;

    }

    public int hashCode() {
      tiles[(int) blank] = 0;
      int h = tiles[0];
      for (int i = 1; i < Ntiles; i++)
        h = h * 3 + tiles[i];
      return h;
    }
    
    
  }
    
}
