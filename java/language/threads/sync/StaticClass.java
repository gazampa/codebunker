package tests.sync;

class StaticClass {

    static Integer ExposedStaticInteger = 0;

    static Integer SynchedInteger = 0;

    static void Increment(){
        ExposedStaticInteger++;
        Syncinc();
    }

    static void Decrement(){
        ExposedStaticInteger+=-2;
            Syncdec();
    }

    static synchronized void Syncinc(){
        SynchedInteger++;
    }

    static synchronized void Syncdec(){
        SynchedInteger+=-2;
    }
}
