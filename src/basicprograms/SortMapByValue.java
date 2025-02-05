package basicprograms;

import java.util.*;

public class SortMapByValue {
    public static void main(String[] args) {
        Map<String, String> unsortedMap = new HashMap<>();
        unsortedMap.put("k1", "xyz");
        unsortedMap.put("k3", "abc");
        unsortedMap.put("k2", "def");
        List<Map.Entry<String, String>> arrList = new ArrayList<>(unsortedMap.entrySet());
        Collections.sort(arrList, new HMapValComparator());
        Map<String, String> linkedHasMap = new LinkedHashMap<>();
        for(Map.Entry<String, String> pair : arrList){
            linkedHasMap.put(pair.getKey(), pair.getValue());
        }
        System.out.println(linkedHasMap);
    }
}
