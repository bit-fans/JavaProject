package Book;
import Operation.*;
import java.util.Arrays;

public class Book {
    private String BookName;
    private String BookAuthor;
    private int price;
    private String type;

    private boolean BookStatue;
    public Book(){

    }
    public Book(String bookName, String bookAuthor, int price, String type) {
        BookName = bookName;
        BookAuthor = bookAuthor;
        this.price = price;
        this.type = type;
    }



    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public String getBookAuthor() {
        return BookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        BookAuthor = bookAuthor;
    }

    public boolean isBookStatue() {
        return BookStatue;
    }

    public void setBookStatue(boolean bookStatue) {
        BookStatue = bookStatue;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }



    @Override
    public String toString() {
        return "Book.Book{" +
                "BookName='" + BookName + '\'' +
                ", BookAuthor='" + BookAuthor + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", BookStatue=" + BookStatue +
                '}';
    }


}
