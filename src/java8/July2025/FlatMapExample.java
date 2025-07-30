package java8.July2025;

import java.util.Arrays;
import java.util.List;

public class FlatMapExample {
    public static void main(String[] args) {
        List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11, 13);
        List<Integer> OddNumbers = Arrays.asList(1, 3, 5);
        List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8);
        List<List<Integer>> listOfListofInts = Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers);

        List<Integer> flattenList = listOfListofInts.stream().flatMap(list->list.stream()).toList();

        System.out.println(flattenList);
    }
}
