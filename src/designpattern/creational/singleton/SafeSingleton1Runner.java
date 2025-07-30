package designpattern.creational.singleton;

import java.io.*;

public class SafeSingleton1Runner {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        SafeSingleton1 instance1 = SafeSingleton1.getInstance();

        //Serialize to file
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
        oos.writeObject(instance1);
        oos.close();

        //Deserialize from file
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("singleton.ser"));
        SafeSingleton1 instance2 = (SafeSingleton1) ois.readObject();
        ois.close();

        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());

    }
}
