package Operation;

import Book.BookList;
import Book.Book;

import java.util.Arrays;

public class Display implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("显示图书");
        int currentSized= bookList.getUseSized();
        PriceComparator priceComparator=new PriceComparator();
        NameComparator nameComparator=new NameComparator();
        AuthorComparator authorComparator=new AuthorComparator();
        Book[] books =new Book[currentSized];
        for(int j=0;j<currentSized;j++) {
             books[j] =bookList.getBook(j);
        }
        //Arrays.sort(books,priceComparator);
        //Arrays.sort(books,nameComparator);
        Arrays.sort(books,authorComparator);

        System.out.println(Arrays.toString(books));
    }
}
