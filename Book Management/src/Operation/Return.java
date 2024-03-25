package Operation;

import Book.Book;
import Book.BookList;

import java.util.Scanner;

public class Return implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("归还");
        System.out.println("请输入归还书籍名称->");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int currentSized = bookList.getUseSized();
        for (int i = 0; i < currentSized; i++) {
            Book book = bookList.getBook(i);
            if (book.getBookName().equals(name)) {
                System.out.println("归还成功，书名为->" + name);
                book.setBookStatue(false);
                return;
            }
        }
        System.out.println("没有该图书："+name);
    }
}
