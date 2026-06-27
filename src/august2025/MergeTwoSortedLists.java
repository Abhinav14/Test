package august2025;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeTwoSortedLists {
    private static List<Integer> mergedList(List<Integer> list1, List<Integer> list2){
        List<Integer> merged = new ArrayList<>();
        merged.addAll(list1);
        merged.addAll(list2);
        Collections.sort(merged);
        return merged;
    }

    //merging list without library function
    private static List<Integer> mergedListWithoutLF(List<Integer> list1, List<Integer> list2){
        List<Integer> mergedList = new ArrayList<>();
        int i = 0, j = 0;
        //traverse both list and add the smallest element
        while(i < list1.size() && j < list2.size()){
            if(list1.get(i) <= list2.get(j)){
                mergedList.add(list1.get(i));
                i++;
            }else{
                mergedList.add(list2.get(j));
                j++;
            }
        }

        //add remaining from list1
        while(i < list1.size()){
            mergedList.add(list1.get(i));
            i++;
        }
        //add remaining from list2
        while(j < list2.size()){
            mergedList.add(list2.get(j));
            j++;
        }
        return mergedList;
    }

    public static void main(String[] args) {
        /*List<Integer> list1 = Arrays.asList(2, 5, 6, 1);
        List<Integer> list2 = Arrays.asList(4, 7, 3, 5);
        System.out.println(mergedList(list1, list2));*/
        List<Integer> list1 = Arrays.asList(1, 3, 5, 7);
        List<Integer> list2 = Arrays.asList(2, 4, 6, 8, 10);
        System.out.println(mergedListWithoutLF(list1, list2));
    }
}
