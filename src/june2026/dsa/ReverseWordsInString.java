package june2026.dsa;

import java.util.Arrays;
import java.util.Collections;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String str = "This is Abhinav Anant";
        System.out.println(reverseWord(str));
    }

    private static String reverseWord(String str){
        String[] words = str.trim().split("\\s+");
        int length = words.length;
        for(int i = 0; i < length/2; i++){
           String s = words[i];
           words[i] = words[length-1-i];
           words[length-1-i] = s;
        }
        return String.join(" ", words);
    }
}
