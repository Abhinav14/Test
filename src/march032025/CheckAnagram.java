package march032025;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CheckAnagram {

    private static boolean isAnagramLF(String str1, String str2){
        char[] charArr1 = str1.toCharArray();
        char[] charArr2 = str2.toCharArray();
        Arrays.sort(charArr1);
        Arrays.sort(charArr2);

        if(charArr1.length != charArr2.length){
            return false;
        }
        for(int i = 0; i < charArr1.length; i++){
            if(charArr1[i] != charArr2[i]){
                return false;
            }
        }
        return true;
    }

    private static boolean isAnagram(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        char[] charArr1 = str1.toCharArray();
        char[] charArr2 = str2.toCharArray();
        Map<Character, Integer> hMap = new HashMap<>();
        for(Character c : charArr1){
            if(hMap.containsKey(c)){
                hMap.put(c, hMap.get(c)+1);
            }else{
                hMap.put(c, 1);
            }
        }
        for(Character c : charArr2){
            if(hMap.containsKey(c)){
                hMap.put(c, hMap.get(c)-1);
                if(hMap.get(c) == 0){
                    hMap.remove(c);
                }
            }else{
                return false;
            }
        }
        return hMap.isEmpty();
    }

    public static void main(String[] args) {
        String str1 = "eat";
        String str2 = "tea";

        System.out.println(isAnagram(str1, str2));
    }
}
