import java.util.Comparator;
import java.util.Map;

public class Ex1ValueComparator implements Comparator<Map.Entry<String, String>> {
    @Override
    public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
        return o1.getValue().compareTo(o2.getValue());
    }
}
