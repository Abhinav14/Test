package designpattern.creational.singleton;

//A singleton class allows only one instance of itself to be created and provides a global point of access to it.
public class MySingleton4Eager {

    private static final MySingleton4Eager instance = new MySingleton4Eager();

    private MySingleton4Eager(){}

    public static MySingleton4Eager getInstance(){
        return instance;
    }


}

//Pros: Simple, thread-safe
//Cons: Instance created even if not used
