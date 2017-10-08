package org.gazampa.readnritn;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

class NIOReadingExample{

	public static void main(String[] args){

		// specify a path on the system to the file you are interested in
		Path path = FileSystems.getDefault().getPath("C:\\Users\\Public\\", "ntuser.dat");

		// create a channel
		try (SeekableByteChannel sbc = Files.newByteChannel( path, StandardOpenOption.READ ) ) {

		    // create a buffer to read the files contents into
		    ByteBuffer buf = ByteBuffer.allocate(10);

		    String encoding = System.getProperty("file.encoding");

			System.out.println(encoding);

			// read the file and print it out to the console as you go
		    while (sbc.read(buf) > 0) {

				buf.rewind();

				System.out.print(Charset.forName(encoding).decode(buf));

				buf.flip();

			}

		} catch (IOException x) {

			System.out.println("caught exception: " + x);

		}
	}

}