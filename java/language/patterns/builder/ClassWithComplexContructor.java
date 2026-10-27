package com.example;
import java.util.HashMap;

class ClassWithComplexContructor{
    // fields
    int field1;
    boolean field2;
    String field3;
    HashMap<String,String> field4;

    // instantiate a builder class and set values for the fields
    ComplexConfiguration.Builder conf = new ComplexConfiguration.Builder()
                                            .setProperty1(5)
                                            .setProperty2(false)
                                            .setProperty3("prop3").
                                            setPropertyListElement("prop1", "val1");

    //simplified constructor                                        
    public ClassWithComplexContructor(ComplexConfiguration.Builder conf){
        field1=conf.prop1;
        field2=conf.prop2;
        field3=conf.prop3;
        field4=conf.mapOfProps;

    }

}