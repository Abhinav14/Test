package java8.July2025;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CheckAnagramJava8 {

    public static boolean checkAnagramWithLibraryFunc(String s1, String s2){
        char[] charArr1 = s1.toLowerCase().toCharArray();
        char[] charArr2 = s2.toLowerCase().toCharArray();

        Arrays.sort(charArr1);
        Arrays.sort(charArr2);

        if (charArr1.length!=charArr2.length){
            return false;
        }else {
            for(int i = 0; i < charArr1.length; i++){
                if(charArr1[i] != charArr2[i]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "RaceCar";
        String s2 = "CarRace";

        //System.out.println(checkAnagramWithLibraryFunc(s1, s2));

        String s3 = Stream.of(s1.split("")).map(x->x.toLowerCase()).sorted().collect(Collectors.joining());
        String s4 = Stream.of(s2.split("")).map(x->x.toLowerCase()).sorted().collect(Collectors.joining());
        if(s3.equals(s4)){
            System.out.println("Both strings are anagram");
        }else{
            System.out.println("Both strings are not anagram");
        }

    }
}
