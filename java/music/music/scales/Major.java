package music.scales;

import music.pitch.Pitch;

public class Major{

	private static final String[] intervals = {"T","T","S","T","T","T","S"};

	private static final int secondInterval;
	private static final int thirdInterval;
	private static final int fourthInterval;
	private static final int fifthInterval;
	private static final int sixthInterval;
	private static final int seventhInterval;

	static{
		secondInterval = getSecondInterval(intervals);
		thirdInterval = getThirdInterval(intervals);
		fourthInterval = getFourthInterval(intervals);
		fifthInterval = getFifthInterval(intervals);
		sixthInterval = getSixthInterval(intervals);
		seventhInterval = getSeventhInterval(intervals);
	}

	protected String tonic;
	protected String supertonic;
	protected String mediant;
	protected String subdominant;
	protected String dominant;
	protected String submediant;
	protected String subtonic;

	public Major(){}

	protected String getTonic(){
		return tonic;
	}
	protected void setTonic(String pitch){
		tonic = pitch;
	}

	protected String getSuperTonic(){
		return supertonic;
	}
	protected void setSuperTonic(String pitch){
		int index = getIndexOf(pitch);

		index+=secondInterval;

		supertonic = getNote(index);
	}

	protected String getMediant(){
		return mediant;
	}
	protected void setMediant(String pitch){
		int index = getIndexOf(pitch);

		index+=thirdInterval;

		mediant = getNote(index);
	}

	protected String getSubDominant(){
		return subdominant;
	}
	protected void setSubDominant(String pitch){
		if ( "F".equalsIgnoreCase(pitch) ){
			subdominant="Bb";
		}else{
			int index = getIndexOf(pitch);
			index+=fourthInterval;
			subdominant = getNote(index);
		}
	}

	protected String getDominant(){
		return dominant;
	}
	protected void setDominant(String pitch){
		int index = getIndexOf(pitch);

		index+=fifthInterval;

		dominant = getNote(index);
	}

	protected String getSubMediant(){
		return submediant;
	}
	protected void setSubMediant(String pitch){
		int index = getIndexOf(pitch);

		index+=sixthInterval;

		submediant = getNote(index);
	}

	protected String getSubTonic(){
		return subtonic;
	}
	protected void setSubTonic(String pitch){
		int index = getIndexOf(pitch);

		index+=seventhInterval;

		subtonic = getNote(index);
	}

	protected String getLeadingtone(){
		return subtonic;
	}
	protected void setLeadingTone(String pitch){
		int index = getIndexOf(pitch);

		index+=seventhInterval;

		subtonic = getNote(index);
	}

	protected String getFirst(){
		return tonic;
	}
	protected void setFirst(String pitch){
		tonic = pitch;
	}

	protected String getSecond(){
		return supertonic;
	}
	protected void setSecond(String pitch){
		int index = getIndexOf(pitch);

		index+=secondInterval;

		supertonic = getNote(index);
	}

	protected String getThird(){
		return mediant;
	}
	protected void setThird(String pitch){
		int index = getIndexOf(pitch);

		index+=thirdInterval;

		mediant = getNote(index);
	}

	protected String getFourth(){
		return subdominant;
	}
	protected void setFourth(String pitch){
		if ( "F".equalsIgnoreCase(pitch) ){
			subdominant="Bb";
		}else{
			int index = getIndexOf(pitch);
			index+=fourthInterval;
			subdominant = getNote(index);
		}
	}

	protected String getFifth(){
		return dominant;
	}
	protected void setFifth(String pitch){
		int index = getIndexOf(pitch);

		index+=fifthInterval;

		dominant = getNote(index);
	}

	protected String getSixth(){
		return submediant;
	}
	protected void setSixth(String pitch){
		int index = getIndexOf(pitch);

		index+=sixthInterval;

		submediant = getNote(index);
	}

	protected String getSeventh(){
		return subtonic;
	}
	protected void setSeventh(String pitch){
		int index = getIndexOf(pitch);

		index+=seventhInterval;

		subtonic = getNote(index);
	}

	private int getIndexOf(String pitch){
		int index = -1;
		for (int i = 0;i<Pitch.notes.length;i++){
			if ( pitch.equalsIgnoreCase(Pitch.notes[i]) ){
				index = i;
			}
		}
		return index;
	}

	private String getNote(int index){
		if ( index > 11 )
			index = index-12;

		return Pitch.notes[index];
	}

	private static void assignIntervals(String[] intervals){
		int intervalCount = 0;

		for ( int i = 0;i<intervals.length;i++ ){
			if ( "S".equalsIgnoreCase(intervals[i]) )
				intervalCount+=1;
			if ( "T".equalsIgnoreCase(intervals[i]) )
				intervalCount+=2;
			switch(i){
				case 0:
					;//secondInterval=intervalCount;
				case 1:
					;//thirdInterval=intervalCount;
				case 2:
					;//fourthInterval=intervalCount;
				case 3:
					;//fifthInterval=intervalCount;
				case 4:
					;//sixthInterval=intervalCount;
				case 5:
					;//seventhInterval=intervalCount;
			}

		}
	}

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



}