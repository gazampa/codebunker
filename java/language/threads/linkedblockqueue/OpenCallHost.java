package threads.linkedblockqueue;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;
class OpenCallHost {

    protected long localState;
    protected final LinkedBlockingQueue<Long> messages = new LinkedBlockingQueue<Long>();
    protected final Helper helper = new Helper();

    protected synchronized void updateState(long l){
        System.out.println(Thread.currentThread().getId() + " updating local state " + l);
        localState = l;
        System.out.println(Thread.currentThread().getId() + " updated local state " + localState);
    }

    protected void addMessage(long l){
        //System.out.println(Thread.currentThread().getId() + " updating local state " + l);
        try{  
            messages.put(l);
        } catch ( Exception e){}
        //System.out.println(Thread.currentThread().getId() + " updated local state " + localState);
    }

    protected long getMessage(){
        long result = -1;
        if ( !messages.isEmpty() ){
            try{
             result =  messages.take();
            }catch(Exception e) {}
        }
        return result;
    }

    public void request(long message){
        System.out.println("request received " + message);
        addMessage(message);
        long myMsg = getMessage();
        helper.handle(myMsg);
    }

}
class Helper{

    public void handle(long msg){
        System.out.println("begin handle " + Thread.currentThread().getId() + " " + msg);
        //sleep(500);
        System.out.println("end handle " + Thread.currentThread().getId() + " " + msg);
    }

    private void sleep(long t){
        try{
            Thread.sleep(t);
        }catch(Exception e){}

    }
}
