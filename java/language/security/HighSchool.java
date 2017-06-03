package org.gazampa.security;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.security.Security;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.KeyGenerator;
import javax.xml.bind.DatatypeConverter;

public class HighSchool{

	public static void main(String[] args) throws Exception{

        String input = "im in here";

        System.out.println("input : " + input);

		// decide to follow the AES standard of encryption

        KeyGenerator generator = KeyGenerator.getInstance("AES");

        generator.init(256); // uses instancestrong for securerandom as default

        Key key = generator.generateKey();

		// encasulation class for performing mathematical operation on message, the logic that jumbles up the bits
        Cipher          cipher = Cipher.getInstance("AES/CTR/NoPadding");

        MessageDigest   hash = MessageDigest.getInstance("SHA1"); // verification hash

		// e

        SecureRandom random = SecureRandom.getInstanceStrong();

		IvParameterSpec ivSpec = createCtrIvForAES(0, random);

        cipher.init(Cipher.ENCRYPT_MODE, key, ivSpec);

        byte[] cipherText = new byte[cipher.getOutputSize(input.length() + hash.getDigestLength())];

        int ctLength = cipher.update(input.getBytes(StandardCharsets.UTF_8), 0, input.length(), cipherText, 0);

        hash.update(input.getBytes(StandardCharsets.UTF_8));

        ctLength += cipher.doFinal(hash.digest(), 0, hash.getDigestLength(), cipherText, ctLength);

		System.out.println("cipher : " + Arrays.toString(cipherText));

		// d

        cipher.init(Cipher.DECRYPT_MODE, key, ivSpec);

        byte[] plainText = cipher.doFinal(cipherText, 0, ctLength);

        int messageLength = plainText.length - hash.getDigestLength();

        hash.update(plainText, 0, messageLength);

        byte[] messageHash = new byte[hash.getDigestLength()];

        System.arraycopy(plainText, messageLength, messageHash, 0, messageHash.length);

        System.out.println("output : " + Stringify(plainText, 0, messageLength) + " verified: " + MessageDigest.isEqual(hash.digest(), messageHash));

	}

	public static String Stringify(byte[] bytes, int from, int to){
		return new String(Arrays.copyOfRange(bytes, from, to), StandardCharsets.UTF_8);
	}

	/** Beginning Cryptography with Java...David Hook **/

    /**
     * Create an IV suitable for using with AES in CTR mode.
     * <p>
     * The IV will be composed of 4 bytes of message number,
     * 4 bytes of random data, and a counter of 8 bytes.
     *
     * @param messageNumber the number of the message.
     * @param random a source of randomness
     * @return an initialised IvParameterSpec
    */
    public static IvParameterSpec createCtrIvForAES(
        int             messageNumber,
        SecureRandom    random)
    {
        byte[]          ivBytes = new byte[16];

        // initially randomize

        random.nextBytes(ivBytes);

        // set the message number bytes

        ivBytes[0] = (byte)(messageNumber >> 24);
        ivBytes[1] = (byte)(messageNumber >> 16);
        ivBytes[2] = (byte)(messageNumber >> 8);
        ivBytes[3] = (byte)(messageNumber >> 0);

        // set the counter bytes to 1

        for (int i = 0; i != 7; i++)
        {
            ivBytes[8 + i] = 0;
        }

        ivBytes[15] = 1;

        return new IvParameterSpec(ivBytes);
    }

	/**
     * Convert a byte array of 8 bit characters into a String.
     *
     * @param bytes the array containing the characters
     * @param length the number of bytes to process
     * @return a String representation of bytes
    */
    public static String toString(
        byte[] bytes,
        int    length)
    {
        char[]	chars = new char[length];

        for (int i = 0; i != chars.length; i++)
        {
            chars[i] = (char)(bytes[i] & 0xff);
        }

        return new String(chars);
    }

}