package User;

import Book.BookList;
import Operation.*;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class AdminUser extends User {

    public AdminUser(String name) {
        super(name);
        this.iOperations=new IOperation[]{new Exit(),new Select(),new Add(),new Delete(),new Display()};
    }

    @Override
    public int display() {
        System.out.println("*****管理员用户*****");
        System.out.println("1. 查找图书");
        System.out.println("2. 新增图书");
        System.out.println("3. 删除图书");
        System.out.println("4. 显示图书");
        System.out.println("0. 退出系统");
        System.out.println("***************");
        System.out.println("请输入您的操作->");
        Scanner scanner=new Scanner(System.in);
        int choice=scanner.nextInt();
        return choice;

    }

    @Override
    public void doOperation(int choice, BookList bookList) {
        this.iOperations[choice].work(bookList); //这步实现了work方法的调用
    }
}
