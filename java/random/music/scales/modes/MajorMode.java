package music.scales.modes;

import music.scales.Major;
import java.util.ArrayList;

public class MajorMode extends Major {

	private String key;
	private ArrayList<String> notes = new ArrayList<String>();

	public MajorMode(){
		key="C";
		assignNotes();
	}

	public MajorMode(String pitch){
		key = pitch;
		assignNotes();
	}

	private String getKey(){
		return key;
	}

	private void setKey(String pitch){
		key = pitch;
	}

	private void assignNotes(){

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

	public String buildTriads(){
		String chords = new String();
		StringBuilder rootNote = new StringBuilder();
		StringBuilder thirdNote = new StringBuilder();
		StringBuilder fifthNote = new StringBuilder();

		for (int i=0;i < notes.size();i++ ) {
			int root =i;
			int third=i+2%notes.size();
			int fifth=i+4%notes.size();

			rootNote.append(notes.get(root));
			rootNote.append(", ");

			if (third > notes.size()-1 )
				third = third-notes.size();
			thirdNote.append(notes.get(third));
			thirdNote.append(", ");

			if ( fifth > notes.size()-1 )
				fifth = fifth-notes.size();
			fifthNote.append(notes.get(fifth));
			fifthNote.append(", ");
		}

		rootNote.append("\n");
		thirdNote.append("\n");

		chords = rootNote.toString() + thirdNote.toString() + fifthNote.toString();

		return chords;

	}


}