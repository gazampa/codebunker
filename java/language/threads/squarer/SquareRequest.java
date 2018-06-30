package mit.squarer;

public class SquareRequest {

    private final int value;
    private final boolean stop;

    public SquareRequest( ) {
        value = -1;
        stop = true;
    }

    public SquareRequest( int i ) {
        value = i;
        stop = false;
    } 

    public SquareRequest( boolean b ) {
        value = -1;
        stop = b;
    }

    public SquareRequest( int i, boolean b ) {
        value = i;
        stop = true;
    } 
    
    public int getValue(){
        return value;
    }

}
