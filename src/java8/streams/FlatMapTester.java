package java8.streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapTester {
    public static void main(String[] args) {
        /*List<List<String>> sentenceList = Arrays.asList(
                Arrays.asList("This", "is", "Abhinav"),
                Arrays.asList("He", "Lives", "In", "Heritage", "Max"),
                Arrays.asList("Sector", "102", "Gurgaon")
        );

        //sentenceList.stream().flatMap(List::stream).forEach(x-> System.out.print(" "+x));*/

        List<List<Integer>> myList = Arrays.asList(Arrays.asList(1,2,3), Arrays.asList(4,5,6), Arrays.asList(7,8,9));

        //List<Integer> tempList = myList.stream().flatMap(list->list.stream()).toList();
        //tempList.stream().sorted(Comparator.reverseOrder()).forEach(x-> System.out.print(x+" "));
        myList.stream().flatMap(list->list.stream()).sorted(Comparator.reverseOrder()).forEach(x-> System.out.print(x+" "));
    }
}
