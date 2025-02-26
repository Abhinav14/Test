package basicprograms;

import java.util.*;

//Find All Pairs of Elements In An Array Whose Sum Is Equal To A Given Number
public class FindAllPairsSumToTarget {
    private static List findPairs(int[] arr, int target){
        List<int[]> arrList = new ArrayList<>();
        Set<Integer> pairs = new HashSet<>();
        int diff = 0;
        for(Integer i : arr){
          diff = target-i;
            if(pairs.contains(diff)){
                int[] pairArr = new int[2];
                pairArr[0] = diff;
                pairArr[1] = i;
                arrList.add(pairArr);
            }else{
                pairs.add(i);
            }
        }
        return arrList;
    }

    public static void main(String[] args) {
        List<int[]> resultList = new ArrayList<>();
        resultList = findPairs(new int[]{4, 6, 5, -10, 8, 5, 20}, 10);
        for(int[] a : resultList){
            System.out.println(a[0]+", "+a[1]);
        }
    }
}
