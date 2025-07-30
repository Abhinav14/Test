package java8.July2025;

import java.util.*;
import java.util.stream.Collectors;

//How do you remove duplicate elements from a list using Java 8 streams?
public class RemoveDuplicateElements {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        /*Set<String> uniqueSet = new LinkedHashSet<>(listOfStrings);
        uniqueSet.stream().forEach(x-> System.out.println(x));*/
        List<String> uniqueList = listOfStrings.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueList);
    }
}
