package Operation;

import Book.Book;

import java.util.Comparator;

public class AuthorComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getBookAuthor().compareTo(o2.getBookAuthor());
    }
}
