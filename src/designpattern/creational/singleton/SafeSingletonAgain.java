package designpattern.creational.singleton;

import java.io.Serializable;

public class SafeSingletonAgain implements Serializable, Cloneable {

    private static final Long serialVersionUID = 1L;

    private static class Holder{
        private static final SafeSingletonAgain INSTANCE = new SafeSingletonAgain();
    }

    private SafeSingletonAgain(){
        if(Holder.INSTANCE != null){
            throw new RuntimeException("Use getInstance() for creating instance of this class.");
        }
    }

    public static SafeSingletonAgain getInstance(){
        return Holder.INSTANCE;
    }

    protected Object readResolve(){
        return getInstance();
    }

    protected Object clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException("This class cant be cloned.");
    }

}
