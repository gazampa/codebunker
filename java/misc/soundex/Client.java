package org.gazampa.soundex;

import java.util.ArrayList;
import java.util.LinkedHashSet;
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

	use with StringEncoderComparator

 **/

public class Client{

	public static void main(String[] args){

	    String searchField = new String("class");
	    String pattern = Singleton.SOUNDEX.getCodecVersion1_10().soundex(searchField);
		ArrayList<String> listOfTerms = new ArrayList<String>(); // make it a object with string fields
		listOfTerms.add("classs");listOfTerms.add("clazz");listOfTerms.add("klass");listOfTerms.add("something");listOfTerms.add("anotherthing");
		ArrayList<String> results = new ArrayList<String>();

		System.out.println("find terms similiar to " + searchField + " in the following list" + listOfTerms.toString());

		if (searchField!=null && searchField!="") {
		    try {
				for (String term : listOfTerms) {
					if (term != null) {
						String soundexWord = Singleton.SOUNDEX.getCodecVersion1_10().soundex(term);
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

		System.out.println(" try it out with a newer phonetic search ");

		ArrayList<String> results2 = new ArrayList<String>();

		String pattern2 = org.gazampa.soundex.metaphone.Singleton.METAPHONE.getCodecVersion1_10().doubleMetaphone(searchField);

		if (searchField!=null && searchField!="") {
		    try {
				for (String term : listOfTerms) {
					if (term != null) {
						String metaphoneWord = org.gazampa.soundex.metaphone.Singleton.METAPHONE.getCodecVersion1_10().doubleMetaphone(term);
						System.out.println(pattern2 + " : " + metaphoneWord);
						if (metaphoneWord.equals(pattern2) ) {
							results2.add(term);
						}
					}
				}

		    } catch ( Exception ex ) {
				System.out.println(ex.toString());
		    }
		}

		System.out.println(results.toString());

		System.out.println("");

		System.out.println(" niether gets exactly what you want, does it, so ... combine the results");

		LinkedHashSet<String> result = new LinkedHashSet<String>();

		for (String re : results){
			result.add(re);
		}
		for (String re : results2){
			result.add(re);
		}

		System.out.println("");

		System.out.println(result.toString());

	}

}





