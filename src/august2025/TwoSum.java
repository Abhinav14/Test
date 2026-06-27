package august2025;

import java.util.*;

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target
public class TwoSum {

    private static int[] getTowSum(int[] nums, int target){
        Map<Integer, Integer> hmap = new HashMap<>();
        int[] result = new int[2];
        for(int i = 0; i < nums.length; i++){
            int secondNum = target - nums[i];
            if(hmap.containsKey(secondNum)){
                result[0] = hmap.get(secondNum);
                result[1] = i;
                return result;
            }else{
                hmap.put(nums[i], i);
            }
        }
        return result;
    }



    public static void main(String[] args) {
        int[] nums = {2, 4, 8, 9, 1};
        int[] result = getTowSum(nums, 3);
        System.out.println("First index: "+result[0]+", Second index: "+result[1]);
        System.out.println(Arrays.toString(result));
    }
}
