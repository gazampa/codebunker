package org.gazampa.readnriten;

import static java.nio.file.StandardOpenOption.*;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class NIOWritingExample {

  public static void main(String[] args) {

    // Create the set of options for appending to the file.
    Set<OpenOption> options = new HashSet<OpenOption>();
    options.add(APPEND);
    options.add(CREATE);

	String lf = System.getProperty("line.separator");

    // Convert the encoded string to bytes

    String s = "Four score and seven years ago our fathers brought forth on this continent. Four score and seven years ago our fathers brought forth on this continent, a new nation, conceived in Liberty, and dedicated to the proposition that all men are created equal." + lf + lf +

				"Now we are engaged in a great civil war, testing whether that nation, or any nation so conceived and so dedicated, can long endure. We are met on a great battle-field of that war. We have come to dedicate a portion of that field, as a final resting place for those who here gave their lives that that nation might live. It is altogether fitting and proper that we should do this." + lf + lf +

				"But, in a larger sense, we can not dedicate -- we can not consecrate -- we can not hallow -- this ground. The brave men, living and dead, who struggled here, have consecrated it, far above our poor power to add or detract. The world will little note, nor long remember what we say here, but it can never forget what they did here. It is for us the living, rather, to be dedicated here to the unfinished work which they who fought here have thus far so nobly advanced. It is rather for us to be here dedicated to the great task remaining before us -- that from these honored dead we take increased devotion to that cause for which they gave the last full measure of devotion -- that we here highly resolve that these dead shall not have died in vain -- that this nation, under God, shall have a new birth of freedom -- and that government of the people, by the people, for the people, shall not perish from the earth." + lf + lf +

				"Abraham Lincoln" + lf +
				"November 19, 1863";

    byte data[] = s.getBytes(StandardCharsets.UTF_8);

    // Create a buffer for these bytes - even though we are in memory - its better just to stream from memory
    ByteBuffer bb = ByteBuffer.wrap(data);

    Path file = Paths.get("./getty-address.log");

	// create channel
    try (SeekableByteChannel sbc = Files.newByteChannel(file, options)) {

    	sbc.write(bb);

    } catch (IOException x) {

    	System.out.println("Exception thrown: " + x);

    }

  }

}