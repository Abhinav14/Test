package java8.July2025;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day".replaceAll(" ", "").toLowerCase();

        //java-8 way
        Map<String, Long> charCountMap = Arrays.stream(inputString.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        String result = charCountMap.entrySet().stream().filter(entry -> entry.getValue()==1).map(entry -> entry.getKey()).findFirst().get();

        System.out.println(result);

        //conventional approach

    }
}
