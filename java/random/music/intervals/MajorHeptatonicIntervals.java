package music.intervals;

public interface MajorHeptatonicIntervals{
	String[] intervals = {"T","T","S","T","T","T","S"};

	String getTonic();
	String setTonic(String pitch);
}

/*




	protected String supertonic;
	protected String mediant;
	protected String subdominant;
	protected String dominant;
	protected String submediant;
	protected String subtonic;

	public HeptatonicMajor(){
		super(intervals);
	}

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

		index+=getSecondInterval();

		supertonic = getNote(index);
	}

	protected String getMediant(){
		return mediant;
	}
	protected void setMediant(String pitch){
		int index = getIndexOf(pitch);

		index+=getThirdInterval();

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
			index+=getFourthInterval();
			subdominant = getNote(index);
		}
	}

	protected String getDominant(){
		return dominant;
	}
	protected void setDominant(String pitch){
		int index = getIndexOf(pitch);

		index+=getFifthInterval();

		dominant = getNote(index);
	}

	protected String getSubMediant(){
		return submediant;
	}
	protected void setSubMediant(String pitch){
		int index = getIndexOf(pitch);

		index+=getSixthInterval();

		submediant = getNote(index);
	}

	protected String getSubTonic(){
		return subtonic;
	}
	protected void setSubTonic(String pitch){
		int index = getIndexOf(pitch);

		index+=getSeventhInterval();

		subtonic = getNote(index);
	}

	protected String getLeadingtone(){
		return subtonic;
	}
	protected void setLeadingTone(String pitch){
		int index = getIndexOf(pitch);

		index+=getSeventhInterval();

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

		index+=getSecondInterval();

		supertonic = getNote(index);
	}

	protected String getThird(){
		return mediant;
	}
	protected void setThird(String pitch){
		int index = getIndexOf(pitch);

		index+=getThirdInterval();

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
			index+=getFourthInterval();
			subdominant = getNote(index);
		}
	}

	protected String getFifth(){
		return dominant;
	}
	protected void setFifth(String pitch){
		int index = getIndexOf(pitch);

		index+=getFifthInterval();

		dominant = getNote(index);
	}

	protected String getSixth(){
		return submediant;
	}
	protected void setSixth(String pitch){
		int index = getIndexOf(pitch);

		index+=getSixthInterval();

		submediant = getNote(index);
	}

	protected String getSeventh(){
		return subtonic;
	}
	protected void setSeventh(String pitch){
		int index = getIndexOf(pitch);

		index+=getSeventhInterval();

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
			index = index%12;

		return Pitch.notes[index];
	}

}




*/