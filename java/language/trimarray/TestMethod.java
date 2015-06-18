package arraytrim;

public class TestMethod{

	public static void main(String[] args){
		String testString = new String("a b c d e f g");
		char[] arrayC = testString.toCharArray();
		char[] arrayC_trim = trimArray(arrayC);

		for (char ch : arrayC_trim){
			log(ch);
		}

	}

	public static char[] trimArray(char[] cArr){
		int intWhiteSpace = 0;
		int szArr = 0;
		int arrIdx = 0;

		for (int i = 0; i<cArr.length; i++){
			if (' '==cArr[i]){
				intWhiteSpace++;
			}
		}

		szArr = cArr.length - intWhiteSpace;

		char[] cArrTrim = new char[szArr];

		for ( int i = 0; i < cArr.length; i++ ){
			char tmp = cArr[i];
			if (' ' != tmp && arrIdx < cArrTrim.length){
				cArrTrim[arrIdx] = cArr[i];
				arrIdx++;
			}
		}
		return cArrTrim;
	}

	public static void log(Object param){
		System.out.print(param);
	}

}