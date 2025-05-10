package java8.utility;

import java.util.Date;

public class Book {
    private int id;
    private String name;
    private int publishingYear;

    public Book() {
    }

    public Book(int id, String name, int publishingYear) {
        this.id = id;
        this.name = name;
        this.publishingYear = publishingYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", publishingYear=" + publishingYear +
                '}';
    }
}
