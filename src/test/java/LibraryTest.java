import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void before() {
        library = new Library();
        book = new Book("Jesus","Bible","Action");
        book = new Book("Judas","I didn't kill jesus, but if i did, this is how i would have done it ","True Crime");
        book = new Book("Capitalism","I'm God now, bitch.","self help");
    }
    @Test
    public void libraryStartsEmpty(){
        assertEquals(0, library.bookCount());
    }
    @Test
    public void canAddBook(){
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }
    @Test
    public void libraryHasCapacity(){
        assertEquals(3, library.hasCapacity());
    }
    @Test
    public void isNotAtCapacity(){
        assertEquals(false, library.isAtCapacity());
    }
    @Test
    public void isAtCapacity(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(true, library.isAtCapacity());
    }


}
