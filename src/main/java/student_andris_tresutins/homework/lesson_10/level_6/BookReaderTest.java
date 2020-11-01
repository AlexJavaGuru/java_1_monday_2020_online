package student_andris_tresutins.homework.lesson_10.level_6;


import teacher.annotations.CodeReview;

import java.util.HashSet;

@CodeReview(approved = true)
public class BookReaderTest {

    public static void main(String[] args) {
        BookReaderTest test = new BookReaderTest();
        test.bookSaveTest();
        test.bookSaveDuplicateTest();
        test.deleteBookTest();
        test.showBooks();
        test.findByAuthor();
        test.findByTitle();
        test.setBookRead();
        test.setBookUnRead();
        test.showReadBooks();
        test.showUnReadBooks();


    }
    //Task_25
    public void showUnReadBooks() {
        BookReaderImpl victim = new BookReaderImpl();
        Book book = new Book("Visual", "Jeff");
        Book bookTwo = new Book("Thingie", "Jeff");

        victim.save(book);
        victim.save(bookTwo);

        victim.setBookUnRead(book);
        victim.setBookUnRead(bookTwo);

        System.out.println(" - Start of show Read books test - ");
        System.out.println("Show books test. Should return the Book title and the Book author and false if the book hasn't been read: ");
        victim.showUnReadBooks();
        System.out.println(" - end of show Read books test - ");
    }

    //Task_24
    public void showReadBooks() {
        BookReaderImpl victim = new BookReaderImpl();
        Book book = new Book("Visual", "Jeff");
        Book bookTwo = new Book("Thingie", "Jeff");

        victim.save(book);
        victim.save(bookTwo);

        victim.setBookRead(book);
        victim.setBookRead(bookTwo);

        System.out.println(" - Start of show Read books test - ");
        System.out.println("Show books test. Should return the Book title and the Book author and true if the book has been read: ");
        victim.showReadBooks();
        System.out.println(" - end of show Read books test - ");
    }
    //Task_23
    public void setBookUnRead() {
        BookReader victim = new BookReaderImpl();
        Book bookOne = new Book("Visual ", "Jeff NotDuningham");
        Book bookTwo = new Book("Thingie ", "Jeff Duningham");
        Book bookThree = new Book("Thingie ", "Not Jeff");

        victim.save(bookOne);
        victim.save(bookTwo);
        victim.save(bookThree);
        boolean result = victim.setBookUnRead(bookOne);
        boolean expected = true;

        check(expected, result, "Set book as unread");

    }
    //Task_22
    public void setBookRead() {
        BookReader victim = new BookReaderImpl();
        Book bookOne = new Book("Visual ", "Jeff NotDuningham");
        Book bookTwo = new Book("Thingie ", "Jeff Duningham");
        Book bookThree = new Book("Thingie ", "Not Jeff");

        victim.save(bookOne);
        victim.save(bookTwo);
        victim.save(bookThree);
        boolean result = victim.setBookRead(bookOne);
        boolean expected = true;

        check(expected, result, "Set book as read");

    }
    //Task_20_21
    public void findByTitle(){
        BookReader victim = new BookReaderImpl();
        Book bookOne = new Book("Visual ", "Jeff NotDuningham");
        Book bookTwo = new Book("Thingie ", "Jeff Duningham");
        Book bookThree = new Book("Thingie ", "Not Jeff");

        victim.save(bookOne);
        victim.save(bookTwo);
        victim.save(bookThree);

        HashSet<Book> book = victim.findBookTitle("Thing");
        int result = book.size();
        int expected = 2;
        check(expected, result, "Find By author");

    }

    //Task_18_19
    public void findByAuthor(){
        BookReader victim = new BookReaderImpl();
        Book bookOne = new Book("Visual", "Jeff NotDuningham ");
        Book bookTwo = new Book("Thingie", "Jeff Duningham ");
        Book bookThree = new Book("Thingie", "Not Jeff      ");

        victim.save(bookOne);
        victim.save(bookTwo);
        victim.save(bookThree);

        HashSet<Book> book = victim.findBookAuthor("jeff Duningham");
        int result = book.size();
        int expected = 1;
        check(expected, result, "Find By author");

    }
    //Task_17
    public void showBooks(){
        BookReaderImpl victim = new BookReaderImpl();
        Book book = new Book("Visual", "Jeff");
        Book bookTwo = new Book("Thingie", "Jeff");

        victim.save(book);
        victim.save(bookTwo);

        System.out.println(" - Start of show books test - ");
        System.out.println("Show books test. Should return the Book title and the Book author: ");
        victim.showBookList();
        System.out.println(" - end of show books test - ");
    }
    //Task_16
    public void deleteBookTest(){
        BookReader victim = new BookReaderImpl();
        Book book = new Book("Visual", "Jeff");

        victim.save(book);
        victim.delete(book);

        boolean result = victim.contains(book);
        boolean expected = false;

        check(expected, result, "Delete");

    }
    // Task_14
    public void bookSaveTest(){
        BookReader victim = new BookReaderImpl();
        Book book = new Book("Visual", "Jeff");
        victim.save(book);

        boolean result = victim.contains(book);
        boolean expected = true;

        check(expected, result, "Save");

    }
    public void bookSaveDuplicateTest(){
        BookReader victim = new BookReaderImpl();
        Book bookOne = new Book("Visual", "Jeff");
        Book BookTwo = new Book("Visual", "Jeff");
        victim.save(bookOne);
        victim.save(BookTwo);


        int result = victim.count();
        int expected = 1;

        check(expected, result, "Don't Save Duplicate");

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

    public void check(int expectedResult, int actual, String testName) {
        if (expectedResult == actual) {
            System.out.println(testName + " Test Has Passed");
        } else {
            System.out.println(testName + " Test Has Failed");
            System.out.println("The result was : " + actual);
            System.out.println("expected : " + expectedResult);
        }

    }
}
