package designpattern.creational;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MySingletonRunner {
    public static void main(String[] args) {
        MySingleton obj1 = MySingleton.getInstance();
        MySingleton obj2 = null;
        MySingleton obj3 = MySingleton.getInstance();
        try{
            Constructor<? extends MySingleton> constructor = MySingleton.getInstance().getClass().getDeclaredConstructor();
            constructor.setAccessible(true);
            obj2 = (MySingleton) constructor.newInstance();
        } catch (NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println("Obj1: "+obj1.hashCode());
        System.out.println("Obj3: "+obj3.hashCode());
        System.out.println("Obj2: "+obj2.hashCode());
    }
}
