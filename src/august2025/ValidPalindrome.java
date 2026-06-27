package august2025;

public class ValidPalindrome {

    private static boolean isPalindrome(String str){
        char[] arr = str.toLowerCase().toCharArray();
        for(int i = 0; i < arr.length/2; i++){
            if(arr[i] != arr[arr.length-1-i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "Malayalam";
        System.out.println(isPalindrome(str));
    }
}
