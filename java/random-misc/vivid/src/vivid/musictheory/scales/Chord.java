package vivid.musictheory.scales;

import vivid.musictheory.pitch.Notes;

import java.util.ArrayList;
/**
 * Template for constructing a chord
 * 	- a chord is a sequence of notes in a scale  
 *  - the sequence is determined by a starting key and 
 *  - a sequence of intervals known as tones and semitones
 *  - tones increment 2 notes in a scale, semitones increment one note
 *  - the array of all available notes is contained in the lookup array pitch.Notes
 *  - A Major/Minor Scale contain a base of Eight Notes, upwards of 8 the notes recycle in a higher octave 
 */
public abstract class Chord {

	private    String[] intervals;
	protected String key;
	protected ArrayList<String> output = new ArrayList<String>();
	
	/** a chord is a sequence of notes in a scale **/
	private String firstNote;
	private String secondNote;
	private String thirdNote;
	private String fourthNote;
	private String fifthNote;
	private String sixthNote;
	private String seventhNote;	

	protected Chord(String A){this.key = A;}
	protected Chord(String A, String[] intervals){this.key=A;this.intervals=intervals;assignNotes();}

	/** this method fills out the notes in a chord **/
	abstract protected void assignNotes();	
	
	protected String getFirstNote(){
		return firstNote;
	}

	protected void setFirstNote(String pitch){
		firstNote = pitch;
	}

	protected String getSecondNote(){
		return secondNote;
	}

	protected void setSecondNote(String pitch){
		int index = getIndexOf(pitch);

		index+=getSecondInterval(intervals);

		secondNote = getNote(index);
	}

	protected String getThirdNote(){
		return thirdNote;
	}
	
	protected void setThirdNote(String pitch){
		int index = getIndexOf(pitch);

		index+=getThirdInterval(intervals);

		thirdNote = getNote(index);
	}

	protected String getFourthNote(){
		return fourthNote;
	}

	protected void setFourthNote(String pitch){
		if ( "F".equalsIgnoreCase(pitch) ){
			fourthNote="Bb";
		}else{
			int index = getIndexOf(pitch);
			index+=getFourthInterval(intervals);
			fourthNote = getNote(index);
		}
	}

	protected String getFifthNote(){
		return fifthNote;
	}
	
	protected void setFifthNote(String pitch){
		int index = getIndexOf(pitch);

		index+=getFifthInterval(intervals);

		fifthNote = getNote(index);
	}

	protected String getSixthNote(){
		return sixthNote;
	}

	protected void setSixthNote(String pitch){
		int index = getIndexOf(pitch);

		index+=getSixthInterval(intervals);

		sixthNote = getNote(index);
	}

	protected String getSeventhNote(){
		return seventhNote;
	}

	protected void setSeventhNote(String pitch){
		int index = getIndexOf(pitch);

		index+=getSeventhInterval(intervals);

		seventhNote = getNote(index);
	}
		
	/** gets the offset of a note **/
	private int getIndexOf(String pitch){
		int index = -1;
		for (int i = 0;i<Notes.values.length;i++){
			if ( pitch.equalsIgnoreCase(Notes.values[i]) ){
				index = i;
			}
		}
		return index;
	}
	/** returns the note at the given index**/
	private String getNote(int index){
		if ( index > 11 )
			index = index-12;

		return Notes.values[index];
	}
	/** Utility Methods - calculates interval offset**/
	private static int getSecondInterval(String[] intervals){
		int intervalCount = 0;
		for (int i=0;i<1;i++){
			if ( "S".equalsIgnoreCase(intervals[i]) )
				intervalCount+=1;
			if ( "T".equalsIgnoreCase(intervals[i]) )
				intervalCount+=2;
		}
		return intervalCount;
	}
	
	private static int getThirdInterval(String[] intervals){
		int intervalCount = 0;
		for (int i=0;i<2;i++){
			if ( "S".equalsIgnoreCase(intervals[i]) )
				intervalCount+=1;
			if ( "T".equalsIgnoreCase(intervals[i]) )
				intervalCount+=2;
		}
		return intervalCount;
	}
	private static int getFourthInterval(String[] intervals){
		int intervalCount = 0;
		for (int i=0;i<3;i++){
			if ( "S".equalsIgnoreCase(intervals[i]) )
				intervalCount+=1;
			if ( "T".equalsIgnoreCase(intervals[i]) )
				intervalCount+=2;
		}
		return intervalCount;
	}
	private static int getFifthInterval(String[] intervals){
		int intervalCount = 0;
		for (int i=0;i<4;i++){
			if ( "S".equalsIgnoreCase(intervals[i]) )
				intervalCount+=1;
			if ( "T".equalsIgnoreCase(intervals[i]) )
				intervalCount+=2;
		}
		return intervalCount;
	}
	private static int getSixthInterval(String[] intervals){
		int intervalCount = 0;
		for (int i=0;i<5;i++){
			if ( "S".equalsIgnoreCase(intervals[i]) )
				intervalCount+=1;
			if ( "T".equalsIgnoreCase(intervals[i]) )
				intervalCount+=2;
		}
		return intervalCount;
	}
	private static int getSeventhInterval(String[] intervals){
		int intervalCount = 0;
		for (int i=0;i<6;i++){
			if ( "S".equalsIgnoreCase(intervals[i]) )
				intervalCount+=1;
			if ( "T".equalsIgnoreCase(intervals[i]) )
				intervalCount+=2;
		}
		return intervalCount;
	}
	
	public String toString(){
		return output.toString();
	}
	
	
}
