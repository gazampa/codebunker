package org.gazampa.soundex;

import java.util.ArrayList;
import org.gazampa.soundex.Singleton;

public class Client{

	public static void main(String[] args){

	    String searchField = new String("class");
	    String pattern = Singleton.SOUNDEX.getCodecVersion1_6().soundex(searchField);
		ArrayList<String> listOfTerms = new ArrayList<String>(); // make it a object with string fields
		listOfTerms.add("classs");listOfTerms.add("clazz");listOfTerms.add("something");listOfTerms.add("anotherthing");
		ArrayList<String> results = new ArrayList<String>();

		System.out.println("find terms similiar to " + searchField + " in the following list" + listOfTerms.toString());

		if (searchField!=null && searchField!="") {
		    try {
				for (String term : listOfTerms) {
					if (term != null) {
						String soundexWord = Singleton.SOUNDEX.getCodecVersion1_6().soundex(term);
						System.out.println(pattern + " : " + soundexWord);
						if (soundexWord.equals(pattern) ) {
							results.add(term);
						}
					}
				}

		    } catch ( Exception ex ) {
				System.out.println(ex.toString());
		    }
		}

		System.out.println(results.toString());

	}

}
