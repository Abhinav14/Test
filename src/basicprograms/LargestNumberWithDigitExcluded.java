package basicprograms;

public class LargestNumberWithDigitExcluded {
    private static int getNumber(int number, int digit){
        //converting digit to char
        char c = Integer.toString(digit).charAt(0);
        for(int i = number; i > 0; i--){
            if(Integer.toString(i).indexOf(c) == -1){
                //if 'i' doesnt contain 'c'
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(getNumber(143, 4));
    }
}
