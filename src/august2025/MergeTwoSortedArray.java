package august2025;

import java.util.Arrays;

public class MergeTwoSortedArray {
    private static int[] mergeArrays(int[] arr1, int[] arr2){
        int[] merged = new int[arr1.length + arr2.length];

        int i = 0, j = 0, c = 0;

        while(i < arr1.length && j < arr2.length){
            if(arr1[i] <= arr2[j]){
                merged[c] = arr1[i];
                i++;
                c++;
            }else{
                merged[c] = arr2[j];
                j++;
                c++;
            }
        }

        //remaining from arr1
        while(i < arr1.length){
            merged[c] = arr1[i];
            i++;
            c++;
        }

        while(j < arr2.length){
            merged[c] = arr2[j];
            j++;
            c++;
        }
        return merged;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 4, 5, 7, 9};
        int[] arr2 = {1, 3, 6, 8, 10};
        int[] merged = mergeArrays(arr1, arr2);
        System.out.println(Arrays.toString(merged));
    }
}
