package august2025;

public class SafeSingletonTester {
    public static void main(String[] args) {
        SafeSingleton obj1 = SafeSingleton.getInstance();
        SafeSingleton obj2 = SafeSingleton.getInstance();
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
    }
}
