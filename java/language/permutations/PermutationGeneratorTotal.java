import java.math.BigInteger;

public class PermutationGeneratorTotal {

  private int[] a;
  private BigInteger numLeft;
  private BigInteger total;

  //-----------------------------------------------------------
  // Constructor. WARNING: Don't make n too large.
  // Recall that the number of permutations is n!
  // which can be very large, even when n is as small as 20 --
  // 20! = 2,432,902,008,176,640,000 and
  // 21! is too big to fit into a Java long, which is
  // why we use BigInteger instead.
  //----------------------------------------------------------

  public PermutationGeneratorTotal (int n) {
    if (n < 1) {
      throw new IllegalArgumentException ("Min 1");
    }
    a = new int[n];
    total = getFactorial (n);
    reset ();
    System.out.println("The number of Permutations is "+total+".");
    System.out.println("Size "+a.length);
  }

  //------------------
  // Compute factorial
  //------------------
  private static BigInteger getFactorial (int n) {
    BigInteger fact = BigInteger.ONE;
    for (int i = n; i > 1; i--) {
      fact = fact.multiply (new BigInteger (Integer.toString (i)));
    }
    return fact;
  }

  //------
  // Reset
  //------
  public void reset () {
	for (int i = 0; i < a.length; i++) {
		a[i] = i;
	}
	numLeft = new BigInteger (total.toString ());
  }

  public boolean hasMore () {
    return numLeft.compareTo (BigInteger.ZERO) == 1;
  }

  public int[] getNext () {
	//System.out.println(a[0]+","+a[1]+","+a[2]+","+a[3]);
    if (numLeft.equals (total)) {
      numLeft = numLeft.subtract (BigInteger.ONE);
      return a;
    }

	int temp;

	// Find largest index j with a[j] < a[j+1]

	int j = a.length - 2;
	while (a[j] > a[j+1]) {
	  j--;
	}
	//System.out.println("a[j] " + a[j]);

    int k = a.length - 1;
    while (a[j] > a[k]) {
      k--;
    }
	//System.out.println("a[k] " + a[k]);

	temp = a[k];
	a[k] = a[j];
	a[j] = temp;

	//System.out.println("After jk Switch " + a[0]+","+a[1]+","+a[2]+","+a[3]);

    int r = a.length - 1;
    int s = j + 1;

    while (r > s) {
      temp = a[s];
      a[s] = a[r];
      a[r] = temp;
      r--;
      s++;
    }

	//System.out.println("After j ("+j+") ascending order switch " + a[0]+","+a[1]+","+a[2]+","+a[3]);

    numLeft = numLeft.subtract (BigInteger.ONE);
	return a;
  }

	public static void main(String[] args){
		int[] indices;
		String[] elements = {"S", "A", "L", "E", "S", "F", "O", "R", "C", "E"};
		StringBuffer permutation=null;
		PermutationGeneratorTotal x = new PermutationGeneratorTotal(elements.length);

		while (x.hasMore ()) {
		  permutation = new StringBuffer ();
		  indices = x.getNext ();
		  for (int i = 0; i < indices.length; i++) {
			permutation.append(elements[indices[i]]);
		  }
		System.out.println(permutation.toString());
		}

	}


}