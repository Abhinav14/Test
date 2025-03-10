package march032025;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateFromListJ8 {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("Abhinav", "Abhinav", "Anusha", "Anant", "Varma", "Varma");
        myList.stream().distinct().forEach(x-> System.out.println(x));
    }
}
