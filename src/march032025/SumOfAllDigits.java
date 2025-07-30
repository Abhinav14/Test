package march032025;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfAllDigits {
    public static void main(String[] args) {
        int i = 15623;
        /*int result = 0;
        int temp = 0;
        int remainder = 0;
        while(i>0){
            remainder = i%10;
            i = i/10;
            result = result+remainder;
        }
        System.out.println(result);*/

        Integer sumOfDigits = Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));
        System.out.println(sumOfDigits);
    }
}
