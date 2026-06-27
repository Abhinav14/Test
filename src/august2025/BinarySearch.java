package august2025;

import java.util.Arrays;

public class BinarySearch {

    private static int search(int[] sortedArray, int number){
        int left = 0, mid = 0, right = sortedArray.length-1;
        while(left <= right){
            mid = (left+right)/2;
            if(number == sortedArray[mid]){
                return mid;
            }
            if(number < sortedArray[mid]){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] unsortedArray = {2, 1, 6, 3, 7, 5, 4};
        int[] sortedArray = BubbleSort.sortMe(unsortedArray);
        System.out.println(Arrays.toString(sortedArray));

        System.out.println(search(sortedArray, 8));
    }
}
