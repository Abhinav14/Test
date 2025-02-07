package basicprograms;

public class ReverseAString {
    public static void main(String[] args) {
        //StringBuilder sb = new StringBuilder("Abhinav");
        //System.out.println(sb.reverse());
        System.out.println(reverseString("Abhinav"));
    }

    public static String reverseString(String str){
        char[] charArr = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = charArr.length-1; i >= 0; i--){
            sb.append(charArr[i]);
        }
        return sb.toString();
    }
}
