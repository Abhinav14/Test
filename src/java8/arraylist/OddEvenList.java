package java8.arraylist;

//Given a list of integers, separate odd and even numbers

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddEvenList {
    public static void main(String[] args) {
        List<Integer> oddEvenList = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        List<Integer> evenNumberList = new ArrayList<>();
        List<Integer> oddNumberList = new ArrayList<>();

        evenNumberList = oddEvenList.stream().filter(x->x%2==0).toList();
        oddNumberList = oddEvenList.stream().filter(y -> y>0).filter(z->z%2 > 0).toList();
        System.out.println("Even numbers are : ");
        evenNumberList.stream().forEach(e-> System.out.println(" "+e));
        System.out.println("Odd numbers are : ");
        oddNumberList.stream().forEach(o-> System.out.println(" "+o));
    }

}
