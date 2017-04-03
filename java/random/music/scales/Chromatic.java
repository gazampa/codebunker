package music.scales;

import music.pitch.Pitch;

public class Chromatic{

	private static final String[] intervals = {"S","S","S","S","S","S","S","S","S","S","S"};

	private static int secondInterval;
	private static int thirdInterval;
	private static int fourthInterval;
	private static int fifthInterval;
	private static int sixthInterval;
	private static int seventhInterval;
	private static int eighthInterval;
	private static int ninthInterval;
	private static int tenthInterval;
	private static int eleventhInterval;
	private static int twelfthInterval;

	static{
		assignIntervals(intervals);
	}

	private String first;
	private String second;
	private String third;
	private String fourth;
	private String fifth;
	private String sixth;
	private String seventh;
	private String eighth;
	private String ninth;
	private String tenth;
	private String eleventh;
	private String twelfth;

	public Chromatic(){}

	protected String getFirst(){
		return first;
	}
	protected void setFirst(String pitch){
		first = pitch;
	}

	protected String getSecond(){
		return second;
	}
	protected void setSecond(String pitch){
		int index = getIndexOf(pitch);

		index+=secondInterval;

		second = getNote(index);
	}

	protected String getThird(){
		return third;
	}
	protected void setThird(String pitch){
		int index = getIndexOf(pitch);

		index+=thirdInterval;

		third = getNote(index);
	}

	protected String getFourth(){
		return fourth;
	}
	protected void setFourth(String pitch){
		int index = getIndexOf(pitch);

		index+=fourthInterval;

		fourth = getNote(index);
	}

	protected String getFifth(){
		return fifth;
	}
	protected void setFifth(String pitch){
		int index = getIndexOf(pitch);

		index+=fifthInterval;

		fifth = getNote(index);
	}

	protected String getSixth(){
		return sixth;
	}
	protected void setSixth(String pitch){
		int index = getIndexOf(pitch);

		index+=sixthInterval;

		sixth = getNote(index);
	}

	protected String getSeventh(){
		return seventh;
	}
	protected void setSeventh(String pitch){
		int index = getIndexOf(pitch);

		index+=seventhInterval;

		seventh = getNote(index);
	}

	protected String getEighth(){
		return eighth;
	}
	protected void setEighth(String pitch){
		int index = getIndexOf(pitch);

		index+=eighthInterval;

		eighth = getNote(index);
	}

	protected String getNinth(){
		return ninth;
	}
	protected void setNinth(String pitch){
		int index = getIndexOf(pitch);

		index+=ninthInterval;

		ninth = getNote(index);
	}

	protected String getTenth(){
		return tenth;
	}
	protected void setTenth(String pitch){
		int index = getIndexOf(pitch);

		index+=tenthInterval;

		tenth = getNote(index);
	}

	protected String getEleventh(){
		return eleventh;
	}
	protected void setEleventh(String pitch){
		int index = getIndexOf(pitch);

		index+=eleventhInterval;

		eleventh = getNote(index);
	}

	protected String getTwelfth(){
		return twelfth;
	}
	protected void setTwelfth(String pitch){
		int index = getIndexOf(pitch);

		index+=twelfthInterval;

		twelfth = getNote(index);
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
					secondInterval=intervalCount;
				case 1:
					thirdInterval=intervalCount;
				case 2:
					fourthInterval=intervalCount;
				case 3:
					fifthInterval=intervalCount;
				case 4:
					sixthInterval=intervalCount;
				case 5:
					seventhInterval=intervalCount;
				case 6:
					eighthInterval=intervalCount;
				case 7:
					ninthInterval=intervalCount;
				case 8:
					tenthInterval=intervalCount;
				case 9:
					eleventhInterval=intervalCount;
				case 10:
					twelfthInterval=intervalCount;
			}

		}

	}

}