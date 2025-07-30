package java8.July2025;

import java.util.Arrays;
import java.util.List;

//From the given list of integers, print the numbers which are multiples of 5?
public class FindDivisibleBy5 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        list.stream().filter(x->x%5==0).forEach(x-> System.out.println(x));
    }
}
