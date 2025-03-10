package march032025;

import java.util.*;

//How to find all pairs of elements in an array whose sum is equal to given number?
public class FindPairsSumToTarget {

    private static List<int[]> listPairs(int[] arr, int target){
        List<int[]> pairs = new ArrayList<>();
        Set<Integer> firstElement = new HashSet<>();

        for(Integer i : arr){
            int temp = target - i;
            if(firstElement.contains(temp)){
                int[] pair = new int[]{temp, i};
                pairs.add(pair);
            }else{
                firstElement.add(i);
            }
        }
        return pairs;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 3, 5, 6, 7, 1, 9, 10};
        /*for(int[] a : listPairs(arr, 8)){
            System.out.println(a[0]+", "+a[1]);
        }*/
        listPairs(arr, 8).stream().forEach(x-> System.out.println(x[0]+", "+x[1]));
    }
}
