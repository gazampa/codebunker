package music.scales;

import music.intervals.MajorHeptatonicIntervals;
import music.pitch.Pitch;

public class HeptatonicMajor extends Heptatonic implements MajorHeptatonicIntervals{

	protected String tonic;
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
		if ("As".equalsIgnoreCase(pitch) ){
			supertonic="Bs";
		}else if ("Ds".equalsIgnoreCase(pitch) ){
			supertonic="Es";
		}else{
			int index = getIndexOf(pitch);
			index+=getSecondInterval();
			supertonic = getNote(index);
		}
	}

	protected String getMediant(){
		return mediant;
	}

	protected void setMediant(String pitch){
		if ("Cs".equalsIgnoreCase(pitch) ){
			mediant="Es";
		}else if ("Gs".equalsIgnoreCase(pitch) ){
			mediant="Bs";
		}else if ("As".equalsIgnoreCase(pitch) ){
			mediant="Css";
		}else if ("Ds".equalsIgnoreCase(pitch) ){
			mediant="Fss";
		}else{
			int index = getIndexOf(pitch);
			index+=getThirdInterval();
			mediant = getNote(index);
		}
	}

	protected String getSubDominant(){
		return subdominant;
	}

	protected void setSubDominant(String pitch){
		if ( "F".equalsIgnoreCase(pitch) ){
			subdominant="Bb";
		}else if("Cs".equalsIgnoreCase(pitch)){
			subdominant="Fs";
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
		if ("As".equalsIgnoreCase(pitch)){
			dominant="Es";
		}else{
			int index = getIndexOf(pitch);
			index+=getFifthInterval();
			dominant = getNote(index);
		}
	}

	protected String getSubMediant(){
		return submediant;
	}

	protected void setSubMediant(String pitch){
		if ("Gs".equalsIgnoreCase(pitch)){
			submediant="Es";
		}else if ("As".equalsIgnoreCase(pitch)){
			submediant="Fss";
		}else if ("Ds".equalsIgnoreCase(pitch)){
			submediant="Bs";
		}else{
			int index = getIndexOf(pitch);
			index+=getSixthInterval();
			submediant = getNote(index);
		}
	}

	protected String getSubTonic(){
		return subtonic;

	}

	protected void setSubTonic(String pitch){
		if ("Cs".equalsIgnoreCase(pitch)){
			subtonic="Bs";
		}else if ("Fs".equalsIgnoreCase(pitch)){
			subtonic="Es";
		}else if ("Gs".equalsIgnoreCase(pitch)){
			subtonic="Fss";
		}else if ("As".equalsIgnoreCase(pitch)){
			subtonic="Gss";
		}else if ("Ds".equalsIgnoreCase(pitch)){
			subtonic="Css";
		}else{
			int index = getIndexOf(pitch);
			index+=getSeventhInterval();
			subtonic = getNote(index);
		}
	}

	protected String getLeadingtone(){
		return subtonic;
	}
	protected void setLeadingTone(String pitch){
		if ("Cs".equalsIgnoreCase(pitch)){
			subtonic="Bs";
		}else{
			int index = getIndexOf(pitch);
			index+=getSeventhInterval();
			subtonic = getNote(index);
		}
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