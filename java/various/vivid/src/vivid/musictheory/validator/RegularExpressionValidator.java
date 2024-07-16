package vivid.musictheory.validator;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegularExpressionValidator implements Validator{

	private static String REGEX = "";

	public RegularExpressionValidator(){}

	public RegularExpressionValidator(String param){
		REGEX = param;
	}
	
	public boolean validate(String param){
		boolean result = false;
		String input = new String(param);
		Pattern pattern = Pattern.compile(REGEX);
		Matcher matcher = pattern.matcher(input);
		if ( matcher.find() ){
			result = true;
		}
		return result;
	}

}