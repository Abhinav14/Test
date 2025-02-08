package basicprograms;

//Check if 2 arrays are equal

import java.util.Arrays;

public class EqualityOfArrays {

    //This method will check equality without sorting of arrays.
    public static boolean checkEquality1(int[] arr1, int[] arr2){
        if(arr1.length == arr2.length){
            for(int i = 0; i < arr1.length; i++){
                if(arr1[i] != arr2[i]){
                    return false;
                }
            }
        }
        return true;
    }

    //Sort both arrays and check equality
    public static boolean checkEquality2(int[] arr1, int[] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    //Calling Arrays.equal() without sorting
    public static boolean checkEquality3(int[] arr1, int[] arr2){
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        int[] arr1 = {4, 5, 1, 7, 2};
        int[] arr2 = {2, 5, 1, 7, 4};
        System.out.println(checkEquality3(arr1, arr2));
    }

}
