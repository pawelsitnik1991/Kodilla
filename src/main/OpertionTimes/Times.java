package main.OpertionTimes;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Times {

    public static void main(String[] args) {


        List<Book> bookList = new LinkedList<>();

        for (int i = 0; i < 2000; i++) {
            bookList.add(i, new Book("Lotr".concat(String.valueOf(i)), "King".concat(String.valueOf(i))));
            System.out.println(bookList.get(i));
        }


        long begin = System.nanoTime();
        bookList.get(1);
        long end = System.nanoTime();
        System.out.println("Get element at the od of the collection has taken: " + (end - begin) + "ns");

        begin = System.nanoTime();
        bookList.remove(1);
        end = System.nanoTime();
        System.out.println("Remove element at the od of the collection has taken: " + (end - begin) + "ns");

        begin = System.nanoTime();
        bookList.get(bookList.size() - 1);
        end = System.nanoTime();
        System.out.println("Get element at the end of the collection has taken: " + (end - begin) + "ns");

        begin = System.nanoTime();
        bookList.remove(bookList.size() - 1);
        end = System.nanoTime();
        System.out.println("Remove element at the end of the collection has taken: " + (end - begin) + "ns");

        System.out.println("--------------------------------------------------------------------------------");

        HashMap<String, Book> stringHashMap = new HashMap<>();
        for (int i = 0; i < 20; i++) {
            stringHashMap.put("bookList".concat(String.valueOf(i)), new Book("Lotr".concat(String.valueOf(i)), "King".concat(String.valueOf(i))));
        }

        for (Map.Entry<String, Book> maps : stringHashMap.entrySet()) {
            System.out.println(maps.getKey() + "--- " + maps.getValue());
        }

        begin = System.nanoTime();
        stringHashMap.get(1);
        end = System.nanoTime();
        System.out.println("Get element at the od of the collection has taken: " + (end - begin) + "ns");

        begin = System.nanoTime();
        stringHashMap.put("Test", new Book("Alex", "Siema"));
        end = System.nanoTime();
        System.out.println("Put element to  the map has taken: " + (end - begin) + "ns");

        begin = System.nanoTime();
        stringHashMap.remove("Test", new Book("Alex", "Siema"));
        end = System.nanoTime();
        System.out.println("Remove element from the map has taken: " + (end - begin) + "ns");

    }
}

class Book {
    String author;
    String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return Objects.equals(author, book.author) && Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title);
    }

    @Override
    public String toString() {
        return "Book{" +
            "author='" + author + '\'' +
            ", title='" + title + '\'' +
            '}';
    }
}
