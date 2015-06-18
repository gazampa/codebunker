/**
*
* For a given input, a musical chord, output the notes involved in making that chord
*  - a chord is a sequence of notes in a scale  
*  - the sequence is determined by a starting key and, 
*  - a sequence of intervals known as tones and semitones
*  - tones increment 2 steps in a scale, semitones increment one step
*  - the array of all available notes is contained in the lookup array pitch.Notes
*  - A Major/Minor Scale contain a base of Eight Notes, upwards of 8 the notes recycle in a higher octave 
*
*	This solution tries to build the notes of the chord using : key + scale interals + extension.
*
**/

import java.util.Scanner;

import vivid.musictheory.scales.Chord;
import vivid.musictheory.scales.Major;
import vivid.musictheory.scales.MajorNinth;
import vivid.musictheory.scales.MajorSeventh;
import vivid.musictheory.scales.Minor;
import vivid.musictheory.scales.MinorNinth;
import vivid.musictheory.scales.MinorSeventh;
import vivid.musictheory.validator.RegularExpressionValidator;
import vivid.musictheory.validator.Validator;

public class MakeMusic{

	public static void main(String[] args){
	
		/** Scanner is a console implementation that reads input from the user **/
		Scanner scanner = new Scanner(System.in);
		String input = new String();		
		/**
			Application Loop - read input make decision, call logic
		**/
		System.out.println(  );		
		System.out.println("#################### Music Theory Challange - Billy Murphy ####################"  );		
		System.out.println(  );	
		System.out.println( "Steve, Please enter a chord in the format [ AMajor/Minor(7/9) ] " );
		System.out.println( "No Spaces !!!, Its a bit fragile and only the above format currently works ! " );
		System.out.println( "press q to quit " );
		
		/** I could not find a good regular expression to fit the input for musical chords that worked well with this application...
		 * 		Validator validator = new RegularExpressionValidator("^[AaBbCcDdEeFfGg]$");
		 */
		
		while ( !"Q".equalsIgnoreCase(input)){
			input = scanner.next();
			if ("Q".equalsIgnoreCase(input)){break;}

			String key = new String();
			String scale = new String();
			String extension = new String();			
			Chord chord = null;
			if ( null!=input ){			// [ A-G, M, a, j, o, r, 7 ]
				// Fall through Logic
				// get key
				key = input.substring(0,1); // [ A-G, , ...]
				//get extension			
				if (input.contains("7")){
					extension = "7";
				}
				if (input.contains("9")){
					extension = "9";
				}
				// get scale
				if (input.toLowerCase().contains("maj")){
					scale = "major";
					if (extension=="7"){
						chord = new MajorSeventh(key);
					}else if(extension=="9"){
						chord = new MajorNinth(key);
					}else{
						chord = new Major(key);
					}
				}
				if (input.toLowerCase().contains("min")){
					scale = "minor";
					if (extension=="7"){
						chord = new MinorSeventh(key);
					}else if(extension=="9"){
						chord = new MinorNinth(key);
					}else{
						chord = new Minor(key);
					}
				}
				
				System.out.println( key+scale+extension );	
				
				if (chord!=null){
					System.out.println(" notes in chord " + chord);
				}else{
					System.out.println(" Sorry Steve,  I couldnt find that chord");
					System.out.println(" Try entering with the Format [ AMajor/Minor(7/9) ]");
					System.out.println(" And, I currently only do those chords... ");					
				}
			}

		}
		if ("Q".equalsIgnoreCase(input)){System.out.println("exiting application");}
	}

}

/** 			Use to Test output
				Chord major = new Major(key);
				Chord majorSeventh = new MajorSeventh(key);
				Chord majorNinth = new MajorNinth(key);
				Chord minor = new Minor(key);
				Chord minorSeventh = new MinorSeventh(key);
				Chord minorNinth = new MinorNinth(key);				
				// print chord
				System.out.println(" Major " + major);
				System.out.println(" Major Seventh " + majorSeventh);
				System.out.println(" Major Ninth " + majorNinth);
				System.out.println(" Minor " + minor);
				System.out.println(" Minor Seventh " + minorSeventh);
				System.out.println(" Minor Ninth" + minorNinth);

**/