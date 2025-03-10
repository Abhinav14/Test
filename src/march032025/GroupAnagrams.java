package march032025;

import java.util.*;

public class GroupAnagrams {

    private static Map<String, List<String>> listAnagrams(String[] strings){
        Map<String, List<String>> anagramMap = new HashMap<>();

        for(String str : strings){
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String tempStr = new String(charArr);
            if(anagramMap.containsKey(tempStr)){
                anagramMap.get(tempStr).add(str);
            }else{
                List<String> anagramList = new ArrayList<>();
                anagramList.add(str);
                anagramMap.put(tempStr, anagramList);
            }
        }
        return anagramMap;
    }

    public static void main(String[] args) {
        /*listAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"})
                .entrySet()
                .stream().filter(x->x.getValue().size()>1)
                .forEach(x-> System.out.println(x.getValue()));*/

        Map<String, List<String>> resultMap = listAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});

        for(Map.Entry<String, List<String>> pair : resultMap.entrySet()){
            if (pair.getValue().size() > 1){
                System.out.println(pair.getValue());
            }
        }
    }
}
