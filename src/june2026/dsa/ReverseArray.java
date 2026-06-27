package june2026.dsa;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] inputArray = {10, 20, 30, 40, 50, 60};
        System.out.println("Original Array: "+ Arrays.toString(inputArray));
        System.out.println("Reversed Array: "+Arrays.toString(reversed(inputArray)));
    }

    private static int[] outputArray(int[] inputArray){
        if(inputArray ==null || inputArray.length <= 1){
            return new int[]{};
        }
        int left = 0, right = inputArray.length-1;

        while(left < right){
            int temp = inputArray[left];
            inputArray[left] = inputArray[right];
            inputArray[right] = temp;

            left++;
            right--;
        }
        return inputArray;
    }

    private static int[] reversed(int[] inputArray){
        int n = inputArray.length;
        for(int i = 0; i < inputArray.length/2; i++){
            int temp = inputArray[i];
            inputArray[i] = inputArray[n-1-i];
            inputArray[n-1-i] = temp;
        }
        return inputArray;
    }
}
