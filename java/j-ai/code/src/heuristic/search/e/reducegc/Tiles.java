package heuristic.search.e.reducegc;

import heuristic.search.e.reducegc.Edge.Undo;
import heuristic.search.e.reducegc.Tiles.TileState;

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
    TileState s = new TileState();
    s.tiles = tiles;
    s.blank = blank;
    s.h = mdist(s.blank, s.tiles);
    return s;
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
    TileState copy = new TileState();
    System.arraycopy(state.tiles, 0, copy.tiles, 0, state.tiles.length);
    copy.blank = state.blank;
    copy.h = state.h;
    return copy;
  }  
  
  /* (non-Javadoc)
   * @see edu.unh.ai.search.Domain#apply(java.lang.Object,
   *  edu.unh.ai.search.Edge, int)
   */
  public void apply(TileState state, Edge<TileState> edge, int op) {
    edge.cost = 1;
    edge.action = op;
    edge.parentAction = state.blank;
    if (edge.undo == null) {
      edge.undo = new TileUndo(state.h, state.blank);
    } else {
      ((TileUndo)edge.undo).h = state.h;
      ((TileUndo)edge.undo).blank = state.blank;
    }
    int tile = state.tiles[op];
    state.tiles[state.blank] = tile;
    state.h += mdincr[tile][op][state.blank];
    state.blank = op;
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
  
  /* (non-Javadoc)
   * @see edu.unh.ai.search.Domain#pack(java.lang.Object)
   */
  public long pack(TileState s) {
    long word = 0;
    s.tiles[s.blank] = 0;
    for (int i = 0; i < Ntiles; i++) {
      word = (word << 4) | s.tiles[i];
    }
    return word;
  }

  /* (non-Javadoc)
   * @see edu.unh.ai.search.Domain#unpack(long, java.lang.Object)
   */
  public void unpack(long word, TileState dst) {
    dst.h = 0;
    dst.blank = -1;
    for (int i = Ntiles - 1; i >= 0; i--) {
      int t = (int) word & 0xF;
      word >>= 4;
      dst.tiles[i] = t;
      if (t == 0)
        dst.blank = i;
      else
        dst.h += md[t][i];
    }
  }
  
  /*
   * An instance of the undo interface.
   */
  private static final class TileUndo implements Undo<TileState> {
    int h, blank;
    public TileUndo(int h, int blank) {
      this.h = h;
      this.blank = blank;
    }
    
    /* (non-Javadoc)
     * @see edu.unh.ai.search.Edge.Undo#undo(java.lang.Object)
     */
    public void undo(TileState s) {
      s.h = this.h;
      s.tiles[s.blank] = s.tiles[this.blank];
      s.blank = this.blank;
    }
  }
  
  /*
   * The tile state class.
   */
  public static final class TileState {  
    int tiles[] = new int[16];
    int blank;
    int h;
  }
    
}
