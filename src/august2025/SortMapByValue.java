package august2025;

import java.util.*;

//Steps to sort Hashmap by value-
//1. Create an ArrayList. Iterate map and assign each pair/object to the ArrayList.
//2. Call Collections.sort(). Pass ArrayList and create and implement a comparator which will sort values
//3. create a linkedhashmap. Iterate the sorted arraylist and put each iterated object in linkedhashmap.
public class SortMapByValue {
    public static void main(String[] args) {
        Map<String, String> unsortedMap = new HashMap<>();
        unsortedMap.put("abc", "Abhinav");
        unsortedMap.put("ijk", "Sam");
        unsortedMap.put("lmn", "David");
        unsortedMap.put("xyz", "Charlie");

        List<Map.Entry<String, String>> arrList = new ArrayList<>(unsortedMap.entrySet());

        Collections.sort(arrList, new Comparator<Map.Entry<String, String>>() {
            @Override
            public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        Map<String, String> sortedMap = new LinkedHashMap<>();

        for(Map.Entry<String, String> pair : arrList){
            sortedMap.put(pair.getKey(), pair.getValue());
        }

        sortedMap.entrySet().stream().forEach(x-> System.out.println("Key: "+x.getKey()+", Value: "+x.getValue()));

    }
}
