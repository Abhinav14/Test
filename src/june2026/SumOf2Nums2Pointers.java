package june2026;

import java.util.Arrays;

public class SumOf2Nums2Pointers {
    private static int[] getBothNumbers(int[] numbers, int target){
        Arrays.sort(numbers);
        int left = 0;
        int right = numbers.length - 1;

        while(left < right){
            int currentSum = numbers[left] + numbers[right];
            if(currentSum == target){
                return new int[]{numbers[left], numbers[right]};
            } else if (currentSum < target) {
                left++;
            }else{
                right--;
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15, 3, 1};
        int target = 9;

        int[] result = getBothNumbers(numbers, target);
        if(result.length != 0){
            System.out.println("Number1: "+result[0]+ ", Number2: "+result[1]);
        }
    }
}
