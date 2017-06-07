package threads.forkjoin.runner;

import threads.forkjoin.runner.queue.QueueWrapper;

class TaskRunner extends Thread{

	protected FJTaskRunnerGroup group;
    // this array holds volatile references to tasks that the thread can run
    protected QueueWrapper workQ = new QueueWrapper();
    protected boolean active = false;
	protected int runs = 0;

	public TaskRunner(FJTaskRunnerGroup trg){
		group = trg;
	}

	public FJTaskRunnerGroup getGroup(){
		return group;
	}

	public void run(){ // this is what this thread does
		try
			{
			while (!interrupted())
			{
			 //Task task = (Task)workQ.pop();
             FJTask task = getGroup().pollEntryQueue();
			 if (task != null) {
			   if (task.isDone())
				 continue;
			   this.runs += 1;
			   task.run();	// this is what the task you sent it does
			   task.setDone();
			 }
			 else
			 {
			//   scanWhileIdling();
			 }
			}
			} finally {
				this.group.setInactive(this);
			}
	}

	protected void push(FJTask r){
		workQ.push(r);
	}


}