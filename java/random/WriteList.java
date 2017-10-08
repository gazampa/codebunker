import java.io.*;
import java.util.Vector;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class WriteList{
	public void writeList() {

		PrintWriter out = null;
		ZipOutputStream zout = null;
		int SIZE = 10;
		Vector vector = new Vector(10);

		try {
			System.out.println("Entering try statement");
			zout = new ZipOutputStream(new BufferedOutputStream(
                        new FileOutputStream("C:/temp/audi/dmLists/pailist.zip")));

			out = new PrintWriter(new FileWriter("OutFile.txt"));

				for (int i = 0; i < SIZE; i++)
					out.println("Value at: " + i + " = "
								 + vector.elementAt(i));

		} catch (ArrayIndexOutOfBoundsException e) {
			 System.err.println("Caught "
						 + "ArrayIndexOutOfBoundsException: "
						 +   e.getMessage());

		} catch (IOException e) {
			 System.err.println("Caught IOException: "
								 +  e.getMessage());

		} finally {
			 if (zout!=null){
				try{
					zout.close();
				}catch(IOException e){
					System.out.println("Problem Closing Zip File"+e);
				}
			 }

			 if (out != null) {
				 System.out.println("Closing PrintWriter");
				 out.close();

			 }
			 else {
				 System.out.println("PrintWriter not open");
			 }
		 }
	}

}