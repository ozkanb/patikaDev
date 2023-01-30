import java.time.LocalDate;

public class Book {
    private String name;
    private int pageCount;
    private String author;
    private int Date;

    public Book(String name, int pageCount, String author, int Date) {
        this.name = name;
        this.pageCount = pageCount;
        this.author = author;
        this.Date = Date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getDate() {
        return Date;
    }

    public void setDate(int Date) {
        this.Date = Date;
    }
}
