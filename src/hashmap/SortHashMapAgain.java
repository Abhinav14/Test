package hashmap;

import java.util.*;

public class SortHashMapAgain {
    public static void sortMe(Map<String, String> hmap){
       List<Map.Entry<String, String>> hmapList = new ArrayList<>(hmap.entrySet());

       Collections.sort(hmapList, new Comparator<Map.Entry<String, String>>() {
           @Override
           public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
               return o1.getValue().compareTo(o2.getValue());
           }
       });
        Map<String, String> lhmap = new LinkedHashMap<>();
        for(Map.Entry<String, String> pair : hmapList){
            lhmap.put(pair.getKey(), pair.getValue());
        }
        lhmap.entrySet().stream().forEach(x-> System.out.println("Key: "+x.getKey()+", Value: "+x.getValue()));
    }

    public static void main(String[] args) {
        Map<String, String> hmap = new HashMap<>();
        hmap.put("C", "Apple");
        hmap.put("A", "Cranberry");
        hmap.put("B", "Banana");

        sortMe(hmap);

    }
}
