package august2025;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {
        List<Integer> arrList = new ArrayList<Integer>();
        arrList.add(8);
        arrList.add(1);
        arrList.add(2);
        arrList.add(5);
        arrList.add(3);
        arrList.add(4);
        arrList.add(7);
        arrList.add(6);

        Collections.sort(arrList);
        System.out.println(arrList);

        //int result = Collections.binarySearch(arrList, 7);
        //System.out.println(result);

        //Collections.reverse(arrList);
        //System.out.println(arrList);

        List<Integer> arrList123 = Collections.unmodifiableList(arrList);
        arrList123.add(10);

        System.out.println(arrList123);

    }
}
