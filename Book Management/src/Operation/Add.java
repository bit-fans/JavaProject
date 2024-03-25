package Operation;

import Book.Book;
import Book.BookList;

import java.util.Scanner;

public class Add implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("新增");
        System.out.println("请输入新增书名");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        System.out.println("请输入新增书的作者");
        String author=scanner.nextLine();
        System.out.println("请输入书的价格");
        int price =scanner.nextInt();
        String tmp=scanner.nextLine();
        System.out.println("请输入书的类型");
        String type=scanner.nextLine();

        //新增一个书的对象
        Book book=new Book(name,author,price,type);
        int currentSized=bookList.getUseSized();

        for (int i = 0; i < currentSized; i++) {
            Book book1=bookList.getBook(i);
            if(book1.getBookName().equals(name)){
                System.out.println("该书已存在，书名为->"+name);
                return;
            }
        }

        //插入
        bookList.setBooks(book,currentSized);
        bookList.setUseSized(currentSized+1);

    }
}
