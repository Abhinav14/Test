package misc;

import java.util.*;

public class CollectionTester {
    public static void main(String[] args) {
        List<Integer> temp = Arrays.asList(9, 5, 1, 2, 6, 7, 3, 8, 4);
        System.out.println(temp);

        Set<Integer> result = new TreeSet<>(Comparator.reverseOrder());
        result.addAll(temp);

        System.out.println(result);
    }
}
