package june2026;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//Find two numbers whose sum equals the target.
public class TwoSumNumbers {
    private static int[] get2Numbers(int[] numbers, int target){
        int[] result = new int[2];
        Set<Integer> hSet = new HashSet<>();
        for(int i = 0; i < numbers.length; i++){
            int secondNumber = target - numbers[i];
            if(hSet.contains(secondNumber)){
                result[0] = secondNumber;
                result[1] = numbers[i];
                return result;
            }else {
                hSet.add(numbers[i]);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15, 3, 1};
        int target = 9;

        int[] result = get2Numbers(numbers, target);
        if(result != null && result.length != 0){
            System.out.println("First Number is: "+result[0]+ ", and Second Number is: "+result[1]);
        }
    }
}
