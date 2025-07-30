package java8.July2025.grouping;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FreqOfCharInAWord {
    public static void main(String[] args) {
        String str = "apple";
        Map<Character, Long> countChar = str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(countChar);
    }
}
