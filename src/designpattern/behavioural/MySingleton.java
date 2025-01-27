package designpattern.behavioural;

public class MySingleton {
    private static volatile MySingleton soleInstance;
    private MySingleton(){
            if(soleInstance != null){
                throw new RuntimeException("Use getInstance() to create instance");
            }
        }

        public static MySingleton getInstance(){}

    }
}
