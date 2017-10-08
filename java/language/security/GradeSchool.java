import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
public class GradeSchool{

	public static void main(String[] args) throws Exception{

		String input = "Im in here";
		String diff = "Im in here.---";

		byte[] bytes = input.getBytes(StandardCharsets.UTF_8);
		byte[] diffBytes = diff.getBytes(StandardCharsets.UTF_8);

		MessageDigest md = MessageDigest.getInstance("SHA1");
		MessageDigest md2 = MessageDigest.getInstance("SHA1");
		System.out.println( "algorithm : " + md.getAlgorithm() );

		md.update(bytes);

		md2.update(diffBytes);

		byte[] arr1 = md.digest();
		byte[] arr2 = md2.digest();

		System.out.println( md.getDigestLength() + " " + Arrays.toString( md.digest() ) );
		System.out.println( md2.getDigestLength() + " " + Arrays.toString( md2.digest() ) );

		System.out.println(md==md2);

		System.out.println( MessageDigest.isEqual( arr1, arr2 ) ); // <----

		System.out.println( Arrays.toString( bytesToChar(md.digest()) ) ); // <----

	}


	public static char[] bytesToChar(byte[] bytes){
		ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);
		CharBuffer charBuffer = StandardCharsets.UTF_8.decode(byteBuffer);
		char[] chars = new char[charBuffer.remaining()];
		charBuffer.get(chars, 0, chars.length);
		return chars;
	}



}