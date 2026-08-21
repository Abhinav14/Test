package june2026.dsa.repeats;

import java.util.Arrays;

public class MoveTwosToEnd {
    public static void main(String[] args) {
        int[] inputArray = new int[]{2, 1, 3, 5, 7, 2, 9, 8};
        System.out.println(Arrays.toString(moveTwos(inputArray)));
    }

    private static int[] moveTwos(int[] inputArray){
        //Edge case
        if(inputArray == null && inputArray.length <= 1){
            return null;
        }

        int insertPosition = 0;

        for(int i = 0; i < inputArray.length; i++){
            if(inputArray[i] != 2){
                inputArray[insertPosition] = inputArray[i];
                insertPosition++;
            }
        }
        while (insertPosition < inputArray.length){
            inputArray[insertPosition] = 2;
            insertPosition++;
        }
        return inputArray;
    }
}
