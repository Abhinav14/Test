package basicprograms;

public class CheckBinaryNumber {
    private static boolean isBinary(int number){
        int temp = 0;
        while(number != 0){
            temp = number%10;
            if(!(temp==0 || temp==1)){
                return false;
            }
            number = number/10;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isBinary(101110));
    }
}
