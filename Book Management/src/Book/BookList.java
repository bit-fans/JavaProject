package Book;

public class BookList {
    private Book[] books;
    private int useSized;

    public BookList() {
        this.books = new Book[20];
        this.books[0]=new Book("三国演义","罗贯中",98,"文史");
        this.books[1]=new Book("水浒传","施耐庵",138,"文史");
        this.books[2]=new Book("西游记","吴承恩",78,"文史");
        this.books[3]=new Book("红楼梦","曹雪芹",999,"文史");
        this.useSized =4;
    }

    public int getUseSized() {
        return useSized;
    }

    public void setUseSized(int useSized) {
        this.useSized = useSized;
    }

    public Book getBook(int pos){
        return books[pos];
    }

    public void setBooks (Book book,int pos){
        books[pos]=book;
    }
}
