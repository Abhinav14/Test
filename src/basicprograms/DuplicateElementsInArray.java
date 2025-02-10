package basicprograms;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElementsInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 1, 6, 8, 3, 3};
        Map<Character, Long> charCountMap = Arrays.stream(arr).flatMap(num -> String.valueOf(num).chars()).mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        charCountMap.entrySet().stream().filter(x->x.getValue()>1).forEach(y-> System.out.println("Key: "+y.getKey()+", Value: "+y.getValue()));
    }

}
