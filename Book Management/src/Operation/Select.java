package Operation;

import Book.Book;
import Book.BookList;


import java.util.Scanner;

public class Select implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("查找图书");
        System.out.println("请输入查找图书の书名");
        Scanner scanner=new Scanner(System.in);
        String BookName=scanner.nextLine();
        int currentSize=bookList.getUseSized();

        for(int i=0;i<currentSize;i++){
            Book book=bookList.getBook(i);
            if(book.getBookName().equals(BookName)){
                System.out.println("已找到该书，书名为："+BookName);
                return;
            }
        }
        System.out.println("未找到该书，书名为："+BookName);
    }
}
