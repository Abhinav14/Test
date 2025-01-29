package basicprograms;

import java.util.Arrays;

public class CheckAnagram {
    public static void main(String[] args) {
        String str1 = "jkjkkj";
        String str2 = "ioioioio";
        char[] chArr1 = str1.toCharArray();
        char[] chArr2 = str2.toCharArray();
        Arrays.sort(chArr1);
        Arrays.sort(chArr2);
        //System.out.println(Arrays.equals(chArr1, chArr2));
        System.out.println(checkStringsAnagram(str1, str2));
    }

    public static boolean checkStringsAnagram(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }

        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(Arrays.equals(ch1, ch2)){
            return true;
        }
        return false;
    }
}
