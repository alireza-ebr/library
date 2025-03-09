import java.util.ArrayList;
import java.util.Objects;

public class Book {
    private static int baseId = 0;
    private boolean available;
    private String author;
    private String title;
    private int publishedYear;
    private int id;

    public Book(boolean available, String author, String title, int publishedYear) {
        this.available = available;
        this.author = author;
        this.title = title;
        this.publishedYear = publishedYear;
        this.id = baseId++;
    }
    public boolean isAvailable() {
        return available;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int bookID) {
        this.id = bookID;
    }

    @Override
    public String toString() {
        return "title: " + title + "\nauthor: " + author + "\npublishedYear: " + publishedYear + "\nid: " + id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return available == book.available && publishedYear == book.publishedYear && id == book.id && Objects.equals(author, book.author) && Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(available, author, title, publishedYear, id);
    }
}
