package june2026.dsa.repeats;

import javax.lang.model.type.IntersectionType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumToTarget {
    public static void main(String[] args) {
        int[] inputArray = new int[]{2, 8, 3, 6, 9, 4, 5};
        System.out.println(Arrays.toString(twoSum(inputArray, 13)));
    }

    private static int[] twoSum(int[] inputArray, int target){
        Map<Integer, Integer> holder = new HashMap<>();
        for(int i = 0; i < inputArray.length; i++){
            int second = target - inputArray[i];
            if(holder.containsKey(second)){
                return new int[]{holder.get(second), i};
            }else {
                holder.put(inputArray[i], i);
            }
        }
        return new int[]{};
    }
}
