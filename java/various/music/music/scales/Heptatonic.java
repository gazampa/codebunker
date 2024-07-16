package music.scales;

import music.pitch.Pitch;

public class Heptatonic{

	private String[] intervals;

	private int secondInterval;
	private int thirdInterval;
	private int fourthInterval;
	private int fifthInterval;
	private int sixthInterval;
	private int seventhInterval;

	Heptatonic(){}

	Heptatonic(String[] pIntervals){
		intervals = pIntervals;
		assignIntervals(intervals);
	}

	private void assignIntervals(String[] intervals){
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
			}
		}
	}

	protected int getSecondInterval(){
		return secondInterval;
	}
	protected int getThirdInterval(){
		return thirdInterval;
	}
	protected int getFourthInterval(){
		return fourthInterval;
	}
	protected int getFifthInterval(){
		return fifthInterval;
	}
	protected int getSixthInterval(){
		return sixthInterval;
	}
	protected int getSeventhInterval(){
		return seventhInterval;
	}

}