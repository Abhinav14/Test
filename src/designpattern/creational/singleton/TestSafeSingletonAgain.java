package designpattern.creational.singleton;

import java.io.*;

public class TestSafeSingletonAgain {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SafeSingletonAgain obj1 = SafeSingletonAgain.getInstance();
        SafeSingletonAgain obj2 = SafeSingletonAgain.getInstance();
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());

        SafeSingletonAgain ins1 = SafeSingletonAgain.getInstance();

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("safeAgain.ser"));
        oos.writeObject(ins1);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("safeAgain.ser"));
        SafeSingletonAgain ins2 = (SafeSingletonAgain) ois.readObject();
        ois.close();

        System.out.println(ins1.hashCode());
        System.out.println(ins2.hashCode());

    }
}
