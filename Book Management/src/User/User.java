package User;

import Book.BookList;
import Operation.IOperation;

public abstract class User {
    public String name;
    public IOperation[] iOperations;


    public User(String name){
        this.name=name;
    }

    public abstract int display();
    public abstract void doOperation(int choice, BookList bookList);

}
