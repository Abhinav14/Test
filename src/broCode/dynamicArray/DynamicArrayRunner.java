package broCode.dynamicArray;

public class DynamicArrayRunner {
    public static void main(String[] args) {

        DynamicArray dynamicArray = new DynamicArray();

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");

        System.out.println(dynamicArray);
        System.out.println("empty: "+dynamicArray.isEmpty());
    }
}
