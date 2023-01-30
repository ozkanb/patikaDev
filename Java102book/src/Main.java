import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Book> book = new TreeSet<>();
        Book book1 = new Book("Şeker Portakalı", 183, "José Mauro de Vasconcelos", 1968);
        Book book2 = new Book("Delifişek", 160, "José Mauro de Vasconcelos", 1960);
        Book book3 = new Book("Kürk Mantolu Madonna", 177, "Sabahattin Ali", 1943);
        Book book4 = new Book("Fahrenheit 451", 350, "Ray Bradbury", 1953);

        book.add(book1);
        book.add(book2);
        book.add(book3);
        book.add(book4);

        System.out.println("==============" + "\nSort by name :" + "\n==============");

        for (Book b : book) {
            System.out.println("Book Name : " + b.getName() +
                    "\nNumber of page : " + b.getPageNumber() +
                    "\nAutor Name : " + b.getAutor() +
                    "\nPublish Date : " + b.getPublishDate());
            System.out.println("--------------------------------------");
        }
        System.out.println("==============" + "\nSort by pagenumber :" + "\n==============");

        TreeSet<Book> bookP = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                if (o1.getPageNumber() == o2.getPageNumber()) {
                    return o1.getName().compareTo(o2.getName());
                }
                return o1.getPageNumber() - o2.getPageNumber();
            }
        });
        bookP.add(book1);
        bookP.add(book2);
        bookP.add(book3);
        bookP.add(book4);

        for (Book pageNum : bookP) {
            System.out.println("Book Name : " + pageNum.getName() +
                    "\nNumber of page : " + pageNum.getPageNumber() +
                    "\nAutor Name : " + pageNum.getAutor() +
                    "\nPublish Date : " + pageNum.getPublishDate());
            System.out.println("--------------------------------------");
        }
    }

}