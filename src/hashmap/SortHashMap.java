package hashmap;

import java.util.*;

import static java.util.Map.Entry.comparingByValue;

public class SortHashMap {

    public static void sortByValue(HashMap<String, String> hMap){
        List<Map.Entry<String, String>> arrList = new ArrayList<Map.Entry<String, String>>(hMap.entrySet());
        Collections.sort(arrList, new Comparator<Map.Entry<String, String>>() {
            @Override
            public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
                return (o1.getValue().compareTo(o2.getValue()));
            }
        });
        Map<String, String> lhmap = new LinkedHashMap<>();
        for(Map.Entry<String, String> pair : arrList){
            lhmap.put(pair.getKey(), pair.getValue());
        }
        lhmap.entrySet().stream().forEach(x-> System.out.println("Key: "+x.getKey()+", Value: "+x.getValue()));
    }

    public static void main(String[] args) {
        HashMap<String, String> hMap = new HashMap<>();
        hMap.put("k1", "klm");
        hMap.put("k2", "def");
        hMap.put("k3", "xyz");
        sortByValue(hMap);
    }
}
