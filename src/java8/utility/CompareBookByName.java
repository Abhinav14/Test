package java8.utility;

import java.util.Comparator;

public class CompareBookByName implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
