package java8.July2025.grouping;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//How do you find frequency of each character in a string using Java 8 streams?
public class FrequencyOfEachChar {
    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day";
        String finalString = inputString.replace(" ", "");
        /*char[] charArr = finalString.toCharArray();
        Map<Character, Integer> hmap = new LinkedHashMap<>();
        for (Character c : charArr){
            if(hmap.containsKey(c)){
                hmap.put(c, hmap.get(c)+1);
            }else {
                hmap.put(c, 1);
            }
        }
        hmap.entrySet().stream().forEach(x-> System.out.println("Char: "+x.getKey()+", Frequency: "+x.getValue()));*/

       // Map<Character, Long> charCountMap = inputString.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

      //  System.out.println(charCountMap);

       // Map<Character, Long> charCountMap2 = finalString.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
      //  System.out.println(charCountMap2);

        Map<Character, Long> charCount3 = finalString.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(charCount3);

    }
}
