package java8.July2025;

import java.util.Arrays;
import java.util.Comparator;

public class ReverseSortArray {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{12, 23, 17, 42, 33, 71, 56, 21};
        //sorted(Comparator.reverseOrder()) not possible in case of array--Arrays.stream(arr).sorted()....
    }
}
