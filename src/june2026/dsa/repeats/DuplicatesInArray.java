package june2026.dsa.repeats;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicatesInArray {
    public static void main(String[] args) {
        int[] inputArray = new int[]{2, 3, 4, 5, 2, 6, 7, 5, 6};
        System.out.println(duplicates(inputArray));
    }

    private static List duplicates(int[] inputArray){
        Set<Integer> seen = new HashSet<>();
        List<Integer> dups = new ArrayList<>();
        for(int n : inputArray){
            if(!seen.add(n)){
                dups.add(n);
            }
        }
        return dups;
    }
}
