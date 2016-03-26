package music.scales;

import music.pitch.Pitch;

public class Minor{

	private static final String[] intervals = {"T","S","T","T","T","T","T"};

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

	private String tonic;
	private String supertonic;
	private String mediant;
	private String subdominant;
	private String dominant;
	private String submediant;
	private String subtonic;


	public Minor(){}

	private String getTonic(){
		return tonic;
	}
	private void setTonic(String pitch){
		tonic = pitch;
	}

	private String getSuperTonic(){
		return supertonic;
	}
	protected void setSuperTonic(String pitch){
		int index = getIndexOf(pitch);

		index+=secondInterval;

		supertonic = getNote(index);
	}

	private String getMediant(){
		return mediant;
	}
	protected void setMediant(String pitch){
		int index = getIndexOf(pitch);

		index+=thirdInterval;

		mediant = getNote(index);
	}

	private String getSubDominant(){
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

	private String getDominant(){
		return dominant;
	}
	protected void setDominant(String pitch){
		int index = getIndexOf(pitch);

		index+=fifthInterval;

		dominant = getNote(index);
	}

	private String getSubMediant(){
		return submediant;
	}
	protected void setSubMediant(String pitch){
		int index = getIndexOf(pitch);

		index+=sixthInterval;

		submediant = getNote(index);
	}

	private String getSubTonic(){
		return subtonic;
	}
	protected void setSubTonic(String pitch){
		int index = getIndexOf(pitch);

		index+=seventhInterval;

		subtonic = getNote(index);
	}

	private String getLeadingtone(){
		return subtonic;
	}
	private void setLeadingTone(String pitch){
		subtonic = pitch;
	}

	private String getFirst(){
		return tonic;
	}
	private void setFirst(String pitch){
		tonic = pitch;
	}

	private String getSecond(){
		return supertonic;
	}
	private void setSecond(String pitch){
		supertonic = pitch;
	}

	private String getThird(){
		return mediant;
	}
	private void setThird(String pitch){
		mediant = pitch;
	}

	private String getFourth(){
		return subdominant;
	}
	private void setFourth(String pitch){
		subdominant = pitch;
	}

	private String getFifth(){
		return dominant;
	}
	private void setFifth(String pitch){
		dominant = pitch;
	}

	private String getSixth(){
		return submediant;
	}
	private void setSixth(String pitch){
		submediant = pitch;
	}

	private String getSeventh(){
		return subtonic;
	}
	private void setSeventh(String pitch){
		subtonic = pitch;
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