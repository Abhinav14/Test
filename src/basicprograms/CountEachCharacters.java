package basicprograms;

import java.util.HashMap;
import java.util.Map;

public class CountEachCharacters {
    private static Map<Character, Integer> countChars(String str){
        char[] charArr = str.toCharArray();
        Map<Character, Integer> charMap = new HashMap<>();
        for(int i = 0; i < charArr.length; i++){
            if(charArr[i] != ' '){
                if(charMap.containsKey(charArr[i])){
                    charMap.put(charArr[i], charMap.get(charArr[i])+1);
                }else{
                    charMap.put(charArr[i], 1);
                }
            }
        }
        return charMap;
    }

    public static void main(String[] args) {
        String str = "Java J2EE Java JSP J2EE";
        countChars(str).entrySet().stream().forEach(x-> System.out.println("Char: "+x.getKey()+", Count: "+x.getValue()));
    }

}
