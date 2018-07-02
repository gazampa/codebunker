package tests.sync;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
public class OpenCallClient{

    public static void main(String args[]){

        final int N = 10;

        ArrayList<HeapObject> heapObject = setupData();

        OpenCallClient clients = new OpenCallClient();

        for ( HeapObject obj : heapObject ) {
        
            Thread[] ts = clients.create( N, obj );

            clients.start( ts );

            clients.pauseTilDone( ts );

            clients.dispose( ts );

            ts = null;

            System.out.println( obj.readValue() + " : " + obj.ReadStatic() + "    heap | static ");

            System.out.println( StaticClass.ExposedStaticInteger + " : " + StaticClass.SynchedInteger + "    static");

        }

    }

    private static ArrayList<HeapObject> setupData(){

        ArrayList<HeapObject> heapObject = new ArrayList<HeapObject>(2);

        final HeapObject unsync = new UnsynchedHeapObject();
        final HeapObject sync = new SynchedHeapObject();
        heapObject.add( unsync );
        heapObject.add( sync );

        return heapObject;

    }

    private Thread[] create(int n, HeapObject o){

        Thread[] ts = new Thread[n];

        for ( int i = 0, j = n; i < j; ++ i ){
            Thread t = new Thread( new Runnable(){ 
                public void run(){
                    for ( int i = 0, j = 50000; i < j; ++ i ){
                        o.Increment();
                        StaticClass.Increment();
                        o.increment();
                        o.Decrement();
                        StaticClass.Decrement();
                        o.decrement();
                    }
             } } );
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

    private void dispose(Thread[] ts){
        try{
        for ( int i = 0, j = ts.length; i < j; i++ ){
                ts[i] = null;
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
    
    public void printInput(Thread[] ts){
        System.out.println(ts);
    }

}
