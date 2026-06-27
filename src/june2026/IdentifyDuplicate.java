package june2026;

import java.util.HashMap;
import java.util.Map;

public class IdentifyDuplicate {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 5, 3, 8, 6, 9, 2, 6};
        Map<Integer, Integer> hMap = new HashMap<>();
        for(int i : arr){
           if(hMap.containsKey(i)){
               hMap.put(i, hMap.get(i)+1);
           }else{
               hMap.put(i, 1);
           }
        }

        //hMap.entrySet().stream().filter(x->x.getValue()>1).forEach(y-> System.out.println("key: "+y.getKey()+", occurrence: "+y.getValue()));

        for (Map.Entry pair : hMap.entrySet()){
            if((int)pair.getValue() > 1){
                System.out.println("key: "+pair.getKey()+", occurrence: "+pair.getValue());
            }
        }
    }
}
