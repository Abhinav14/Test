package basicprograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CheckAnagram {
    public static void main(String[] args) {
        String str1 = "jkjkkj";
        String str2 = "ioioioio";
        char[] chArr1 = str1.toCharArray();
        char[] chArr2 = str2.toCharArray();
        Arrays.sort(chArr1);
        Arrays.sort(chArr2);
        //System.out.println(Arrays.equals(chArr1, chArr2));
        System.out.println(checkStringsAnagram1(str1, str2));
    }

    public static boolean checkStringsAnagram1(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }

        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2);
    }

    public static boolean checkStringsAnagram2(String str1, String str2){
        char[] charArr1 = str1.toCharArray();
        char[] charArr2 = str2.toCharArray();
        if(charArr1.length != charArr2.length){
            return false;
        }
        Map<Character, Integer> hMap = new HashMap<>();
        for(Character c : charArr1){
            if(hMap.containsKey(c)){
                hMap.put(c, hMap.get(c)+1);
            }else{
                hMap.put(c, 1);
            }
        }
        for(Character ch : charArr2){
            if (hMap.containsKey(ch)){
                if(hMap.get(ch)){}
            }
        }
    }
}
