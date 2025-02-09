package basicprograms;

import java.util.Arrays;
import java.util.Collections;

public class FindSecondLargestElement {
    //With sorting first
    private static int secondLargest1(int[] numArr){
        Arrays.sort(numArr);
        return numArr[numArr.length-2];
    }
    //Without sorting
    private static int secondLargest2(int[] numArr){
        int firstLargest, secondLargest;
        if(numArr[0] > numArr[1]){
            firstLargest = numArr[0];
            secondLargest = numArr[1];
        }else{
            firstLargest = numArr[1];
            secondLargest = numArr[0];
        }
        for(int i = 2; i < numArr.length; i++){
            if(numArr[i] > firstLargest){
                secondLargest = firstLargest;
                firstLargest = numArr[i];
            } else if (numArr[i] < firstLargest && numArr[i] > secondLargest) {
                secondLargest = numArr[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] numArr = new int[]{10, 5, 7, 9, 3, 1, 8};
        System.out.println(secondLargest2(numArr));
    }
}
