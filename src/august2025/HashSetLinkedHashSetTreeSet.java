package august2025;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetLinkedHashSetTreeSet {
    public static void main(String[] args) {
        Set<Integer> hset = new HashSet<>();
        hset.add(5);
        hset.add(4);
        hset.add(9);
        hset.add(7);
        System.out.println(hset);

        Set<Integer> lhset = new LinkedHashSet<>();
        lhset.add(5);
        lhset.add(4);
        lhset.add(9);
        lhset.add(7);
        System.out.println(lhset);

        Set<Integer> tset = new TreeSet<>();
        tset.add(5);
        tset.add(4);
        tset.add(9);
        tset.add(7);
        System.out.println(tset);
    }
}
