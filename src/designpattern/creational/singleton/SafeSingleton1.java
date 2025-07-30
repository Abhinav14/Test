package designpattern.creational.singleton;

import java.io.Serializable;

public class SafeSingleton1 implements Serializable {

    //serialVersionUID for Serializable compatibility
    private static final Long serialVersionUID = 1L;

    //Reflection proof
    private SafeSingleton1(){
        if(Holder.INSTANCE != null){
            throw new RuntimeException("Use getInstance() method");
        }
    }
    //Inner class to instantiate SafeSingleton1. This inner class is static, so will be loaded only once.
    private static class Holder{
        private static final SafeSingleton1 INSTANCE = new SafeSingleton1();
    }

    //Lazy loading of inner class when getInstance() is called.
    public static SafeSingleton1 getInstance(){
        return Holder.INSTANCE;
    }

    //prevent singleton breakage through deserialization
    protected Object readResolve(){
        return getInstance();
    }

    protected Object clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException("Cloning of this class is not allowed");
    }

}
