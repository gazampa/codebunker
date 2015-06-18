package heuristic.search.b.packed;

import heuristic.search.SearchAlgorithm;
import heuristic.search.SearchResult;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;

/**
 * The A* class.
 * 
 * @author Matthew Hatem
 *
 * @param <T> the state type
 */
public final class Astar<T> implements SearchAlgorithm<T> {
  
  private HashSet<Long> closed = new HashSet<Long>();
  private PriorityQueue<Node> open = 
      new PriorityQueue<Node>(3, new NodeComparator());
  private List<T> path = new ArrayList<T>(3);
  private Domain<T> domain;
  private long expanded;
  private long generated;
  private T state;
  
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
    Node initNode = new Node (domain.h(init), null, 0, 0 -1, domain.pack(init));    
    open.add(initNode);
    while (!open.isEmpty() && path.isEmpty()) {  
      Node n = open.poll();
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
       
          T successor = domain.copy(state);
          Edge<T> edge = domain.apply(successor, op);      
          Node node = new Node(domain.h(successor), n, edge.cost, 
              edge.parentAction, domain.pack(successor));
          open.add(node);
      }
    }
    return new SearchResult<T>(path, expanded, generated);
  }
  
  /*
   * The node class
   */
  private final class Node {
    final int f, g, pop;
    final Node parent;
    final long packed;
    private Node (int h, Node parent, int cost, int pop, long packed) {
      this.g = (parent != null) ? parent.g+cost : cost;
      this.f = g + h;
      this.pop = pop;
      this.parent = parent;
      this.packed = packed;
    } 
  }
  
  /*
   * The node comparator class
   */
  private final class NodeComparator implements Comparator<Node> {
    public int compare(Node a, Node b) {
      if (a.f == b.f) { 
        if (a.g > b.g) return -1;
        if (a.g < b.g) return 1;
        return 0;
      }
      else {
        if (a.f < b.f) return -1;
        if (a.f > b.f) return 1;
        return 0;
      }
    }    
  }
  
}
