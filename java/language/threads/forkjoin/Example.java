package threads.forkjoin;

import threads.forkjoin.runner.FJTaskRunnerGroup;
import threads.forkjoin.tasks.WorkTask;
import java.lang.InterruptedException;

public class Example{

	public static void main(String[] args){

		FJTaskRunnerGroup runGroup = new FJTaskRunnerGroup();

		for ( int i = 0, j = 32; i < j; i ++ ) {
			WorkTask task = new WorkTask();
			runGroup.executeTask(task);
		}

		System.out.println(runGroup.getSize());

		twoSecondDelay();

		runGroup.closeDown();

		System.out.println(runGroup.getSize());

	}

	static void twoSecondDelay(){
		try{
			Thread.sleep(2000);
		}catch(InterruptedException ie){
			System.out.println(" problem ");
		}
	}


}