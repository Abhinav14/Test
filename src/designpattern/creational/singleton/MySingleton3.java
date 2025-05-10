package designpattern.creational.singleton;

public class MySingleton3 {

    private static MySingleton3 instance;

    private MySingleton3(){
        if(instance != null){
            throw new RuntimeException("Use getInstance() to get instance of the class.");
        }
    }

    public static MySingleton3 getInstance(){
        if(instance == null){
            synchronized (MySingleton3.class){
                if(instance == null){
                    instance = new MySingleton3();
                }
            }
        }
        return instance;
    }
}
