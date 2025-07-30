package java8.July2025;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter?
public class JoiningExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");

        String joinedString = list.stream().collect(Collectors.joining(", ", "[", "]"));

        System.out.println(joinedString);
    }
}
