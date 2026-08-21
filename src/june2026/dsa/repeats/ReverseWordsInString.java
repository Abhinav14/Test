package june2026.dsa.repeats;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String str = "My name is Abhinav Anant";
        System.out.println(reverseWords(str));
    }

    private static String reverseWords(String str){
        String[] words = str.trim().split("\\s+");
        int left = 0, right = words.length-1;

        while(left < right){
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }
        return String.join(" ", words);
    }
}
