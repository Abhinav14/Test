package designpattern.creational.singleton;

public class MySingleton2 {
    private static volatile MySingleton2 singletonObj;

    private MySingleton2(){
        if(singletonObj != null){
            throw new RuntimeException("use getInstance() method to craete instance");
        }
    }

    public static MySingleton2 getInstance(){
        if (singletonObj == null){
           synchronized(MySingleton2.class){
               if(singletonObj == null){
                   singletonObj = new MySingleton2();
               }
           }
        }
        return singletonObj;
    }
}
