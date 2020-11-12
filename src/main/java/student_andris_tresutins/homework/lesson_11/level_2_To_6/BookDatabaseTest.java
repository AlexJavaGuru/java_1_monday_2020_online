package student_andris_tresutins.homework.lesson_11.level_2_To_6;

import teacher.annotations.CodeReview;

import java.util.*;
@CodeReview(approved = true)
public class BookDatabaseTest {
    public static void main(String[] args) {
        BookDatabaseTest test = new BookDatabaseTest();

        test.deleteById();
        test.deleteByObject();
        test.findById();
        test.findByAuthor();
        test.findByTitle();
        test.countAllBooks();
        test.deleteByAuthor();
        test.deleteByTitle();
        test.searchByCriteria();
        test.findUniqueAuthor();
        test.findUniqueTitle();
        test.findUniqueBook();
        test.uniqueWordFinder();
        test.getAuthorToBooksMapTest();
        test.getEachAuthorBookCount();

    }

    public void getEachAuthorBookCount(){
        BookDatabase victim = new BookDatabaseImpl();
        Book book = new Book("Lexi", "Machines","2000");
        Book bookTwo = new Book("Alfred", "Machinerator","2000");
        Book bookThree = new Book("Jimmy", "Neutrons","2000");
        Book bookFour = new Book("Jimmy", "Neutrons","2000");

        victim.save(book);
        victim.save(bookTwo);
        victim.save(bookThree);
        victim.save(bookFour);

        Map<String, Integer> authorsBookCount = victim.getEachAuthorBookCount();

        boolean lexiBooks = authorsBookCount.get("Lexi") == 1;
        boolean alfredBooks = authorsBookCount.get("Alfred") == 1;
        boolean jimmyBooks = authorsBookCount.get("Jimmy") == 2;

        boolean actual = lexiBooks && alfredBooks && jimmyBooks;
        boolean expected = true;

        check(expected, actual, "Get author book count");

    }

    public void getAuthorToBooksMapTest(){
        BookDatabase victim = new BookDatabaseImpl();
        Book book = new Book("Lexi", "Machines","2000");
        Book bookTwo = new Book("Alfred", "Machinerator","2000");
        Book bookThree = new Book("Jimmy", "Neutrons","2000");
        Book bookFour = new Book("Jimmy", "Neutrons","2000");

        victim.save(book);
        victim.save(bookTwo);
        victim.save(bookThree);
        victim.save(bookFour);

        Map<String, List<Book>> authorsBooks = victim.getAuthorToBooksMap();

        boolean lexiBooks = authorsBooks.get("Lexi").size() == 1;
        boolean alfredBooks = authorsBooks.get("Alfred").size() == 1;
        boolean jimmyBooks = authorsBooks.get("Jimmy").size() == 2;

        boolean actual = lexiBooks && alfredBooks && jimmyBooks;
        boolean expected = true;

        check(expected, actual, "Get author books Map");

    }

    public void uniqueWordFinder(){
        UniqueWordFinder unique = new UniqueWordFinder();
        String text = "baguette baguette baguette cheese cheese garlic bread garlic";
        Set<String> wordSet = unique.find(text);
        int actual = wordSet.size();
        int expected = 4;

        check(expected, actual, "Unique Word Finder");
    }


    public void findUniqueBook(){
        BookDatabase victim = new BookDatabaseImpl();
        Book book = new Book("Lexi", "Machines","2000");
        Book bookTwo = new Book("Alfred", "Machinerator","2000");
        Book bookThree = new Book("Jimmy", "Neutrons","2000");
        Book bookFour = new Book("Jimmy", "Neutrons","2000");

        victim.save(book);
        victim.save(bookTwo);
        victim.save(bookThree);
        victim.save(bookFour);

        List<Book> test = new ArrayList<>();
        test.add(bookThree);
        test.add(bookFour);

        int actual = victim.findUniqueBooks().size();
        int expected = 4;

        check(expected, actual, "Find unique Books");

    }

