package Operation;

import Book.*;

import java.util.Scanner;

public class Borrow implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("借阅");
        System.out.println("请输入借阅书籍->");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        int currentSized=bookList.getUseSized();
        for (int i = 0; i < currentSized; i++) {
            Book book=bookList.getBook(i);
            if(book.getBookName().equals(name)){
                System.out.println("借阅成功，书名为->"+name);
                book.setBookStatue(true);
                return;
            }
        }
        System.out.println("未找到该书，书名为->"+name);
    }
}
