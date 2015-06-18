package heuristic.search.d.bucketheap;

import com.carrotsearch.hppc.ObjectArrayList;

/**
 * A bucket-heap implementation.
 *
 * @author Matthew Hatem
 */
final class BucketHeap {
  private int fill, min;
  private final Bucket[] buckets;

  static final class Node {
    final int f, g, pop;
    final Node parent;
    final long packed;
    Node (final int state_h, final Node parent, final int cost, 
        final int pop, final long state) {
      this.g = (parent != null) ? parent.g+cost : cost;
      this.f = g + state_h;
      this.pop = pop;
      this.parent = parent;
      packed = state;
    } 
  }
  
  BucketHeap(int size) {
    buckets = new Bucket[size];
  }
  
  void push(Node n) {
    int p0 = n.f;
    if (p0 < min) {
      min = p0;
    }
    Bucket bucket = buckets[p0];
    if (bucket == null) {
      bucket = new Bucket(buckets.length);
      buckets[p0] = bucket;
    }
    bucket.push(n, n.g);
    fill++;
  }
  
  Node pop() {
    for ( ; min < buckets.length; min++) {
      Bucket minBucket = buckets[min];
      if (minBucket != null && !minBucket.isEmpty()) break;
    }
    fill--;
    return buckets[min].pop();
  }
  
  boolean isEmpty() { 
    return fill == 0; 
  }

  @SuppressWarnings("rawtypes")
  private static final class Bucket {
    private int fill, max;
    private ObjectArrayList[] bins;
    
    Bucket(int size) {
      bins = new ObjectArrayList[size];
    }
    
    @SuppressWarnings("unchecked")
    private void push(Node n, int p) {
       if (p > max) {
        max = p; 
      }
      ObjectArrayList binP = bins[p];
      if (binP == null) {
        binP = new ObjectArrayList(10000);
        bins[p] = binP;
      }
      binP.add(n);
      fill++;
    }
    
    private Node pop() {
      for ( ; max > 0; max--) {
        ObjectArrayList maxBin = bins[max];
        if (maxBin != null && !maxBin.isEmpty()) break;
      }
      ObjectArrayList maxBin = bins[max];
      int last = maxBin.size()-1;
      Node n = (Node)maxBin.get(last);
      maxBin.remove(last);
      fill--;
      return n;
    }
    
    private boolean isEmpty() {
      return fill == 0;
    }
  }
}
