import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CitrixParser{

	public static void main(String[] args){

	try{
		FileInputStream fis = new FileInputStream("input.json");
    	BufferedReader reader = new BufferedReader( new InputStreamReader(fis) );
    	String line = reader.readLine();
		String[] lines = line.split("email");

		for (String li : lines){
    		System.out.println(li);
		}


	}catch(FileNotFoundException fie){
		System.out.println("unable to find file : " + fie);
    }catch (IOException exception) {
    	exception.printStackTrace();
	}


	}

}