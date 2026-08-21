package june2026.dsa.interview_prep;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSumToTarget(int[] inputArray, int target){
        Map<Integer, Integer> seen = new HashMap<>();
        for(int i = 0; i < inputArray.length; i++){
            int secondNum = target - inputArray[i];
            if(seen.containsKey(secondNum)){
                return new int[]{seen.get(secondNum), i};
            }

            seen.put(inputArray[i], 1);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] inputArray = new int[]{2, 4, 3, 5, 6, 8, 9};
        int target = 30;

        System.out.println(Arrays.toString(twoSumToTarget(inputArray, target)));
    }
}
