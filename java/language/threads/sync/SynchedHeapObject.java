package tests.sync;

import java.lang.Math;
class SynchedHeapObject implements HeapObject{

    private long value;
    private static long sValue = 0;

    public SynchedHeapObject(){
        value = 0;
    }

    public SynchedHeapObject getObject(){
        return this;
    }

    public synchronized void increment(){
        value++;
    }

    public synchronized void decrement(){
        value+=-2;
    }

    public synchronized void Increment(){
        sValue++;
    }

    public synchronized void Decrement(){
        sValue+=-2;
    }

    public void writeValue(long i){
        value = i;
    }

    public long readValue(){
        return value;
    }

    public void WriteStatic(long i, long j){
        i = j;
    }

    public long ReadStatic(){
        return sValue;
    }

    public static long getStatic(){
        return sValue;
    }
    
    public long operateAndWriteValue(long i){
        value += i;
        value += (long)Math.sqrt(value);
        return value;
    }

    public long OperateAndWriteStatic(long i){
        sValue += i;
        sValue += (long)Math.sqrt(sValue);
        return sValue;
    }

    public void add(long l){
        value += l;
    }

    public static void Add(long l){
        sValue += l;
    }

}
