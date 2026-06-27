package august2025;

import java.util.Arrays;

//java.util.arrays;
public class TestArrays {
    public static void main(String[] args) {
        Integer[] arr = {4, 7, 1, 9, 3, 8, 6, 5};

        Arrays.sort(arr);

        int result = Arrays.binarySearch(arr, 5);

        //System.out.println(Arrays.toString(arr));

        System.out.println(result);
    }
}


