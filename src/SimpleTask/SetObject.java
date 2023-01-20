package SimpleTask;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SetObject {
    public static void main(String[] args) {
        BooksSet booksSet = new BooksSet("LOTR", "TOlkien", 2011);
        BooksSet booksSet1 = new BooksSet("WOLF", "ABRAMS", 2008);

        Set<BooksSet> sets = new HashSet<>();
        sets.add(booksSet);
        sets.add(booksSet1);

        for (BooksSet books : sets) {
            if (books.getYearOFRegisterBook() < 2010) {
                System.out.println(books);
            }
        }
    }
}

class BooksSet {
    private String nameOfBook;
    private String author;
    private int yearOFregisterBook;

    public BooksSet(String nameOfBook, String author, int year) {
        this.nameOfBook = nameOfBook;
        this.author = author;
        this.yearOFregisterBook = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BooksSet booksSet = (BooksSet) o;
        return yearOFregisterBook == booksSet.yearOFregisterBook && Objects.equals(nameOfBook, booksSet.nameOfBook) &&
            Objects.equals(author, booksSet.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfBook, author, yearOFregisterBook);
    }

    @Override
    public String toString() {
        return "SimpleTask.BooksSet{" +
            "nameOfBook='" + nameOfBook + '\'' +
            ", author='" + author + '\'' +
            ", yearOFregisterBook=" + yearOFregisterBook +
            '}';
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOFRegisterBook() {
        return yearOFregisterBook;
    }
}