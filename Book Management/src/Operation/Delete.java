package Operation;

import Book.Book;
import Book.BookList;

import java.util.Scanner;

public class Delete implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("删除");
        System.out.println("请输入删除的书名->");
        Scanner scanner=new Scanner(System.in);
        String name= scanner.nextLine();

        int currentSized=bookList.getUseSized();

        int index = -1;
        int i = 0;
        for (i = 0; i < currentSized; i++) {
            Book tmp=bookList.getBook(i);
            if(tmp.getBookName().equals(name)){
                index=i;
                break;
            }
        }
        if(i>=currentSized){
            System.out.println("没有要删除的图书");
            return;
        }

        for (int j = index; j < currentSized-1; j++) {
            Book book=bookList.getBook(j+1);
            bookList.setBooks(book,j);
        }
        bookList.setBooks(null,currentSized-1);
        bookList.setUseSized(currentSized-1);


    }
}
