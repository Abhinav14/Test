package java8.arraylist;

import java.util.Arrays;
import java.util.List;

//How do you remove duplicate elements from a list using Java 8 streams
public class RemoveDuplicateFromList {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("Delhi", "Bangalore", "Gurgaon", "Noida", "Delhi", "Noida");
        System.out.println("Before removing duplicate : =====>");
        myList.forEach(System.out::println);
        System.out.println("After removing duplicates : =====>");
        myList.stream().distinct().forEach(System.out::println);
    }
}
