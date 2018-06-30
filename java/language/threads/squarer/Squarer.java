package mit.squarer;

import java.util.concurrent.BlockingQueue;
class Squarer implements Runnable{

    private final BlockingQueue<SquareRequest> in;
    private final BlockingQueue<SquareResult> out;

    public Squarer(BlockingQueue<SquareRequest> requests,
                 BlockingQueue<SquareResult> replies) {

        in = requests;
        out = replies;

    }

    public void start(){
        new Thread( new Runnable() {
                public void run() {
                    while( !Thread.interrupted() ) {
                        service();
                    }
                }}).start();
    } 

    private void service(){
        try{
            SquareRequest req = in.take();
            int x = req.getValue();
            int y = x * x;
            out.put( new SquareResult( x, y ) );
        } catch(InterruptedException ie ) {
            ie.printStackTrace(); 
        }
    }

    public void run(){
        service();
    }

}
