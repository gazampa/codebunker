package vivid.musictheory.scales;

public class MinorNinth extends Minor{

	public MinorNinth(String key){super(key);}
	
	// formula for a Minor Ninth : http://en.wikipedia.org/wiki/Ninth_chord
	// first, thirds, fifth, seventh, ninth chord. 1, 3, 5, 7, 9 ( 9 = 2+7 )
	// root, minor third, perfect fifth, minor seventh, major ninth	
	
	public void assignNotes(){

		if ( key!=null ) {
			setFirstNote(key);
			output.add(getFirstNote());
			setThirdNote(key);
			output.add(getThirdNote());
			setFifthNote(key);
			output.add(getFifthNote());
			setSecondNote(key);
			output.add(getSecondNote()+"+"); //++ denotes higher octave
		}

	}	
	
}
