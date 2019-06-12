import java.util.ArrayList;

public class Library {


    private int capacity = 3;
    private ArrayList<Book> books;

    public Library(){
        this.books = new ArrayList<Book>();
    }
    public int bookCount(){
        return this.books.size();
    }
    public void addBook(Book book){
        this.books.add(book);
    }
    public int hasCapacity(){
        return this.capacity;
    }
    public boolean isAtCapacity(){
        if (this.bookCount() >= this.capacity) {
            return true;
        } else {
            return false;
        }

    }
}
