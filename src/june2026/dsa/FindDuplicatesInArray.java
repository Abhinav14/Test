package june2026.dsa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicatesInArray {
    public static void main(String[] args) {
        int[] inputArrray = {10, 1, 2, 6, 2, 5, 9, 7, 6, 10};
        System.out.println(findDuplicates(inputArrray));
    }

    private static List findDuplicates(int[] inputArray){
        Set<Integer> seen = new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();
        for(int n : inputArray){
            if (!seen.add(n)){
                duplicates.add(n);
            }
        }
        return duplicates;
    }
}
