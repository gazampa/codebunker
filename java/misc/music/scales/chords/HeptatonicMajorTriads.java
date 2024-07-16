package music.scales.chords;

import music.scales.HeptatonicMajorScale;
import music.scales.chords.Triads;
import java.util.ArrayList;

public class HeptatonicMajorTriads extends HeptatonicMajorScale implements Triads{

	public HeptatonicMajorTriads(){
		super();
	}

	public HeptatonicMajorTriads(String pitch){
		super(pitch);
	}

	public String buildTriads(){
		String chords = new String();
		StringBuilder rootNote = new StringBuilder();
		StringBuilder thirdNote = new StringBuilder();
		StringBuilder fifthNote = new StringBuilder();
		StringBuilder description = new StringBuilder();
		for (int i=0;i < notes.size();i++ ) {
			int root =i;
			int third=(i+2)%notes.size();
			int fifth=(i+4)%notes.size();

			rootNote.append(notes.get(root));
			if ( root!=6 )
				rootNote.append(", ");

			if (third > notes.size()-1 )
				third = third-notes.size();
			thirdNote.append(notes.get(third));
			if ( third!=1 )
				thirdNote.append(", ");

			if ( fifth > notes.size()-1 )
				fifth = fifth-notes.size();
			fifthNote.append(notes.get(fifth));
			if ( fifth!=3 )
				fifthNote.append(", ");
		}

		rootNote.append("\n");
		thirdNote.append("\n");
		fifthNote.append("\n");

		chords = fifthNote.toString() + thirdNote.toString() + rootNote.toString();

		return chords;

	}

	public String toString(){
		ArrayList<String> printString = (ArrayList<String>)notes.clone();
		printString.add("^"+getTonic());
		return printString.toString();
	}

}