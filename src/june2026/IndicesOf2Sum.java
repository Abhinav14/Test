package june2026;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target
public class IndicesOf2Sum {
    private static int[] get2SumNumIndices(int[] numbers, int target){
        int[] result = new int[2];
        Map<Integer, Integer> hMap = new HashMap<>();
        for(int i = 0; i < numbers.length; i++){
            int secondNumber = target - numbers[i];
            if(hMap.containsKey(secondNumber)){
                result[0] = hMap.get(secondNumber);
                result[1] = i;
            }else{
                hMap.put(numbers[i], i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15, 3, 1};//{1, 2, 3, 7, 11, 15}
        int target = 9;
        int[] result = get2SumNumIndices(numbers, target);
        if(result.length != 0){
            System.out.println("Index of 1st number: "+result[0]+", Index of 2nd number: "+result[1]);
        }
    }
}
