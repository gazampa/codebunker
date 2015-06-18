package heuristic.search.e.reducegc;

import heuristic.search.SearchAlgorithm;
import heuristic.search.SearchResult;
import heuristic.search.e.reducegc.BucketHeap.Node;

import java.util.ArrayList;
import java.util.List;

import com.carrotsearch.hppc.LongOpenHashSet;

/**
 * The A* (bucket heap) class.
 * 
 * @author Matthew Hatem
 *
 * @param <T> the state type
 */
public final class Astar<T> implements SearchAlgorithm<T> {
  
  private LongOpenHashSet closed = new LongOpenHashSet();
  private BucketHeap open = new BucketHeap(100);
  private List<T> path = new ArrayList<T>(3);
  private Domain<T> domain;
  private long expanded;
  private long generated;
  private T state;
  private Edge<T> edge;
  
  /**
   * The constructor.
   * 
   * @param domain the search domain
   */
  public Astar(Domain<T> domain) {
    this.domain = domain;
  }
  
  /* (non-Javadoc)
   * @see edu.unh.ai.search.SearchAlgorithm#search(java.lang.Object)
   */
  public SearchResult<T> search(T init) {
    state = init;
    edge = new Edge<T>(0, -1, -1);
    
    Node initNode = new Node (domain.h(init), null, 0, 0 -1, domain.pack(init));    
    open.push(initNode);
    while (!open.isEmpty() && path.isEmpty()) {  
      Node n = open.pop();
      if (closed.contains(n.packed)) {
        continue;
      }

      domain.unpack(n.packed, state);
      if (domain.isGoal(state)) {
        for (Node p = n; p != null; p = p.parent) {
          domain.unpack(p.packed, state);
          path.add(state);
        }
        break;
      }
      closed.add(n.packed);

      expanded++;
      for (int i = 0; i < domain.numActions(state); i++) {
        int op = domain.nthAction(state, i);
        if (op == n.pop) {
          continue;
        }
        generated++;
        domain.apply(state, edge, op);
        Node node = new Node(domain.h(state), n, edge.cost, 
            edge.parentAction, domain.pack(state));
        open.push(node);
        edge.undo(state);
      }
    }
    
    return new SearchResult<T>(path, expanded, generated);
  }
    
}
