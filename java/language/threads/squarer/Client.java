package mit.squarer;

import java.lang.InterruptedException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
class Client{
    public static void main(String[] args) {

        BlockingQueue<SquareRequest> requests = new LinkedBlockingQueue<SquareRequest>();
        BlockingQueue<SquareResult> replies = new LinkedBlockingQueue<>();

        Squarer squarer = new Squarer(requests, replies);
        squarer.start();

        final int N = 1000; // with bigger n, cc is favored 
        long start=0, stop=0, duration=0;
        start = System.nanoTime();
        try {
            // make sequential request
            for ( int i = 0; i < N; i++ ) {
                makeRequest( new SquareRequest(i), requests );
                getResponse( replies );
                //System.out.println( getResponse( replies ) );
            }
        }catch(Exception e ) { e.printStackTrace(); } 
        stop = System.nanoTime();
        duration = stop - start;
        System.out.println("Sequential " + duration);
        start = System.nanoTime();

        Thread[] ts = new Thread[N/10];
        try {
            // make concurrent request - one thread per request
            final BlockingQueue<Integer> params = new LinkedBlockingQueue<Integer>();
            for ( int i = 0, n = ts.length; i < n; i++ ) {
                params.put(i);
                ts[i] = new Thread( new Runnable() {
                    public void run() {
                        try {
                            int outer = params.take()*ts.length;
                            for ( int j = 0, nn = N / ts.length; j < nn; j++ ) { 
                                int value = outer + j;
                                makeRequest( new SquareRequest( value ), requests );
                                getResponse( replies );
                                //System.out.println( getResponse( replies ) );
                            }
                        }catch(InterruptedException ie ) { ie.printStackTrace(); } 
                    }});ts[i].start();
            }
        }catch(InterruptedException ie ) { ie.printStackTrace(); } 

        pauseMain(ts);
        stop = System.nanoTime();
        duration = stop - start;
        System.out.println("Concurrent " + duration);
        System.exit(0);
    }

    private static void makeRequest( SquareRequest request, BlockingQueue<SquareRequest> requests) {
        try{
            requests.put(request);
        }catch ( InterruptedException ie ) {
            System.out.println( "Problem passing parameter" );
            ie.printStackTrace();
        }
    }

    private static SquareResult getResponse(BlockingQueue<SquareResult> replies ) {
        SquareResult result = null;

        try {
            result = replies.take();
        }catch ( InterruptedException ie ) {
            System.out.println( "Problem retrieving response" );
            ie.printStackTrace();
        }

        return result;
    }

    static void pauseMain(Thread[] ts){
        for ( int i = 0; i < ts.length; i++ ){
            try{
                ts[i].join();
            } catch( InterruptedException ie ) {
                ie.printStackTrace();
            }
        }
    }

}
