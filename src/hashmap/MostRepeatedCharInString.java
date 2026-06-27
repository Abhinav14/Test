package hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MostRepeatedCharInString {
    public static void main(String[] args) {
        String str = "apple papaya orange apple orange apple kiwi apple";
        String[] strArr = str.split(" ");
        System.out.println(Arrays.toString(strArr));

        Map<String, Integer> hmap = new HashMap<>();

        for(String s : strArr){
            if(hmap.containsKey(s)){
                hmap.put(s, hmap.get(s)+1);
            }else{
                hmap.put(s, 1);
            }
        }
        String key = "";
        Integer value = 0;
        for(Map.Entry<String, Integer> pair : hmap.entrySet()){
            if(pair.getValue() > value){
                key = pair.getKey();
                value = pair.getValue();
            }
        }
        System.out.println("Key: "+ key+", Value: "+value);
    }
}
