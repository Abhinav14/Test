package basicprograms;

import java.util.HashMap;
import java.util.Map;

public class BinarySearchImpl {
    public static Map<Boolean, Integer> searchForElement(int[] sortedArr, int target){
        Map<Boolean, Integer> resultMap = new HashMap<>();
        int left = 0, right = sortedArr.length-1;
        while(left <= right){
            int mid = (left+right)/2;
            if(target == sortedArr[mid]){
                resultMap.put(true, mid);
                return resultMap;
            }
            if(target < sortedArr[mid]){
                right = mid+1;
            }else{
                left = mid-1;
            }
        }
        return resultMap;
    }

    public static void main(String[] args) {
        Map<Boolean, Integer> hMap = new HashMap<>();
        hMap = searchForElement(SortArray.sortMe(new int[]{9, 10, 5, 8, 7, 2, 1, 6, 3}), 7);
        if(hMap.isEmpty()){
            System.out.println("Element is not in the array");
        }else {
            System.out.println("Element is in the array at "+hMap.get(true));
        }
    }

}
