package misc;

import java.util.Arrays;

public class StringTester {
    public static void main(String[] args) {
        String str = "abhinav";
        /*char[] charArr = str.toCharArray();
        for(Character c : charArr){
            System.out.println(c);
        }*/
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb.toString());

        //System.out.println(str.charAt(2));

    }
}
