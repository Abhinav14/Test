package basicprograms;

import java.util.Arrays;

public class SortArray {
    public static int[] sortMe(int[] unsorted){
        int n = unsorted.length;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                int temp = 0;
                if(unsorted[i] > unsorted[j]){
                    temp = unsorted[i];
                    unsorted[i] = unsorted[j];
                    unsorted[j] = temp;
                }
            }
        }
        return unsorted;
    }

    public static void main(String[] args) {
        int[] sorted = sortMe(new int[]{9, 10, 3, 6, 5, 4, 7, 8});
        Arrays.stream(sorted).forEach(System.out::println);
    }
}
