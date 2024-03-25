package User;

import Book.BookList;
import Operation.*;

import java.util.Scanner;

public class NormalUser extends User{


    public NormalUser(String name) {
        super(name);
        this.iOperations=new IOperation[]{new Exit(),new Select(),new Borrow(),new Return()};
    }

    @Override
    public int display() {
        System.out.println("*****普通用户*****");
        System.out.println("1. 查找图书");
        System.out.println("2. 借阅图书");
        System.out.println("3. 归还图书");
        System.out.println("0. 退出系统");
        System.out.println("***************");
        Scanner scanner=new Scanner(System.in);
        int choice=scanner.nextInt();
        return choice;
    }

    @Override
    public void doOperation(int choice, BookList bookList) {
        this.iOperations[choice].work(bookList);
    }
}
