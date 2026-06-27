package august2025;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookBuilderAndRunner {
    public static void main(String[] args) {
        Book book = new Book.Builder().setTitle("Doomsday Conspiracy").setAuthor("Sidney Sheldon").setYear(1985).build();
        Book book2 = new Book.Builder().setTitle("Sona").setAuthor("Mahadevi Verma").setYear(1980).build();
        Book book3 = new Book.Builder().setTitle("The God Father").setAuthor("Maria Pujo").setYear(1988).build();

        List<Book> books = new ArrayList<>();
        books.add(book2);
        books.add(book);
        books.add(book3);

        System.out.println("Before Sorting"+books);
        BookTitleComparator comp = new BookTitleComparator();

        Collections.sort(books, comp);

        System.out.println("After Sorting"+books);



    }
}
