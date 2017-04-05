import java.math.BigInteger;

public class IllFactorialYou{


	public static void main(String[] args){

	double fact = 170;
	double max = new Double("1.7976931348623157E308");
	BigInteger big = new BigInteger("1003");
	//Iterative Factorial

	//for (double i = fact ;i>0;i-- ){
	//	if ( (i-1)!=0 ){
	//		fact = fact*(i-1);
	//	}
	//}

	//System.out.println("Answer : " + fact );

	//Recurse that mother

	System.out.println("Answer :: "+ IllFactorialYou.factorial(big) );

	}

	public static double factorial(double n){

		if (n<=0)
			return 1;

		return n * factorial(n-1);

	}

	public static double factorial(int n){

		return factorial(new Integer(n).doubleValue());

	}

	public static BigInteger factorial(BigInteger big){
		if ( big.compareTo( BigInteger.ZERO )!=1 )
			return BigInteger.ONE;

		return big.multiply( factorial(big.subtract(BigInteger.ONE)) );
	}

}