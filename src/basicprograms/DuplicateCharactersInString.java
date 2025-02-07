package basicprograms;

import java.util.*;

public class DuplicateCharactersInString {
    public static Map<Character, Integer> findDuplicates(String str){
        Map<Character, Integer> linkedHMap = new LinkedHashMap<>();
        char[] charArr = str.toCharArray();
        for(Character c : charArr){
            if(linkedHMap.containsKey(c)){
                linkedHMap.put(c, linkedHMap.get(c)+1);
            }else{
                linkedHMap.put(c, 1);
            }
        }
        Map<Character, Integer> resultMap = new LinkedHashMap<>();
        for(Map.Entry<Character, Integer> kv : linkedHMap.entrySet()){
            if(kv.getValue()>1){
                resultMap.put(kv.getKey(), kv.getValue());
            }
        }
        return resultMap;
    }

    public static void main(String[] args) {
        String str = "JavaJ2EE";
        findDuplicates(str).entrySet().stream().forEach(x-> System.out.println("Key: "+x.getKey()+", Value: "+x.getValue()));
    }
}
