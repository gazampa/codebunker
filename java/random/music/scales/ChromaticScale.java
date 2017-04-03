package music.scales;

import java.util.ArrayList;
import music.scales.Chromatic;

public class ChromaticScale extends Chromatic{

	private String key;
	private ArrayList<String> notes = new ArrayList<String>();

	public ChromaticScale(){
		key="C";
		assignNotes();
	}

	public ChromaticScale(String pitch){
		key=pitch;
		assignNotes();
	}

	private String getKey(){
		return key;
	}

	private void setKey(String pitch){
		key = pitch;
	}

	private void assignNotes(){

		setFirst(key);
		notes.add(getFirst());
		setSecond(key);
		notes.add(getSecond());
		setThird(key);
		notes.add(getThird());
		setFourth(key);
		notes.add(getFourth());
		setFifth(key);
		notes.add(getFifth());
		setSixth(key);
		notes.add(getSixth());
		setSeventh(key);
		notes.add(getSeventh());
		setEighth(key);
		notes.add(getEighth());
		setNinth(key);
		notes.add(getNinth());
		setTenth(key);
		notes.add(getTenth());
		setEleventh(key);
		notes.add(getEleventh());
		setTwelfth(key);
		notes.add(getTwelfth());
		notes.add("^"+getFirst());
	}

	public String toString(){
		return notes.toString();
	}


}