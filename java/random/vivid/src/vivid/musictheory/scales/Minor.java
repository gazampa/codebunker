package vivid.musictheory.scales;

public class Minor extends Chord{
	
	private static final String[] intervals = {"T","S","T","T","T","T","T"};
	
	public Minor(String key){super(key, intervals);};	
	
	protected void assignNotes(){
		if ( key!=null ) {
			setFirstNote(key);
			output.add(getFirstNote());
			setSecondNote(key);
			output.add(getSecondNote());
			setThirdNote(key);
			output.add(getThirdNote());
			setFourthNote(key);
			output.add(getFourthNote());
			setFifthNote(key);
			output.add(getFifthNote());
			setSixthNote(key);
			output.add(getSixthNote());
			setSeventhNote(key);
			output.add(getSeventhNote());
		}

	}

}
