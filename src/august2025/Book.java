package august2025;

import java.time.LocalDate;

public class Book {

    private final String title;
    private final String author;
    private final int year;

    Book(Builder builder){
        this.title = builder.title;
        this.author = builder.author;
        this.year = builder.year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    static class Builder{
        private String title;
        private String author;
        private int year;


        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setAuthor(String author) {
            this.author = author;
            return this;
        }

        public Builder setYear(int year) {
            this.year = year;
            return this;
        }

        public Book build(){
            return new Book(this);
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }
}
