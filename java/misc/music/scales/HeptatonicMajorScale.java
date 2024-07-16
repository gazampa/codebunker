package music.scales;

import java.util.ArrayList;

public class HeptatonicMajorScale extends HeptatonicMajor {

	protected String key;
	protected ArrayList<String> notes = new ArrayList<String>();

	public HeptatonicMajorScale(){
		key="C";
		assignNotes();
	}

	public HeptatonicMajorScale(String pitch){
		key = pitch;
		assignNotes();
	}

	private String getKey(){
		return key;
	}

	private void setKey(String pitch){
		key = pitch;
	}

	protected void assignNotes(){

		if ( key!=null ) {
			setTonic(key);
			notes.add(getTonic());
			setSuperTonic(key);
			notes.add(getSuperTonic());
			setMediant(key);
			notes.add(getMediant());
			setSubDominant(key);
			notes.add(getSubDominant());
			setDominant(key);
			notes.add(getDominant());
			setSubMediant(key);
			notes.add(getSubMediant());
			setSubTonic(key);
			notes.add(getSubTonic());
		}

	}

	public String toString(){
		ArrayList<String> printString = (ArrayList<String>)notes.clone();
		printString.add("^"+getTonic());
		return printString.toString();
	}

}