package java8.utility;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookTester {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book(1005, "Doomsday Conspiracy", 1980),
                new Book(1002, "The Godfather", 1984),
                new Book(1003, "Coma", 1990),
                new Book(1001, "Omerta", 1988)
        );

        /*Collections.sort(books, new CompareBookByName());
        System.out.println(books);*/

        Comparator<Book> byId = Comparator.comparing(Book::getId);
        Collections.sort(books, byId);
        System.out.println(books);

    }
}
