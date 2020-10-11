package student_artur_martinenko.homework.lesson_10.level_6_middle.task_25;

import java.util.ArrayList;

class BookReaderImplDemo {
    public static void main(String[] args) {
        BookReaderImplDemo victim = new BookReaderImplDemo();
        victim.addBookToLibraryTest1();
        victim.addBookToLibraryTest2();
        victim.authorOrTitleIsEmptyTest();
        victim.caseSensitiveTest();
        victim.removeBookFromLibraryTest();
        victim.listOfBooksInLibraryTest();
        victim.findBooksByAuthorTest();
        victim.matchAuthorByFirstLettersTest();
        victim.findBooksByTitleTest();
        victim.matchTitleByFirstLettersTest();
        victim.markBookAsReadByReaderTest();
        victim.markBookAsFavoriteUnreadTest();
        victim.booksReadByReadersTest();
        victim.booksNotReadByReadersTest();
    }

    public void check(boolean expected, boolean actual, String testName) {
        if (expected == actual) {
            System.out.println("Test " + testName + " - PASSED");
        } else {
            System.out.println("Test " + testName + " - FAILED");
            System.out.println("\tExpected " + expected + " but passed " + actual);
        }
    }

    public void addBookToLibraryTest1() {
        BookReader bookReader = new BookReaderImpl();
        Book book = new Book("author", "title");
        boolean flag = bookReader.addBookToLibrary(book);
        check(true, flag, "addBookToLibraryTest1");
    }

    public void addBookToLibraryTest2() {
        BookReader bookReader = new BookReaderImpl();
        Book book = new Book("author", "title");
        bookReader.addBookToLibrary(book);
        boolean flag = bookReader.addBookToLibrary(book);
        check(false, flag, "addBookToLibraryTest2");
    }

    public void authorOrTitleIsEmptyTest() {
        BookReader bookReader = new BookReaderImpl();
        Book book = new Book("", "title");
        boolean flag = bookReader.addBookToLibrary(book);
        check(false, flag, "authorOrTitleIsEmptyTest");
    }

    public void caseSensitiveTest() {
        Book book1 = new Book("author", "title");
        Book book2 = new Book("aUthor", "tItle");
        boolean flag = book1.equals(book2);
        check(true, flag, "caseSensitiveTest");
    }

    public void removeBookFromLibraryTest() {
        BookReader bookReader = new BookReaderImpl();
        Book book = new Book("author", "title");
        bookReader.addBookToLibrary(book);
        boolean flag = bookReader.removeBookFromLibrary(book);
        check(true, flag, "removeBookFromLibraryTest");
    }

    public void listOfBooksInLibraryTest() {
        BookReader bookReader = new BookReaderImpl();
        Book book = new Book("author", "title");
        Book book1 = new Book("author1", "title1");
        bookReader.addBookToLibrary(book);
        bookReader.addBookToLibrary(book1);
        System.out.println("Test listOfBooksInLibraryTest -");
        bookReader.listOfBooksInLibrary();
    }

    public void findBooksByAuthorTest() {
        BookReader bookReader = new BookReaderImpl();
        Book book = new Book("author", "title");
        Book book1 = new Book("author", "title1");
        Book book2 = new Book("NotAnAuthor", "NotATitle");
        bookReader.addBookToLibrary(book);
        bookReader.addBookToLibrary(book1);
        bookReader.addBookToLibrary(book2);
        ArrayList<Book> temp = bookReader.findBooksByAuthor("Author");
        boolean flag = temp.size() == 2;
        check(true, flag, "findBooksByAuthorTest");
    }

    public void matchAuthorByFirstLettersTest() {
        BookReader bookReader = new BookReaderImpl();
        Book book = new Book("Sasha Pushkin", "title");
        Book book1 = new Book("Sasha Pushkin", "title1");
        Book book2 = new Book("NotAnAuthor", "NotATitle");
        bookReader.addBookToLibrary(book);
        bookReader.addBookToLibrary(book1);
        bookReader.addBookToLibrary(book2);
        ArrayList<Book> temp = bookReader.findBooksByAuthor("Sasha");
        boolean flag = temp.size() == 2;
        check(true, flag, "matchAuthorByFirstLettersTest");
    }

