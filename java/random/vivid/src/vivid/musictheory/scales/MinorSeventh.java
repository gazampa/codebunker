package vivid.musictheory.scales;

public class MinorSeventh extends Minor{
	public MinorSeventh(String key){super(key);}
	//formula for seventh chord. http://en.wikipedia.org/wiki/Seventh_chord
	//root, major third, perfect fifth, major seventh
	//1, 3, 5, 7,
	protected void assignNotes(){
		
		if ( key!=null ) {
			setFirstNote(key);
			output.add(getFirstNote());
			setThirdNote(key);
			output.add(getThirdNote());
			setFifthNote(key);
			output.add(getFifthNote());
			setSeventhNote(key);
			output.add(getSeventhNote());
		}

	}

}
