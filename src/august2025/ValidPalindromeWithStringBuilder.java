package august2025;

import java.util.Arrays;

public class ValidPalindromeWithStringBuilder {
    private static boolean isPalindrome(String str){
        StringBuilder sb = new StringBuilder(str.toLowerCase());
        String updatedStr = sb.reverse().toString();
        if(str.equals(updatedStr)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "Malayalame";
        System.out.println(isPalindrome(str));
    }
}
