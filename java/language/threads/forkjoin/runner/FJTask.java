package threads.forkjoin.runner;

import threads.forkjoin.runner.TaskRunner;
import threads.forkjoin.runner.FJTaskRunnerGroup;
import threads.forkjoin.task.iface.Element;
public abstract class FJTask implements Runnable, Element{

	protected volatile boolean done;

	// a thread that will execute the task
	public static TaskRunner getTaskRunner(){
		return (TaskRunner) Thread.currentThread();
	}
	// an array / queue which the thread comes from
	public static FJTaskRunnerGroup getTaskRunnerGroup(){
		return getTaskRunner().getGroup();
	}

	public boolean isDone(){
		return done;
	}

	public void setDone(){
		done = true;
	}

	public void cancel(){
		setDone();
	}
	// give it to the group and let it decide
	public void start(){
		getTaskRunnerGroup().executeTask(this);
	}

	// this puts the task on the worker threads queue
	public void fork(){
		getTaskRunner().push(this);
	}

	static public void yield(){
//		getFTaskRunner().taskYield();
	}

	static public void join(){
//		getFJTaskRunner().taskJoin();
	}

	public void invoke(FJTask t){
		if (!t.isDone()){
			t.run();
			t.setDone();
		}
	}

//	static void coInvoke(FJTask t0, FJTask t1){
//		getFJTaskRunner().coInvoke( t0, t1 );
//	}
	// static void coInvoke(FJTask[] t);

//	public void wrap(){}

	public void reset(){
		done = false;
	}

}
