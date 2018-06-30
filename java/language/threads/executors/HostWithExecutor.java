package douglea;

public class HostWithExecutor {

    protected long localState;

    protected final Helper helper = new Helper();

    protected final Executor executor;

    public HostWithExecutor(Executor e){

        executor = e;

    }

    protected synchronized void updateState(){
    
    }

    public void request(){

        updateState();

        executor.execute( new Runnable() {

                    public void run() {
                        helper.service();
                    }} );
    }

}
class Helper{

    public void service() {

        System.out.println("execute");

    }

}
