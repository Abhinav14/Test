package broCode.dynamicArray;

public class DynamicArrayRunner {
    public static void main(String[] args) {

        DynamicArray dynamicArray = new DynamicArray();

        dynamicArray.add(9);
        dynamicArray.add(6);
        dynamicArray.add(11);
        dynamicArray.add(17);
        dynamicArray.add(21);

        System.out.println(dynamicArray);
        System.out.println("empty: "+dynamicArray.isEmpty());
        dynamicArray.insert(1, 2);
        System.out.println("====================");
        System.out.println(dynamicArray);
        dynamicArray.delete(17);
        System.out.println("Post delete: "+dynamicArray);
    }
}
