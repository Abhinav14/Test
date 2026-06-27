package august2025;

import java.lang.reflect.Array;
import java.util.*;

public class TwoSumList {
    private static List<int[]> findIndexes(int[] nums, int target){
        List<int[]> resultList = new ArrayList<>();
        Map<Integer, Integer> hmap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int secondNumber = target - nums[i];
            if(hmap.containsKey(secondNumber)){
                int[] pair = new int[2];
                pair[0] = hmap.get(secondNumber);
                pair[1] = i;
                resultList.add(pair);
            }else{
                hmap.put(nums[i], i);
            }
        }
        return resultList;
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 5, 9, 1, 8, 3};
        int target = 6;
        findIndexes(nums, target).stream().forEach(x-> System.out.println(Arrays.toString(x)));
    }
}
