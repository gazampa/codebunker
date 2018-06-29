package threads.linkedblockqueue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
public class OpenCallClient{

    public static void main(String args[]){

        int n = 5;

        OpenCallHost host = new OpenCallHost();

        OpenCallClient clients = new OpenCallClient();

        Thread[] ts = clients.create(n, host);

        clients.pauseTilDone(ts);

        clients.printInput();
    }

    private Thread[] create(int n, OpenCallHost host){

        Thread[] ts = new Thread[n];
        int[] msg = new int[1];

        for ( int i = 0, j = n; i < j; ++ i ){
            add(i);
            Thread t = new Thread( new Runnable(){ 
                public void run(){
                     host.request(take());
             } } );t.start();
            ts[i] = t;
         }

        return ts;
    }

    private void start(Thread[] ts){

        for ( int i = 0, j = ts.length; i < j; i++ ){
            ts[i].start();
        }

    }

    private void pauseTilDone(Thread[] ts){
        try{
        for ( int i = 0, j = ts.length; i < j; i++ ){
                ts[i].join();
        }
        }catch(Exception e){}

    }

    private static void printArray(Thread[] ts){
        System.out.println(ts.length);
        for (int i = 0; i < ts.length; i++ ){
            System.out.println(ts[i]);
        }
    }

    private final LinkedBlockingQueue<Long> input = new LinkedBlockingQueue<Long>();

    private void add(long l){
        try{
            input.put(l);
        }catch(Exception e){}        
    }

    private long take(){
        long result = -1;
        try{
            if ( !input.isEmpty() ){
                result  = input.take();
            }
        }catch(Exception e){}
        return result;
    } 
    
    public void printInput(){
        System.out.println(input);
    }

}
