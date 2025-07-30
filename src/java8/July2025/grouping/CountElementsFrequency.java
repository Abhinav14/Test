package java8.July2025.grouping;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//How do you find frequency of each element in an array or a list?
public class CountElementsFrequency {
    public static void main(String[] args) {
        List<String> stationaryList = List.of("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
        /*Map<String, Long> map = stationaryList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);*/
        System.out.println(stationaryList);

        /*Map<String, Integer> lhMap = new LinkedHashMap<>();
        for(String str : stationaryList){
            if(lhMap.containsKey(str)){
                lhMap.put(str, lhMap.get(str)+1);
            }else{
                lhMap.put(str, 1);
            }
        }
        //lhMap.entrySet().stream().forEach(x-> System.out.println("Key: "+x.getKey()+", Frequency: "+x.getValue()));
        lhMap.entrySet().stream().filter(x->x.getValue()>1).forEach(x-> System.out.println("Key: "+x.getKey()+", Frequency: "+x.getValue()));*/

        Map<String, Long> map = stationaryList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);
    }
}
