package java8.all;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountFrequencyOfWords {
    public static void main(String[] args) {
        String inputString = "My name is Abhinav and Abhinav is a good guy";
        String[] words = inputString.toLowerCase().split(" ");
        Map<String, Integer> wordCountMap = new HashMap<>();
        for(String word : words){
            if(wordCountMap.containsKey(word)){
                wordCountMap.put(word, wordCountMap.get(word)+1);
            }else{
                wordCountMap.put(word, 1);
            }
        }
        System.out.println(wordCountMap);
    }
}
