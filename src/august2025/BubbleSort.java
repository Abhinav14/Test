package august2025;

public class BubbleSort {
    public static int[] sortMe(int[] unsortedArray){
        int temp = 0;
        for(int i = 0; i < unsortedArray.length-1; i++){
            for(int j = i+1; j < unsortedArray.length; j++){
                if(unsortedArray[j] < unsortedArray[i]){
                    temp = unsortedArray[j];
                    unsortedArray[j] = unsortedArray[i];
                    unsortedArray[i] = temp;
                }
            }
        }
        return unsortedArray;
    }
}
