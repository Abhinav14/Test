package june2026.dsa.interview_prep;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static Character findFirstNonRepeating(String str){
        char[] charArr = str.toCharArray();
        Map<Character, Integer> charCount = new LinkedHashMap<>();
        for(char c : charArr){
            if(charCount.containsKey(c)){
                charCount.put(c, charCount.get(c)+1);
            }else{
                charCount.put(c, 1);
            }
        }

        for(Map.Entry<Character, Integer> entry : charCount.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return null;
    }

    public static Character findFirstNonRepeatingChar(String str){
        char[] charArr = str.toCharArray();
        Map<Character, Integer> countMap = new HashMap<>();
        for(char c : charArr){
            if(countMap.containsKey(c)){
                countMap.put(c, countMap.get(c)+1);
            }else{
                countMap.put(c, 1);
            }
        }

        for(char c : charArr){
            if(countMap.get(c) == 1){
                return c;
            }
        }
        return null;
    }


    public static void main(String[] args) {
        String str = "level";
        System.out.println(findFirstNonRepeating(str));
        System.out.println(findFirstNonRepeatingChar(str));
    }
}
