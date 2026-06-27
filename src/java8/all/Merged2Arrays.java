package java8.all;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Merged2Arrays {
    private static int[] mergeArrays(int[] arr1, int[] arr2){
        return IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).toArray();
    }

    public static void main(String[] args) {

    }
}
