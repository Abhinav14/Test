package java8.types;

import java.util.function.Function;

public class FunctionImpl {
    public static void main(String[] args) {
        Function<Integer, String> intToString = (Integer num) -> num.toString();

        System.out.println(intToString.apply(64));
    }
}
