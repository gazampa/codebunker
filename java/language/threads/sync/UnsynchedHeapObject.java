package tests.sync;

import java.lang.Math;
class UnsynchedHeapObject implements HeapObject{

    private long value;
    private static long sValue = 0;

    public UnsynchedHeapObject(){
        value = 0;
    }

    public HeapObject getObject(){
        return this;
    }

    public void increment(){
        value++;
    }

    public void decrement(){
        value+=-2;
    }

    public void Increment(){
       sValue++;
    }

    public void Decrement(){
        sValue+=-2;
    }

    public void writeValue(long i){
        value = i;
    }

    public long readValue(){
        return value;
    }

    public long ReadStatic(){
        return sValue;
    }

    public static long getStatic( ){
        return sValue;
    }

    public static void WriteStatic(long i){
        sValue = i;
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
