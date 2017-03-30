package vivid.musictheory.scales;

public class TestMinor extends Chord{
	private String key;
	private static final String[] intervals = {"T","S","T","T","T","T","T"};
	
	public TestMinor(String key){super(key, intervals);};	
	
	protected void assignNotes(){
		if ( key!=null ) {
			System.out.println("... " + intervals.length);
			for(int i = 0;i < intervals.length; i++){
				System.out.println(intervals[i]);
			}
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
