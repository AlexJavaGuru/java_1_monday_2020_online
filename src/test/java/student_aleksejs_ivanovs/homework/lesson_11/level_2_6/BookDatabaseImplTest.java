package student_aleksejs_ivanovs.homework.lesson_11.level_2_6;

import junit.framework.TestCase;
import teacher.annotations.CodeReview;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@CodeReview(approved = true)
public class BookDatabaseImplTest extends TestCase {

    public void testDelete() {   //    Task_7
        BookDatabaseImpl bookDb = new BookDatabaseImpl();
        bookDb.save(new Book("Alien","Moon"));
        bookDb.save(new Book("Alien2","Moon2"));
        boolean result = bookDb.delete(2L);
        assertTrue(result);
    }

    public void testTestDelete() {   //   Task_8
        BookDatabaseImpl bookDb = new BookDatabaseImpl();
        Book book = new Book("Alien","Moon");
        bookDb.save(book);
        boolean result = bookDb.delete(book);
        assertTrue(result);
    }

    public void testFindById() {    //   Task_9
        BookDatabaseImpl bookDb = new BookDatabaseImpl();
        bookDb.save(new Book("Alien","Moon"));
        bookDb.save(new Book("Alien2","Moon2"));
        Book bookOptional = bookDb.findById(1L).get();
        boolean result = bookOptional.getId() == 1L;
        assertTrue(result);
    }

    public void testFindByAuthor() {    //   Task_10
        BookDatabaseImpl bookDb = new BookDatabaseImpl();
        bookDb.save(new Book("Alien","Moon"));
        List<Book> bookListByAuthor = new ArrayList<>(bookDb.findByAuthor("Alien"));
        boolean result = !bookListByAuthor.isEmpty();
        assertTrue(result);
    }

    public void testFindByTitle() {    //   Task_11
        BookDatabaseImpl bookDb = new BookDatabaseImpl();
        bookDb.save(new Book("Alien","Moon"));
        List<Book> bookListByTitle = new ArrayList<>(bookDb.findByTitle("Moon"));
        boolean result = !bookListByTitle.isEmpty();
        assertTrue(result);
    }

    public void testCountAllBooks() {   //   Task_12
        BookDatabaseImpl bookDb = new BookDatabaseImpl();
        bookDb.save(new Book("Alien","Moon"));
        bookDb.save(new Book("Alien2","Moon2"));
        int result = bookDb.countAllBooks();
        assertEquals(2, result);
    }

    public void testDeleteByAuthor() {   //   Task_13
        BookDatabaseImpl bookDb = new BookDatabaseImpl();
        bookDb.save(new Book("Alien","Moon"));
        bookDb.deleteByAuthor("Alien");
        boolean result = bookDb.countAllBooks() == 0;
        assertTrue(result);
    }

    public void testDeleteByTitle() {   //   Task_14
        BookDatabaseImpl bookDb = new BookDatabaseImpl();
        bookDb.save(new Book("Alien","Moon"));
        bookDb.deleteByTitle("Moon");
        boolean result = bookDb.countAllBooks() == 0;
        assertTrue(result);
    }

    public void testFind() {    //   Task_22
        BookDatabaseImpl bookDb = new BookDatabaseImpl();
        bookDb.save(new Book("Alien","Moon", "2020"));
        SearchCriteria yearSearchCriteria = new YearOfIssueSearchCriteria("2020");
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Alien");
        SearchCriteria andSearchCriteria = new AndSearchCriteria(authorSearchCriteria, yearSearchCriteria);
        boolean result = bookDb.find(andSearchCriteria).size() == 1;
        assertTrue(result);
    }

    public void testFindUniqueAuthors() {   //   Task_23
        BookDatabaseImpl bookDb = new BookDatabaseImpl();
        bookDb.save(new Book("Alien","Moon"));
        boolean result = bookDb.findUniqueAuthors().size() == 1;
        assertTrue(result);
    }

    public void testFindUniqueTitles() {    //   Task_24
        BookDatabaseImpl bookDb = new BookDatabaseImpl();
        bookDb.save(new Book("Alien","Moon"));
        boolean result = bookDb.findUniqueTitles().size() == 1;
        assertTrue(result);
    }

    public void testFindUniqueBooks() {    //   Task_25
        BookDatabaseImpl bookDb = new BookDatabaseImpl();
        bookDb.save(new Book("Alien","Moon"));
        bookDb.save(new Book("Alien2","Moon2"));
        boolean result = bookDb.findUniqueBooks().size() == 2;
        assertTrue(result);
    }

    public void testContains() {    //   Task_26
        BookDatabaseImpl bookDb = new BookDatabaseImpl();
        Book book = new Book("Alien","Moon");
        bookDb.save(book);
        boolean result = bookDb.contains(book);
        assertTrue(result);
    }

    public void testGetAuthorToBooksMap() {    //   Task_28
        BookDatabaseImpl bookDb = new BookDatabaseImpl();
        bookDb.save(new Book("Alien","Moon"));
        bookDb.save(new Book("Alien","Moon2"));
        Map<String, List<Book>> authorToBooksMap = bookDb.getAuthorToBooksMap();
        boolean result = authorToBooksMap.get("Alien").size() == 2;
        assertTrue(result);
    }

    public void testGetEachAuthorBookCount() {    //   Task_29
        BookDatabaseImpl bookDb = new BookDatabaseImpl();
        bookDb.save(new Book("Alien","Moon"));
        bookDb.save(new Book("Alien","Moon2"));
        Map<String, Integer> eachAuthorBookCountMap = bookDb.getEachAuthorBookCount();
        boolean result = eachAuthorBookCountMap.get("Alien") == 2;
        assertTrue(result);
    }
}