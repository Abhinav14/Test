import java.util.*;

public class Ex1 {

    public static void main(String[] args) {

        Map<String, String> hMap = new HashMap<>();
        hMap.put("k1", "klm");
        hMap.put("k2", "def");
        hMap.put("k3", "xyz");

        List<Map.Entry<String, String>> ll = new LinkedList<Map.Entry<String, String>>(hMap.entrySet());

        Collections.sort(ll, new Comparator<Map.Entry<String, String>>() {
            @Override
            public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
                return (o1.getValue().compareTo(o2.getValue()));
            }
        });

        HashMap<String, String> lHMap = new LinkedHashMap<String, String>();

        for(Map.Entry<String, String> sll : ll){
            lHMap.put(sll.getKey(), sll.getValue());
        }

        for(Map.Entry<String, String> temp : lHMap.entrySet()){
            System.out.println("Key: "+temp.getKey()+", Value: "+temp.getValue());
        }

    }

}
