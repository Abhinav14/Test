package designpattern.creational.singleton;

public class MySingleton4LazyThreadSafe {
    private static MySingleton4LazyThreadSafe instance;

    private MySingleton4LazyThreadSafe(){}

    public static MySingleton4LazyThreadSafe getInstance(){
        if(instance == null){
            synchronized (MySingleton4LazyThreadSafe.class){
                if(instance ==null){
                    instance = new MySingleton4LazyThreadSafe();
                }
            }
        }
        return instance;
    }
}
