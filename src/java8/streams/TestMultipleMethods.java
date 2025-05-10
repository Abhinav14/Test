package java8.streams;

import java.util.List;
import java.util.function.Predicate;

public class TestMultipleMethods {

    public static void main(String[] args) {
        List<Integer> intList = List.of(1,2,3,4,5,6,7,8,9,10);

        Predicate<Integer> predicate = (p) ->{
            boolean result = p%2==0?true:false;
            return result;
        };

        intList.stream().filter(predicate).forEach(x-> System.out.print(" "+x));

    }
}
