package designpattern.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class FinalSingletonTester {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //-------Check reflection first---------
        /*FinalSingleton obj1 = FinalSingleton.getInstance();
        FinalSingleton obj2 = null;
        FinalSingleton obj3 = FinalSingleton.getInstance();

        Class<FinalSingleton> classRef = FinalSingleton.class;

        try {
            Constructor<FinalSingleton> constructor = classRef.getDeclaredConstructor();
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

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj3.hashCode());*/

        //-------Check reflection first---------

        //-------Check Serializable-------------
        FinalSingleton instance1 = FinalSingleton.getInstance();

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("FinalSingleton.ser"));
        oos.writeObject(instance1);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("FinalSingleton.ser"));
        FinalSingleton instance2 = (FinalSingleton) ois.readObject();
        ois.close();

        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());

        //-------Check Serializable-------------
    }
}
