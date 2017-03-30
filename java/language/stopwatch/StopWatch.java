package stopwatch;
public class StopWatch{

	private long start, stop, duration;

	public StopWatch(){}

	public StopWatch(long s){ start = s;}

	public void start(){
		start = System.nanoTime();
	}

	public void restart(){
		clear();
		start = System.nanoTime();
	}

	public void stop(){
		stop = System.nanoTime();
	}

	public long stopAndReport(){
		stop = System.nanoTime();
		return getDuration();
	}

	public long getDuration(){
		duration = stop - start;
		return duration;
	}

	public void clear(){
		start = 0;
		stop = 0;
		duration = 0;
	}

	public void whynotme(){System.out.println();}

}