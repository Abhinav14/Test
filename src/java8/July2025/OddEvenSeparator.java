package java8.July2025;

import java.util.Arrays;
import java.util.List;

//Given a list of integers, separate odd and even numbers
public class OddEvenSeparator {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        List<Integer> evenList = listOfIntegers.stream().filter(x->x%2==0).toList();
        List<Integer> oddList = listOfIntegers.stream().filter(x->x%2!=0).toList();
        System.out.println("Even Numbers are:");
        evenList.stream().forEach(x-> System.out.println(x));
        System.out.println("--------------------------");
        System.out.println("Odd Numbers are:");
        oddList.stream().forEach(x-> System.out.println(x));
    }
}
