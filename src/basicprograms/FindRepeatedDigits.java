package basicprograms;

import java.util.HashMap;
import java.util.Map;

public class FindRepeatedDigits {
    public static Map<Integer, Integer> collectRepetitiveDigits(int number){
        Map<Integer, Integer> duplicateMap = new HashMap<>();
        while(number != 0){
            int remainder = number%10;
            if(duplicateMap.containsKey(remainder)){
                duplicateMap.put(remainder, duplicateMap.get(remainder)+1);
            }else{
                duplicateMap.put(remainder, 1);
            }
            number = number/10;
        }
        return duplicateMap;
    }

    public static void main(String[] args) {
        int number = 1234321897;
        collectRepetitiveDigits(number).entrySet().stream().filter(x->x.getValue()>1).forEach(y-> System.out.println("Key: "+y.getKey()+", Value: "+y.getValue()));
    }
}
