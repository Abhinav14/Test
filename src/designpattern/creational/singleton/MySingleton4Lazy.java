package designpattern.creational.singleton;

public class MySingleton4Lazy {
    private static MySingleton4Lazy instance;

    private MySingleton4Lazy(){}

    public static MySingleton4Lazy getInstance(){
        if(instance == null){
            instance = new MySingleton4Lazy();
        }
        return instance;
    }
}

//Cons: Not thread-safe. Multiple threads may create multiple instances.
