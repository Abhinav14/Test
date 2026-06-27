package august2025;

import java.util.*;
import java.util.LinkedList;

public class HMapHTableLHMapTMap {
    public static void main(String[] args) {
        Map<String, Integer> hmap = new HashMap<>();
        hmap.put("xyz", 1);
        hmap.put("lmn", 1);
        hmap.put("abc", 1);
        hmap.put("efg", 1);
        hmap.put("pqr", 1);
        hmap.entrySet().forEach(x-> System.out.println("Key: "+x.getKey()+", Value: "+x.getValue()));
        System.out.println("============================================================");
        Map<String, Integer> lhmap = new LinkedHashMap<>();
        lhmap.put("xyz", 1);
        lhmap.put("lmn", 1);
        lhmap.put("abc", 1);
        lhmap.put("efg", 1);
        lhmap.put("pqr", 1);
        lhmap.entrySet().forEach(x-> System.out.println("Key: "+x.getKey()+", Value: "+x.getValue()));
        System.out.println("=========================================================");
        Map<String, Integer> tmap = new TreeMap<>();
        tmap.put("xyz", 1);
        tmap.put("lmn", 1);
        tmap.put("abc", 1);
        tmap.put("efg", 1);
        tmap.put("pqr", 1);
        tmap.entrySet().forEach(x-> System.out.println("Key: "+x.getKey()+", Value: "+x.getValue()));


    }
}
