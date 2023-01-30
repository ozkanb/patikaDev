public class Book implements Comparable<Book>{
    private String name;
    private int pageNumber;
    private String autor;
    private int publishDate;

    public Book(String name, int pageNumber, String autor, int publishDate) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.autor = autor;
        this.publishDate = publishDate;
    }

    @Override
    public int compareTo(Book o) {
        return getName().compareTo(o.getName());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(int publishDate) {
        this.publishDate = publishDate;
    }
}
