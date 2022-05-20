import java.util.TreeSet;
import java.util.Comparator;


public class BookSorter{
    public static void main(String[] args) {
        TreeSet<Book> books = new TreeSet<>();
        Book book1 = new Book("Aşk ve Gurur", 900, "Jane Austen", "1990");
        Book book2 = new Book("Suç ve Ceza", 200, "Dostoyevski", "1790");
        Book book3 = new Book("Savaş ve Barış", 500, "Tolstoy", "1765");
        Book book4 = new Book("Yanlışlıklar Komedyası", 700, "Shakespeare", "1890");
        Book book5 = new Book("Vadideki Zambak", 100, "Balzac", "1836");
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        for (Book b : books) {
            System.out.printf("%-23s%6d   %-23s%-23s\n", b.getName(), b.getPageNumber(), b.getAuthorName(), b.getPublicationDate());
        }
        System.out.println("**************************************************");
        TreeSet<Book> booksSetPageNum = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNumber() - o2.getPageNumber();
            }
        });
        booksSetPageNum.add(book1);
        booksSetPageNum.add(book2);
        booksSetPageNum.add(book3);
        booksSetPageNum.add(book4);
        booksSetPageNum.add(book5);
        for (Book b : booksSetPageNum) {
            System.out.printf("%-23s%6d   %-23s%-23s\n", b.getName(), b.getPageNumber(), b.getAuthorName(), b.getPublicationDate());

        }


    }
}

     class Book implements Comparable<Book>{
    private String name;
    private int pageNumber;
    private String authorName;
    private String publicationDate;

    public Book(String name, int pageNumber, String authorName, String publicationDate) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.authorName = authorName;
        this.publicationDate = publicationDate;
    }

    @Override
    public int compareTo(Book o) {
        return this.getName().compareTo(o.getName());
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

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }
}


//Bu sınıf Comparable interface'den kalıtım alıp "compareTo" metodunu override ediniz.
//Bu metodun içinde kitabı A'dan Z'ye isme göre sıralayan kodu yazınız.
// Bu sınıftan 5 tane nesne oluşturun ve nesneleri Set tipinde bir yapısında saklayınız.
// Sonra ikinci kez Set tipinden bir veri yapısı kullanın ve kitapları sayfa sayısına göre sıralamasını sağlayınız.
//Book sınıfı kitap ismi, sayfa sayısı, yazarın ismi, yayın tarihi değişkenlerinden oluşmaktadır.