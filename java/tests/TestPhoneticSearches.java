package org.gazampa.tests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.gazampa.soundex.Singleton;

public class TestPhoneticSearches{

  @Test
  public void testSoundexSearch() {

    String actualName = new String("class");

	ArrayList<String> mispelledVersions = new ArrayList<String>();
	mispelledVersions.add("classs");mispelledVersions.add("clazz");mispelledVersions.add("klass");mispelledVersions.add("something");mispelledVersions.add("anotherthing");
	ArrayList<String> results = new ArrayList<String>();

		System.out.println("find terms similiar to " + actualName + " in the following list" + mispelledVersions.toString());

		if (actualName!=null && actualName!="") {
		    try {
    			String pattern = Singleton.SOUNDEX.getCodecVersion1_10().soundex(actualName);
				for (String term : mispelledVersions) {
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

		assertEquals(2, results.size());

		// try it out with a newer phonetic search

		ArrayList<String> results2 = new ArrayList<String>();

		String pattern2 = org.gazampa.soundex.metaphone.Singleton.METAPHONE.getCodecVersion1_10().doubleMetaphone(actualName);

		if (actualName!=null && actualName!="") {
		    try {
				for (String term : mispelledVersions) {
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

		System.out.println(results2.toString());

		assertEquals(2, results2.size());

		System.out.println("");

		// know your searches and your data !
		// niether gets exactly what you want, until you combine the results, sheesh

		LinkedHashSet<String> result = new LinkedHashSet<String>();

		for (String re : results){
			result.add(re);
		}

		for (String re : results2){
			result.add(re);
		}

		System.out.println("");

		System.out.println(result.toString());

    	assertEquals(3, result.size());

  }


}
