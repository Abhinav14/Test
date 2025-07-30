package java8.July2025;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//How do you sort the given list of integers in reverse order?
public class ReverseList {
    public static void main(String[] args) {
        List<Integer>  list = Arrays.asList(12, 23, 17, 42, 33, 71, 56, 21);
        list.stream().sorted(Comparator.reverseOrder()).forEach(x-> System.out.println(x));
    }
}
