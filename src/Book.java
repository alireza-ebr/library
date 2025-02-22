public class Book {
    private static int baseId = 0;
    private boolean available;
    private String author;
    private String title;
    private int publishedYear;
    private int id;

    public Book(boolean available, String author, String title, int publishedYear, int id) {
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
}
