package java8.July2025;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//How do you get last element of an array?
public class FindLastElement {
    public static void main(String[] args) {

        String[] strArr = {"One", "Two", "Three", "Four", "Five", "Six"};

        //conventional approach
        String result = strArr[strArr.length-1];
        System.out.println("Using conventional approach: "+result);

        //java-8
        String lastString = Arrays.stream(strArr).skip(strArr.length-1).findFirst().get();
        System.out.println("Using java-8 approach: "+lastString);

        /*Optional<String> lastElement = Arrays.stream(strArr).skip(strArr.length - 1).findFirst();
        System.out.println(lastElement.get());*/
    }
}
