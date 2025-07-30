package designpattern.creational.singleton;

import java.io.Serializable;

public class FinalSingleton implements Serializable, Cloneable {

    private static final Long serialVersionUID = 1L;

    private static class Holder{
        private static final FinalSingleton INSTANCE = new FinalSingleton();
    }

    private FinalSingleton(){
        if(Holder.INSTANCE != null){
            throw new RuntimeException("Use getInstance() for instance creation.");
        }
    }

    public static FinalSingleton getInstance(){
        return Holder.INSTANCE;
    }

    protected Object readResolve(){
        return getInstance();
    }

    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("This class can't be cloned");
    }
}
