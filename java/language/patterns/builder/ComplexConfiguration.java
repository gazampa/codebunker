package com.example;
import java.util.HashMap;
public class ComplexConfiguration {

    /**
     * 
     * Class Body
     * 
     * 
     */

    public Builder Builder(){
        return new Builder();
    }

    public static class Builder{

        public static final int defaultValue = 10;
        public int prop1;
        public boolean prop2;
        public String prop3;
        public HashMap<String, String> mapOfProps = new HashMap<String, String>();

        public Builder setProperty1(int val){
            prop1 = val;
            return this;
        }

        public Builder setProperty2(boolean val){
            prop2 = val;
            return this;
        }

        public Builder setProperty3(String val){
            prop3 = val;
            return this;
        }

        public Builder setPropertyList(HashMap configList){
            mapOfProps = configList;
            return this;
        }

        public Builder setPropertyListElement(String key, String val){
            mapOfProps.put(key,val);
            return this;
        }

    }

}
