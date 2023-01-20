package main.ArrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class StashOFBooks {

    public static void main(String[] args) {

        Book book = new Book("LOTR", "Tolkien", 1991);
        Book book1 = new Book("King", "Kong", 2001);
        Book book2 = new Book("Lowca", "SMok", 2011);
        Book book3 = new Book("Pinoki", "Drzewo", 1995);
        Book book4 = new Book("Lew", "Tchorz", 1981);
        Book book5 = new Book("Tygrys", "Uszatek", 1901);

        Deque<Book> theOrders = new ArrayDeque<>();

        theOrders.offer(book);
        theOrders.offer(book1);
        theOrders.offer(book2);
        theOrders.offer(book3);
        theOrders.offer(book4);
        theOrders.offer(book5);

        System.out.println("Stos size = " + theOrders.size());
        Book last = null;
        while (theOrders.iterator().hasNext()) {
            last = theOrders.getLast();
            System.out.println(theOrders.iterator().next());
            theOrders.poll();
        }

        System.out.println("Stos size = " + theOrders.size());
        System.out.println("Ze stosu zostala ostania usnieta -" + last);
    }
}

class Book {

    String title;
    String author;
    int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Title: \"" + title + "\", author: " + author + ", (" + year + ")";
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
}