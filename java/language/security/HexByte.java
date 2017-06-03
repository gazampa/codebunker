package org.gazampa.security;

import java.lang.StringBuffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.StandardCharsets;
import java.nio.charset.Charset;
import java.util.Arrays;
import javax.xml.bind.DatatypeConverter;

public class HexByte{

	public static void main(String[] args){

		byte[]          input = new byte[] {
				    0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07,
				    0x08, 0x09, 0x0a, 0x0b, 0x0c, 0x0d, 0x0e, 0x0f,
				    0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07,
				    (byte)0x88, (byte)0x99, (byte)0xaa, (byte)0xbb,
                	(byte)0xcc, (byte)0xdd, (byte)0xee, (byte)0xff, (byte)0xff };

		System.out.println(Arrays.toString(input));

		System.out.println(BytesToHex(input));

		String hexified = Hexify(input);

		System.out.println( hexified );

		System.out.println( Arrays.toString(HexToBytes(hexified)) );

		System.out.println( Arrays.toString(byteify(hexified)) );

		char[] chars = new char[]{'a','b','c','d','e'};
		System.out.println( Arrays.toString( chars ) );
		System.out.println( Arrays.toString( toChars( toBytes(chars) ) ) );

	}

	public static String Hexify(byte[] bytes){
		return DatatypeConverter.printHexBinary(bytes);
	}

	public static String BytesToHex(byte[] bytes){
		StringBuffer buffer = new StringBuffer();

		for ( int i =0, j = bytes.length; i < j; i++ ){
    		buffer.append(Character.forDigit((bytes[i] >> 4) & 0xF, 16)); // higher order 4 bits
    		buffer.append(Character.forDigit((bytes[i] & 0xF), 16)); // lower order 4 bits
		}

		return buffer.toString();

	}

	public static byte[] HexToBytes(String hexString){
		byte[] bytes = new byte[hexString.length()/2];

		for ( int i = 0, j = hexString.length(); i < j; i+=2 ){
			bytes[i/2] = ( byte ) ((Character.digit(hexString.charAt(i), 16) << 4)
                             + Character.digit(hexString.charAt(i+1), 16));
		}

		return bytes;
	}

	public static byte[] byteify(String hexString){
		    return DatatypeConverter.parseHexBinary(hexString);
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

    public static char[] toChars( byte[] bytes)
    {
        char[]	chars = new char[bytes.length];

        for (int i = 0, j = chars.length; i < j; i++)
        {
            chars[i] = (char)(bytes[i] & 0xff);
        }

        return chars;
    }

    public static String toString( byte[] bytes)
    {
        char[]	chars = new char[bytes.length];

        for (int i = 0, j = chars.length; i < j; i++)
        {
            chars[i] = (char)(bytes[i] & 0xff);
        }

        return new String(chars);
    }

    public static byte[] UTFtoBytes( char[] chars)
    {
        byte[]	bytes = new byte[chars.length << 1];

        for (int i = 0, j = chars.length; i < j; i++)
        {
            int bpos = i << 1;
            bytes[bpos] = ( byte ) (( chars[i] & 0xFF00)>>8);
        	bytes[bpos + 1] = ( byte ) ( chars[i] & 0x00FF);
        }

		System.out.println(Arrays.toString(bytes));

        return bytes;
    }

	public static String Stringify(byte[] bytes){
		return new String(bytes, StandardCharsets.UTF_8);
	}

	public static byte[] toByteArray(String s){
		return s.getBytes(StandardCharsets.UTF_8);
	}

	public static byte[] stringToBytesNIO(String str) {
		char[] chars = str.toCharArray();
		byte[] bytes = new byte[chars.length << 1];
		CharBuffer charBuffer = ByteBuffer.wrap(bytes).asCharBuffer();
		for(int i = 0; i < chars.length; i++){
			charBuffer.put(chars[i]);
		}
		return bytes;
	}

	public static String bytesToStringNIO(byte[] bytes) {
		CharBuffer charBuffer = ByteBuffer.wrap(bytes).asCharBuffer();
		return charBuffer.toString();
	}

	public static char[] bytesToChar(byte[] bytes){
		ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);
		CharBuffer charBuffer = StandardCharsets.UTF_8.decode(byteBuffer);
		char[] chars = new char[charBuffer.remaining()];
		chars = charBuffer.array();
		return chars;
	}

	public static byte[] charsToBytes(char[] chars){
		CharBuffer charBuffer = CharBuffer.wrap(chars);
		ByteBuffer byteBuffer = StandardCharsets.UTF_8.encode(CharBuffer.wrap(chars));
		byte[] bytes = new byte[byteBuffer.remaining()];
		bytes = byteBuffer.array();
		return bytes;
	}

	public static byte[] charsToBytesString(char[] chars){
		return new String(chars).getBytes(StandardCharsets.UTF_8);
	}

	public static byte[] ASCIIToBytes(String s) {
		byte[] b = new byte[s.length()];
		for (int i = 0; i < b.length; i++) {
			b[i] = (byte) s.charAt(i);
		}
		return b;
	}

}