    public void findUniqueTitle(){
        BookDatabase victim = new BookDatabaseImpl();
        Book book = new Book("Lexi", "Machines","2000");
        Book bookTwo = new Book("Alfred", "Machinerator","2000");
        Book bookThree = new Book("Jimmy", "Neutrons","2000");
        Book bookFour = new Book("Jimmy", "Neutrons","2000");

        victim.save(book);
        victim.save(bookTwo);
        victim.save(bookThree);
        victim.save(bookFour);

        List<Book> test = new ArrayList<>();
        test.add(bookThree);
        test.add(bookFour);

        int actual = victim.findUniqueTitles().size();
        int expected = 3;

        check(expected, actual, "Find unique titles");

    }

    public void findUniqueAuthor(){
        BookDatabase victim = new BookDatabaseImpl();
        Book book = new Book("Lexi", "Machines","2000");
        Book bookTwo = new Book("Alfred", "Machinerator","2000");
        Book bookThree = new Book("Jimmy", "Kek","2000");
        Book bookFour = new Book("Jimmy", "Neutrons","2000");

        victim.save(book);
        victim.save(bookTwo);
        victim.save(bookThree);
        victim.save(bookFour);

        List<Book> test = new ArrayList<>();
        test.add(bookThree);
        test.add(bookFour);

        int actual = victim.findUniqueAuthors().size();
        int expected = 3;

        check(expected, actual, "Find unique authors");

    }

    public void searchByCriteria(){
        BookDatabase victim = new BookDatabaseImpl();
        Book book = new Book("Lexi", "Machines","2000");
        Book bookTwo = new Book("Alfred", "Machinerator","2000");
        Book bookThree = new Book("Jimmy", "Kek","2000");
        Book bookFour = new Book("Jimmy", "Neutrons","2000");

        victim.save(book);
        victim.save(bookTwo);
        victim.save(bookThree);
        victim.save(bookFour);

        List<Book> test = new ArrayList<>();
        test.add(bookThree);
        test.add(bookFour);

        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Jimmy");
        SearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("2000");
        SearchCriteria andSearchCriteria = new AndSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria);


        boolean result = victim.find(andSearchCriteria).equals(test);
        boolean expected = true;


