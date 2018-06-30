package mit.squarer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.BlockingQueue;
class SquareResult{

    private final int request;
    private final int response;

    public SquareResult(int in, int out){
        request = in;
        response = out;
    }

    public String toString(){
        return request + " ^2 " + "  = " + response;
    }


}
