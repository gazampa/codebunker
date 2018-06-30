package douglea;

class PlainThreadExecutor implements Executor{

    public void execute(Runnable r){
        new Thread( r ).start();
    }

}
