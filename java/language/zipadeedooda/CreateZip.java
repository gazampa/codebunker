import java.io.*;
import java.util.zip.*;
import java.util.HashSet;

public class CreateZip{
	public static void main(String args[]){
	//Collect file names to be zipped in an array by command line arguments.

	String[] filesToZip = {"C:\\jboss-4.0.2\\bin\\1025214.txt", "C:\\jboss-4.0.2\\bin\\1025215.txt","C:\\jboss-4.0.2\\bin\\1025216.txt"};
	// Create a buffer for reading the files
	byte[] buffer = new byte[1024];

	HashSet<String> fileList = new HashSet<String>();


	for(int i=0;i<filesToZip.length;i++){
		fileList.add(filesToZip[i]);
	}


	try {
		// Specify the location of the zippedfile to be stored.
		String zip = "C:\\jboss-4.0.2\\bin\\paiList.zip";
		//Creates a new ZIP output stream.
		ZipOutputStream out = new ZipOutputStream(new FileOutputStream(zip));
		// Compress the files
        for (String file : fileList) {
            FileInputStream fileToZip = new FileInputStream(file);
            out.putNextEntry(new ZipEntry(file));
            int len = 0;
            while ((len = fileToZip.read(buffer)) > 0) {
                out.write(buffer, 0, len);
            }
            out.closeEntry();
        }
        out.close();
		// Closes this output stream and releases any system resource
		//associated with the stream.
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	}
}