package org.gazampa.security;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.security.Security;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

	/** This example closely follows the example in David Cooks Beginning Cryptography with Java **/

public class College{

	public static void main(String[] args) throws Exception{

        char[] input = {'i','m',' ','i','n',' ','h','e','r','e'};

		byte[] inputAsBytes = charsToBytes(input);

		System.out.println("conve : " + Arrays.toString(bytesToChar(inputAsBytes)) );

		// Decide on using RSA tokens and use an external immplementation
		// internal implementation is SunRsaSign

		Security.addProvider( new BouncyCastleProvider() );

        KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA", "BC");

        generator.initialize(2048);

		// get rsa keys
		KeyPair  kp = generator.generateKeyPair();
		Key publicKey = kp.getPublic();

		// create an encryption key
        KeyGenerator gen = KeyGenerator.getInstance("AES", "BC");

        gen.init(256);

        Key encryptionKey = gen.generateKey();

		// secure the encryption key you are going to use with a public token

        SecureRandom random = SecureRandom.getInstanceStrong();

		IvParameterSpec ivSpec = createCtrIvForAES(0, random);

        Cipher keyCipher = Cipher.getInstance("RSA/NONE/OAEPWithSHA1AndMGF1Padding", "BC");

        keyCipher.init(Cipher.ENCRYPT_MODE, publicKey, random); // <======= secure AES key with public token

		// encrypt message using AES algorothm from bouncy castle

		IvParameterSpec sIvSpec = createCtrIvForAES(0, random);

        Cipher messageCipher = Cipher.getInstance("AES/CTR/NoPadding", "BC");

        messageCipher.init(Cipher.ENCRYPT_MODE, encryptionKey, sIvSpec); // <========= secure message with AES key

        byte[] keyBlock = keyCipher.doFinal(packKeyAndIv(encryptionKey, sIvSpec));

        byte[] cipherText = messageCipher.doFinal(inputAsBytes);

		// now you have two ciphers, the message, by bouncy castle AES, and, the encryption key, by bouncy castle RSA public token.
		// ==========> send both over your network

        System.out.println("keyBlock length  : " + keyBlock.length);
        System.out.println("cipherText length: " + cipherText.length);

		// d
		Key privateKey = kp.getPrivate();

		// find the encryption key wrapped by the public rsa token.
		Cipher dKeyCipher = Cipher.getInstance("RSA/NONE/OAEPWithSHA1AndMGF1Padding", "BC");

        dKeyCipher.init(Cipher.DECRYPT_MODE, privateKey);

        Object[] keyIv = unpackKeyAndIV(dKeyCipher.doFinal(keyBlock));

        // place this key into a cipher
		Cipher dMesageCipher = Cipher.getInstance("AES/CTR/NoPadding", "BC");

        dMesageCipher.init(Cipher.DECRYPT_MODE, (Key)keyIv[0], (IvParameterSpec)keyIv[1]);

        byte[] plainText = dMesageCipher.doFinal(cipherText);

        System.out.println("output : " + Arrays.toString(toChars(plainText)));

	}

	public static byte[] charsToBytes(char[] chars){
		CharBuffer charBuffer = CharBuffer.wrap(chars);
		ByteBuffer byteBuffer = StandardCharsets.UTF_8.encode(CharBuffer.wrap(chars));
		byte[] bytes = new byte[byteBuffer.remaining()];
		byteBuffer.get(bytes, 0, bytes.length);
		return bytes;
	}

	public static char[] bytesToChar(byte[] bytes){
		ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);
		CharBuffer charBuffer = StandardCharsets.UTF_8.decode(byteBuffer);
		char[] chars = new char[charBuffer.remaining()];
		charBuffer.get(chars, 0, chars.length);
		return chars;
	}

    public static char[] toChars( byte[] bytes)
    {
        System.out.println(bytes.length);

        char[]	chars = new char[bytes.length];

        System.out.println(chars.length);

        for (int i = 0, j = chars.length; i < j; i++)
        {
            chars[i] = (char)(bytes[i] & 0xff);
        }

        return chars;
    }

    public static byte[] toBytes( char[] chars)
    {
        byte[]	bytes = new byte[chars.length];

        for (int i = 0, j = chars.length; i < j; i++)
        {
        	bytes[i] = ( byte ) ( chars[i] );
        }

		System.out.println(Arrays.toString(bytes));

        return bytes;
    }

	public static byte[] stringToByte(String s){
		return s.getBytes(StandardCharsets.UTF_8);
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

    private static byte[] packKeyAndIv( Key key, IvParameterSpec ivSpec) throws Exception {

        ByteArrayOutputStream	bOut = new ByteArrayOutputStream();

        bOut.write(ivSpec.getIV());
        bOut.write(key.getEncoded());

        return bOut.toByteArray();
    }

    private static Object[] unpackKeyAndIV( byte[] data ) {

        byte[]    keyD = new byte[16];
        byte[]    iv = new byte[data.length - 16];

        return new Object[] {
             new SecretKeySpec(data, 16, data.length - 16, "AES"),
             new IvParameterSpec(data, 0, 16)
        };
    }

}