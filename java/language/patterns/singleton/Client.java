public class Client{

	public static void main(String[] args){

		/** instantiate numbers **/

		BlochSingleton.NUMBERS.countTo9();

		int[] clientsNumbers = BlochSingleton.NUMBERS.getNumbers();

		clientsNumbers[5] = 50000;

		BlochSingleton.NUMBERS.countTo9();


	}

}