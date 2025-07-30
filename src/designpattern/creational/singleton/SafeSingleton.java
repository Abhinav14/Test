package designpattern.creational.singleton;

import java.io.Serializable;

public class SafeSingleton implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;

    private SafeSingleton(){
        if(Holder.INSTANCE != null){
            throw new RuntimeException("Use getInstance() method");
        }
    }

    private static class Holder{
        private static final SafeSingleton INSTANCE = new SafeSingleton();
    }

    public static SafeSingleton getInstance(){
        return Holder.INSTANCE;
    }

    //make serializable safe
    protected Object readResolve(){
        return getInstance();
    }

    //make cloneable safe
    protected Object clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException("Cloning is of this singleton is not allowed");
    }
}
