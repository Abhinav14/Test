package designpattern.creational.singleton;

public class MySingleton2Runner {
    public static void main(String[] args) {
       /* MySingleton2 obj1 = MySingleton2.getInstance();
        MySingleton2 obj2 = MySingleton2.getInstance();
        System.out.println("Obj1: "+obj1.hashCode());
        System.out.println("Obj2: "+obj2.hashCode());*/

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                MySingleton2 obj1 = MySingleton2.getInstance();
                System.out.println("Instance1: "+obj1.hashCode());
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                MySingleton2 obj2 = MySingleton2.getInstance();
                System.out.println("Instance2: "+obj2.hashCode());
            }
        });

        t1.start();
        t2.start();
    }
}
