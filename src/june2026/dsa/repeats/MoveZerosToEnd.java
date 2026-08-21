package june2026.dsa.repeats;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] inputArray = new int[]{2, 3, 0, 9, 0, 4, 0, 5};

        System.out.println(Arrays.toString(moveZeros(inputArray)));
    }

    private static int[] moveZeros(int[] inputArray){
        if(inputArray == null || inputArray.length <= 1){
            return null;
        }
        int insertPosition = 0;

        for(int i = 0; i< inputArray.length; i++){
            if(inputArray[i] != 0){
                inputArray[insertPosition] = inputArray[i];
                insertPosition++;
            }
        }

        while (insertPosition < inputArray.length){
            inputArray[insertPosition] = 0;
            insertPosition++;
        }
        return inputArray;
    }
}
