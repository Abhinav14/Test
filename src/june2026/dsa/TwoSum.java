package june2026.dsa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//Two Sum — return indices of two numbers that add up to target.
public class TwoSum {
    public static void main(String[] args) {
        int[] inputArray = new int[]{10, 20, 30, 5, 8, 6, 5, 21, 0, 1};
        int targer = 21;

        System.out.println(Arrays.toString(twoSum(inputArray, targer)));
    }

    private static int[] twoSum(int[] inputArray, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < inputArray.length; i++){
            int secondNumber = target - inputArray[i];
            if(map.containsKey(secondNumber)){
                return new int[]{map.get(secondNumber), i};
            }else{
                map.put(inputArray[i], i);
            }
        }
        return new int[]{};
    }
}
