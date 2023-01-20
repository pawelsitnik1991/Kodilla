package HasObject;

public class TaskObject {

    public static void main(String[] args) {
        Book book = new Book("Lotr", "Wlodek", 2001);
        Book book1 = new Book("Lotr", "Szef", 2003);

        System.out.println(book.hashCode());
        System.out.println(book1.hashCode());
    }
}

class Book {

    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
}
