package heuristic.search.e.reducegc;

/**
 * The edge class.
 * 
 * @author Matthew Hatem
 *
 * @param <T>
 */
public class Edge<T> {
  
  /**
   * The action used to generate the resulting state.
   */
  public int action;   
  
  /**
   * The action used to generate the originating state.
   */
  public int parentAction;  
  
  /**
   * The cost of traversing this edge.
   */
  public int cost; 
  
  /**
   * The undo instance used to regenerate the originating state.
   */
  public Undo<T> undo;
  
  /**
   * The constructor.
   * 
   * @param cost the cost of traversing this edge
   * @param action the action used to generate the resulting state
   * @param parentAction the action used to generate the originating state
   */
  public Edge(int cost, int action, int parentAction) { 
      this(cost, action, parentAction, null);
  }
  
  /**
   * The constructor.
   * 
   * @param cost the cost of traversing this edge
   * @param action the action used to generate the resulting state
   * @param parentAction the action used to generate the originating state
   * @param undo the undo instance used to regenerate the originating state
   */
  public Edge(int cost, int action, int parentAction, Undo<T> undo) { 
    this.cost = cost;
    this.action = action;
    this.parentAction = parentAction;
    this.undo = undo;
  }
  
  /**
   * Regenerates the originating state for this edge.
   * 
   * @param state the state
   */
  public void undo(T state) {
    undo.undo(state);
  }
  
  /**
   * The undo interface.
   *
   * @param <T> the state type
   */
  public interface Undo<T> {
    public void undo(T state);
  }
  
}
