package designpattern.creational.singleton;

import java.sql.SQLOutput;

public class MySingleton4Tester {
    public static void main(String[] args) {
        MySingleton4Lazy obj1 = MySingleton4Lazy.getInstance();
        MySingleton4Lazy obj2 = MySingleton4Lazy.getInstance();

        System.out.println("Instance-1: "+obj1.hashCode());
        System.out.println("Instance-2: "+obj2.hashCode());
    }
}
