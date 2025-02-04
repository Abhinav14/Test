package java8.all;


import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//How do you find frequency of each character in a string using Java 8 streams?
public class CountFrequencyOfChars {
    public static void main(String[] args) {
        String inputString = "My name is Abhinav Anant";

        /*Map<Character, Long> charCountMap = inputString.toLowerCase().chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(charCountMap);*/

        Map<Character, Long> charCountMap = inputString.toLowerCase()
                .chars().filter(x->!Character.isWhitespace(x))
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(charCountMap);

    }
}
