package java8.all;


import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//How do you merge two unsorted arrays into single sorted array without duplicates?
public class MergeArraysAndSort {
    public static int[] mergeAndSort(int[] a, int[] b){
        int[] result = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().distinct().toArray();
        return result;
    }

    public static void main(String[] args) {
        String commaSeparatedString = Arrays.stream(mergeAndSort(new int[] {4, 2, 5, 1}, new int[] {8, 1, 9, 5}))
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(","));
        System.out.println(commaSeparatedString);
    }
}