    public void findBooksByTitleTest() {
        BookReader bookReader = new BookReaderImpl();
        Book book = new Book("author1", "title");
        Book book1 = new Book("author2", "title");
        Book book2 = new Book("NotAnAuthor", "NotATitle");
        bookReader.addBookToLibrary(book);
        bookReader.addBookToLibrary(book1);
        bookReader.addBookToLibrary(book2);
        ArrayList<Book> temp = bookReader.findBooksByTitle("Title");
        boolean flag = temp.size() == 2;
        check(true, flag, "findBooksByTitleTest");
    }

    public void matchTitleByFirstLettersTest() {
        BookReader bookReader = new BookReaderImpl();
        Book book = new Book("Sasha Pushkin", "title bebibo");
        Book book1 = new Book("Vasya Pupkin", "title bebibo");
        Book book2 = new Book("NotAnAuthor", "NotATitle");
        bookReader.addBookToLibrary(book);
        bookReader.addBookToLibrary(book1);
        bookReader.addBookToLibrary(book2);
        ArrayList<Book> temp = bookReader.findBooksByTitle("title");
        boolean flag = temp.size() == 2;
        check(true, flag, "matchTitleByFirstLettersTest");
    }

    public void markBookAsReadByReaderTest() {
        BookReader bookReader = new BookReaderImpl();
        Book book = new Book("Sasha Pushkin", "title bebibo");
        bookReader.addBookToLibrary(book);
        Reader reader = new Reader("Ivan");
        bookReader.addReaderToReaderList(reader);
        boolean flag = bookReader.markBookAsReadByReader(book, reader);
        check(true, flag, "markBookAsReadByReaderTest");
    }

    public void markBookAsFavoriteUnreadTest() {
        BookReader bookReader = new BookReaderImpl();
        Book book = new Book("Sasha Pushkin", "title bebibo");
        bookReader.addBookToLibrary(book);
        Reader reader = new Reader("Ivan");
        bookReader.addReaderToReaderList(reader);
        boolean flag = bookReader.markBookAsFavoriteUnread(book, reader);
        check(true, flag, "markBookAsFavoriteUnreadTest");
    }

    public void booksReadByReadersTest() {
        BookReader bookReader = new BookReaderImpl();
        Book book = new Book("Sasha Pushkin", "title bebibo");
        Book book1 = new Book("Vasya Pupkin", "title bebibo");
        Book book2 = new Book("NotAnAuthor", "NotATitle");
        bookReader.addBookToLibrary(book);
        bookReader.addBookToLibrary(book1);
        bookReader.addBookToLibrary(book2);
        Reader reader = new Reader("Ivan");
        bookReader.addReaderToReaderList(reader);
        reader.addReadBooks(book);
        reader.addReadBooks(book1);
        reader.addReadBooks(book2);
        Reader reader1 = new Reader("Petro");
        bookReader.addReaderToReaderList(reader);
        reader1.addReadBooks(book);
        reader1.addReadBooks(book1);
        reader1.addReadBooks(book2);
        boolean flag = bookReader.booksReadByReaders().size() == 3;
        check(true, flag, "booksReadByReadersTest");
    }

    public void booksNotReadByReadersTest() {
        BookReader bookReader = new BookReaderImpl();
        Book book = new Book("Sasha Pushkin", "title bebibo");
        Book book1 = new Book("Vasya Pupkin", "title bebibo");
        Book book2 = new Book("NotAnAuthor", "NotATitle");
        bookReader.addBookToLibrary(book);
        bookReader.addBookToLibrary(book1);
        bookReader.addBookToLibrary(book2);
        Reader reader = new Reader("Ivan");
        bookReader.addReaderToReaderList(reader);
        reader.addReadBooks(book);
        boolean flag = bookReader.booksNotReadByReaders().size() == 2;
        check(true, flag, "booksNotReadByReadersTest");
    }

}