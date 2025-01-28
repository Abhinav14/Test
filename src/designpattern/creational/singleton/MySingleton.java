package designpattern.creational.singleton;

public class MySingleton {
    private static volatile MySingleton soleInstance;
    private MySingleton(){
            if(soleInstance != null){
                throw new RuntimeException("Use getInstance() to create instance");
            }
        }

        public static MySingleton getInstance(){
            if(soleInstance == null){
                synchronized (MySingleton.class){
                    if(soleInstance == null){
                        soleInstance = new MySingleton();
                    }
                }
            }
            return soleInstance;
        }

    }

