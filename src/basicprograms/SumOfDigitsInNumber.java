package basicprograms;

public class SumOfDigitsInNumber {
    private static int sumOfDigits(int number){
        int sum = 0;
        int temp = 0;
        while(number != 0){
            temp = number%10;
            sum = sum+temp;
            number = number/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits(1234));
    }
}
