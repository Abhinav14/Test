package java8.July2025;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//How do you get three maximum numbers and three minimum numbers from the given list of integers?
public class Find3MaxAndMinFromList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        System.out.println("-----------------------");
        System.out.println("---Min 3 Numbers are---");
        System.out.println("-----------------------");
        list.stream().sorted().limit(3).forEach(System.out::println);
        System.out.println("-----------------------");
        System.out.println("---Max 3 Numbers are---");
        System.out.println("-----------------------");
        list.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
    }
}
