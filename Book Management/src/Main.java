import Book.BookList;
import User.NormalUser;
import User.User;
import User.AdminUser;
import java.util.Scanner;

public class Main {
    public static User login(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入姓名");
        String name=scanner.nextLine();
        System.out.println("请输入您的身份-> 1.管理员  2.普通用户");
        int choice=scanner.nextInt();
        if(choice==1){
            return new AdminUser(name);
        }else {
            return new NormalUser(name);
        }

    }
    public static void main(String[] args) {

        BookList bookList=new BookList();

        User user=login();
        while(true){
            int choice=user.display();
            user.doOperation(choice, bookList);
        }


    }
}
