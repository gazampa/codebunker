package org.gazampa.soundex;

import java.util.ArrayList;
import org.gazampa.soundex.Singleton;

 /**	https://en.wikipedia.org/wiki/Soundex
		https://commons.apache.org/proper/commons-codec/apidocs/src-html/org/apache/commons/codec/language/Soundex.html

 	Soundex is a phonetic algorithm for indexing names by sound, as pronounced
 	in English. Soundex was developed by Robert C. Russell and Margaret
 	King[8] Odell and patented in 1918[9] and 1922.	The Soundex code for a name
 	consists of a letter followed by three numerical digits: the letter is the
 	first letter of the name, and the digits encode the remaining consonants.
 	Consonants at a similar place of articulation share the same digit so, for
 	example, the labial consonants B, F, P, and V are each encoded as the
 	number 1.

 **/


public class Client{

	public static void main(String[] args){

	    String searchField = new String("class");
	    String pattern = Singleton.SOUNDEX.getCodecVersion1_6().soundex(searchField);
		ArrayList<String> listOfTerms = new ArrayList<String>(); // make it a object with string fields
		listOfTerms.add("classs");listOfTerms.add("clazz");listOfTerms.add("klass");listOfTerms.add("something");listOfTerms.add("anotherthing");
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
