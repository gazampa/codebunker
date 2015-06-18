
import java.util.Scanner;

import trustwave.barista.validator.*;

public class RegularExpressionTest {

	public static void main(String[] args){

		/**Load Scanner To Read Input**/
		Scanner scanner = new Scanner(System.in);
		String input = new String();

		/** Load a Validator for the User Input
		** "^[RrQq1-6]$" Load Input Validator.
		**/
		Validator validator = new RegularExpressionValidator("^[RrQq1-6]$");

		/**
			Application Loop
		**/
		while ( !"Q".equalsIgnoreCase(input) ){

			input = scanner.next();

			if ( null!=input ){
				char[] commands = input.toCharArray();
				StringBuilder sbSuccess = new StringBuilder();
				StringBuilder sbFailed = new StringBuilder();
				for ( int i = 0;i<commands.length;i++){
					char command = commands[i];
					if ( validator.validate(String.valueOf(command)) ) {
						sbSuccess.append(command);
					}else{
						sbFailed.append(command);
					}
				}
				System.out.println("Succesful Commands : " + sbSuccess.toString() );
				System.out.println("Failed Commands : " + sbFailed.toString() );
			}
		}
	}

}