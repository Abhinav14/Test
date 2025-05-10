package designpattern.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*  Create one instanc using getInstance().
    Declare another instance of your singleton and assign null to it.
    Get your singleton class ref. From that classRef, get constructor.
    Set setAccessible of constructor to true.
    Instantiate the declared instance of  with null */

public class MySingleton3Runner {
    public static void main(String[] args) {
        /*MySingleton3 instance1 = MySingleton3.getInstance();
        MySingleton3 instance2 = MySingleton3.getInstance();
        System.out.println("instance1: "+instance1.hashCode());
        System.out.println("instance2: "+instance2.hashCode());*/

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                MySingleton3 instance1 = MySingleton3.getInstance();
                System.out.println("instance1: "+instance1.hashCode());
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                MySingleton3 instance2 = MySingleton3.getInstance();
                System.out.println("instance2: "+instance2.hashCode());
            }
        });
        t1.start();
        t2.start();

        MySingleton3 obj1 = MySingleton3.getInstance();
        MySingleton3 obj2 = null;
        MySingleton3 obj3 = MySingleton3.getInstance();

        Class<MySingleton3> classRef = MySingleton3.class;
        try{
            Constructor<MySingleton3> constructor = classRef.getDeclaredConstructor();
            constructor.setAccessible(true);
            obj2 = constructor.newInstance();
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Obj1: "+obj1.hashCode());
        System.out.println("Obj2: "+obj2.hashCode());
        System.out.println("Obj3: "+obj3.hashCode());
    }
}
