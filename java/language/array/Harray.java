package array;
import java.io.ByteArrayOutputStream;

public class Harray{

	public static void main(String[] args){

		ByteArrayOutputStream output = new ByteArrayOutputStream();

		String aString = "This text is converted to bytes";

		try{

		output.write("This text is converted to bytes".getBytes("UTF-8"));

		byte[] bytes = output.toByteArray();

		System.out.println(bytes.length);

		System.out.println(aString.length());

		for ( int i = 0 , j=bytes.length; i < j; i++ ){
			int val = bytes[i];
			System.out.println(val);

		}


	}catch(Exception e){
		System.out.println("bother");
	}


	}
}