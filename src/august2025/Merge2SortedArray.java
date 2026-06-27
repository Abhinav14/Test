package august2025;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Merge2SortedArray {
    private static int[] mergeArrays(int[] arr1, int[] arr2){
        int[] merged = new int[arr1.length + arr2.length];

        int i = 0, j = 0, k = 0;

        while(i < arr1.length && j < arr2.length){
            if(arr1[i] <= arr2[j]){
                merged[k] = arr1[i];
                i++;
                k++;
            }else{
                merged[k] = arr2[j];
                j++;
                k++;
            }
        }
        while(i < arr1.length){
            merged[k] = arr1[i];
            i++;
            k++;
        }

        while(j < arr2.length){
            merged[k] = arr2[j];
            j++;
            k++;
        }
        return merged;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 5, 6};
        int[] arr2 = {3, 4, 7, 8};

        int[] result = mergeArrays(arr1, arr2);

        System.out.println(Arrays.toString(result));
    }
}
