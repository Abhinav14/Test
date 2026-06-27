package java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Ex2 {
    public static void main(String[] args) {
        Predicate<Integer> findEven = (a) -> a % 2 == 0;
        List<Integer> arrList = new ArrayList<>();
        arrList.add(2);
        arrList.add(3);
        arrList.add(4);
        arrList.add(5);

        //arrList.stream().filter(findEven).forEach(x-> System.out.println(x));
        Integer i = arrList.stream().skip(2).findFirst().get();

        System.out.println(i);
    }
}
