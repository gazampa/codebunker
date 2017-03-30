import java.util.regex.*;
class ZipCodeValidation{

	public static void main(String[] args){
		isZipValid("V5T 1Y9");
		isZipValid("45643");
		isZipValid("V5T4V1");
		isZipValid("V5T 4V1");
		isZipValid("45643 44435");
	}

	public static boolean isZipValid(String zip) {
		boolean valid = false;
		String zipCodePattern = "^([A-Z]\\d[A-Z]\\s*\\d[A-Z]\\d$)";

		valid = zip.matches(zipCodePattern);

		String msg = "NO MATCH: pattern:" + zip + "\r\n             regex: "
			+ zipCodePattern;

		if (valid) {
		  msg = "MATCH   : pattern:" + zip + "\r\n             regex: "
			  + zipCodePattern;
		}
		System.out.println(msg);
		return valid;
	}

}







/*
#Japanese postal codes
zipJP=^\d{3}-\d{4}$

#US postal codes
zipUS=^\d{5}\p{Punct}?\s?(?:\d{4})?$

#Dutch postal code
zipNL=^[0-9]{4}\s*[a-zA-Z]{2}$

#Argentinean postal code
zipAR=^\d{3}-\d{4}$

#Swedish postal code
zipSE=^(s-|S-){0,1}[0-9]{3}\s?[0-9]{2}$

#Canadian postal code
zipCA=^([A-Z]\d[A-Z]\s\d[A-Z]\d)$

#UK postal code
zipUK=^[a-zA-Z]{1,2}[0-9][0-9A-Za-z]{0,1} {0,1}[0-9][A-Za-z]{2}$


*/
