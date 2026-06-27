package august2025;

import java.io.Serializable;

public class SafeSingleton implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;

    private SafeSingleton(){
        if(Holder.INSTANCE != null){
            throw new RuntimeException("Use getInstance()");
        }
    }

    private static class Holder{
        private static final SafeSingleton INSTANCE = new SafeSingleton();
    }

    public static SafeSingleton getInstance(){
        return Holder.INSTANCE;
    }

    protected Object readResolve(){
        return getInstance();
    }

    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("It can't be cloned");
    }

}