        check(expected, result,"Find By Author");



    }

    public void deleteByTitle(){
        BookDatabase victim = new BookDatabaseImpl();
        Book book = new Book("Lexi", "Machines","2000");
        Book bookTwo = new Book("Alfred", "Machinerator","2000");
        Book bookThree = new Book("Jimmy", "Kek","2000");
        Book bookFour = new Book("Jimmy", "Neutrons","2000");

        victim.save(book);
        victim.save(bookTwo);
        victim.save(bookThree);
        victim.save(bookFour);

        victim.deleteByTitle("Neutrons");

        int actual = victim.countAllBooks();
        int expected = 3;

        check(expected,actual,"Delete By Title");
    }

    public void deleteByAuthor(){
        BookDatabase victim = new BookDatabaseImpl();
        Book book = new Book("Lexi", "Machines","2000");
        Book bookTwo = new Book("Alfred", "Machinerator","2000");
        Book bookThree = new Book("Jimmy", "Kek","2000");
        Book bookFour = new Book("Jimmy", "Neutrons","2000");

        victim.save(book);
        victim.save(bookTwo);
        victim.save(bookThree);
        victim.save(bookFour);

        victim.deleteByAuthor("Jimmy");

        int actual = victim.countAllBooks();
        int expected = 2;

        check(expected,actual,"Delete By Author");
    }

    public void countAllBooks(){
        BookDatabase victim = new BookDatabaseImpl();
        Book book = new Book("Lexi", "Machines","2000");
        Book bookTwo = new Book("Alfred", "Machinerator","2000");
        Book bookThree = new Book("Jimmy", "Kek","2000");
        Book bookFour = new Book("Jimmy", "Neutrons","2000");

        victim.save(book);
        victim.save(bookTwo);
        victim.save(bookThree);
        victim.save(bookFour);

        int actual = victim.countAllBooks();
        int expected = 4;

        check(expected,actual,"Count all books");
    }

    public void deleteById(){
        BookDatabase victim = new BookDatabaseImpl();
        Book book = new Book("Lexi", "Machines","2000");
        Book bookTwo = new Book("Alfred", "Machinerator","2000");
        Book bookThree = new Book("Jimmy", "Kek","2000");
        Book bookFour = new Book("Jimmy", "Neutrons","2000");

         victim.save(book);
         victim.save(bookTwo);
         victim.save(bookThree);
         victim.save(bookFour);

         victim.delete(1L);
         victim.delete(4L);

       int result = victim.countAllBooks();
       int expected = 2;

        check(expected, result,"Delete By Id");
    }

    public void deleteByObject(){
        BookDatabase victim = new BookDatabaseImpl();
        Book book = new Book("Lexi", "Machines","2000");
        Book bookTwo = new Book("Alfred", "Machinerator","2000");
        Book bookThree = new Book("Jimmy", "Kek","2000");
        Book bookFour = new Book("Jimmy", "Neutrons","2000");

        victim.save(book);
        victim.save(bookTwo);
        victim.save(bookThree);
        victim.save(bookFour);

        victim.delete(book);
        victim.delete(bookFour);

        int result = victim.countAllBooks();
        int expected = 2;


        check(expected, result,"Delete By Object");


    }

    public void findById(){
        BookDatabase victim = new BookDatabaseImpl();
        Book book = new Book("Lexi", "Machines","2000");
        Book bookTwo = new Book("Alfred", "Machinerator","2000");
        Book bookThree = new Book("Jimmy", "Kek","2000");
        Book bookFour = new Book("Jimmy", "Neutrons","2000");

        victim.save(book);
        victim.save(bookTwo);
        victim.save(bookThree);
        victim.save(bookFour);

        boolean result = victim.findById(3L).get().equals(bookThree);
        boolean expected = true;


        check(expected, result,"Find By Id");


    }

    public void findByAuthor(){
        BookDatabase victim = new BookDatabaseImpl();
        Book book = new Book("Lexi", "Machines","2000");
        Book bookTwo = new Book("Alfred", "Machinerator","2000");
        Book bookThree = new Book("Jimmy", "Kek","2000");
        Book bookFour = new Book("Jimmy", "Neutrons","2000");

        victim.save(book);
        victim.save(bookTwo);
        victim.save(bookThree);
        victim.save(bookFour);

        List<Book> test = new ArrayList<>();
        test.add(bookThree);
        test.add(bookFour);

        boolean result = victim.findByAuthor("Jimmy").equals(test);
        boolean expected = true;


        check(expected, result,"Find By Author");


    }

    public void findByTitle(){
        BookDatabase victim = new BookDatabaseImpl();
        Book book = new Book("Lexi", "Machines","2000");
        Book bookTwo = new Book("Alfred", "Machinerator","2000");
        Book bookThree = new Book("Jimmy", "Kek","2000");
        Book bookFour = new Book("Jimmy", "Neutrons","2000");

        victim.save(book);
        victim.save(bookTwo);
        victim.save(bookThree);
        victim.save(bookFour);

        List<Book> test = new ArrayList<>();
        test.add(bookThree);

        boolean result = victim.findByTitle("Kek").equals(test);
        boolean expected = true;


        check(expected, result,"Find By Title");


    }

    public void check(long expectedResult, long actual, String testName) {
        if (expectedResult == actual) {
            System.out.println(testName + " Test Has Passed");
        } else {
            System.out.println(testName + " Test Has Failed");
            System.out.println("The result was : " + actual);
            System.out.println("expected : " + expectedResult);
        }

    }

    public void check(int expectedResult, int actual, String testName) {
        if (expectedResult == actual) {
            System.out.println(testName + " Test Has Passed");
        } else {
            System.out.println(testName + " Test Has Failed");
            System.out.println("The result was : " + actual);
            System.out.println("expected : " + expectedResult);
        }

    }

    public void check(boolean expectedResult, boolean actual, String testName) {
        if (expectedResult == actual) {
            System.out.println(testName + " Test Has Passed");
        } else {
            System.out.println(testName + " Test Has Failed");
            System.out.println("The result was : " + actual);
            System.out.println("expected : " + expectedResult);
        }

    }

    public void check(List expectedResult, List actual, String testName) {
        if (expectedResult == actual) {
            System.out.println(testName + " Test Has Passed");
        } else {
            System.out.println(testName + " Test Has Failed");
            System.out.println("The result was : " + actual);
            System.out.println("expected : " + expectedResult);
        }

    }


}
