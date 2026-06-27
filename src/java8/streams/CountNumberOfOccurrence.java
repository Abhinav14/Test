package java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Count the number of occurrence of words in given string.
public class CountNumberOfOccurrence {
    public static void main(String[] args) {
        String str = "welcome to heritage max and heritage max welcome you";
        /*List<String> list = Arrays.asList(str.split(" "));
        System.out.println("Size of the String: "+list.size());
        Map<String, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);*/

        String[] strArr = str.split(" ");
        List<String> strList = Arrays.asList(strArr);
        //Map<String, Long> collect = strList.stream().collect(Collectors.groupingBy(word -> word, Collectors.counting()));
        Map<String, Long> collect = strList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);


    }
}
