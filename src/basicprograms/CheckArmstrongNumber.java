package basicprograms;

import java.util.ArrayList;
import java.util.List;

public class CheckArmstrongNumber {
    public static boolean isArmstrong(int number){
        List<Integer> numList = new ArrayList<>();
        int originalNumber = number;
        while(number != 0){
            int lastDigit = number%10;
            number = number/10;
            numList.add(lastDigit);
        }
        int power = numList.size();
        int finalNumber = 0;
        for(int i : numList){
            finalNumber = (int) (finalNumber + Math.pow(i, power));
        }
        return originalNumber == finalNumber;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
    }
}
