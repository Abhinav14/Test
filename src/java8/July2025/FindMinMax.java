package java8.July2025;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Given a list of integers, find maximum and minimum of those numbers?
public class FindMinMax {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        int min = list.stream().min(Comparator.naturalOrder()).get();

        int max = list.stream().max(Comparator.naturalOrder()).get();

        System.out.println("Min: "+min+", Max: "+max);

        int min1 = list.stream().sorted().findFirst().get();

        int max1 = list.stream().sorted(Comparator.reverseOrder()).findFirst().get();

        System.out.println("Min: "+min1+", Max: "+max1);

    }
}
