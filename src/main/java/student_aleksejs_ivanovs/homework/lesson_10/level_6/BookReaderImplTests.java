package student_aleksejs_ivanovs.homework.lesson_10.level_6;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class BookReaderImplTests {

    public static void main(String[] args) {
        BookReaderImplTests test = new BookReaderImplTests();
        test.addBooksTest();
        test.addBooksTest2();
        test.removeBookTest();
        test.removeBookTest2();
        test.writeBookStorageTest();
        test.searchBooksByAuthorTest();
        test.searchBooksByBooksNameTest();
        test.markBookAsReadAndWriteReadBooksTest();
        test.markBookAsNotReadAndWriteUnreadBooksTest();
    }

    public void addBooksTest() {
        BookReaderImpl bookImpl = new BookReaderImpl();
        Book book = new Book("Person", "Door");

        boolean actualResult = bookImpl.addBook(book);

        check(true, actualResult, "addBooksTest");
    }

    public void addBooksTest2() {
        BookReaderImpl bookImpl = new BookReaderImpl();
        Book book = new Book("Person", "Door");
        bookImpl.addBook(book);

        boolean actualResult = bookImpl.addBook(book);

        check(false, actualResult, "addBooksTest2");
    }

    public void removeBookTest() {
        BookReaderImpl bookImpl = new BookReaderImpl();
        Book book = new Book("Person", "Door");
        bookImpl.addBook(book);

        boolean actualResult = bookImpl.removeBook(book);

        check(true, actualResult, "removeBookTest");
    }

    public void removeBookTest2() {
        BookReaderImpl bookImpl = new BookReaderImpl();
        Book book = new Book("Person", "Door");

        boolean actualResult = bookImpl.removeBook(book);

        check(false, actualResult, "removeBookTest2");
    }

    public void writeBookStorageTest() {
        BookReaderImpl bookImpl = new BookReaderImpl();
        Book book1 = new Book("Person", "Door");
        Book book2 = new Book("Person2", "Door2");
        bookImpl.addBook(book1);
        bookImpl.addBook(book2);

        System.out.print("writeBookStorageTest result = ");
        bookImpl.writeBookStorage();
    }

    public void searchBooksByAuthorTest() {
        BookReaderImpl bookImpl = new BookReaderImpl();
        Book book1 = new Book("Person", "Door");
        Book book2 = new Book("Person2", "Door2");
        Book book3 = new Book("Alien", "Moon");
        bookImpl.addBook(book1);
        bookImpl.addBook(book2);
        bookImpl.addBook(book3);

        System.out.print("\nsearchBooksByAuthor 'Per...' Test result = ");
        bookImpl.searchBooksByAuthor("Per");
    }

    public void searchBooksByBooksNameTest() {
        BookReaderImpl bookImpl = new BookReaderImpl();
        Book book1 = new Book("Person", "Door");
        Book book2 = new Book("Person2", "Door2");
        Book book3 = new Book("Alien", "Moon");
        bookImpl.addBook(book1);
        bookImpl.addBook(book2);
        bookImpl.addBook(book3);

        System.out.print("\nsearchBooksByBooksName 'Do...' Test result = ");
        bookImpl.searchBooksByBooksName("Do");
    }

    public void markBookAsReadAndWriteReadBooksTest() {
        BookReaderImpl bookImpl = new BookReaderImpl();
        Book book1 = new Book("Person", "Door");
        Book book2 = new Book("Person2", "Door2");
        Book book3 = new Book("Alien", "Moon");
        bookImpl.addBook(book1);
        bookImpl.addBook(book2);
        bookImpl.addBook(book3);

        bookImpl.markBookAsRead(book1);
        bookImpl.markBookAsRead(book2);

        System.out.print("\nmarkBookAsReadAndWriteReadBooksTest result = ");
        bookImpl.writeReadBooks();

    }

    public void markBookAsNotReadAndWriteUnreadBooksTest() {
        BookReaderImpl bookImpl = new BookReaderImpl();
        Book book1 = new Book("Person", "Door");
        Book book2 = new Book("Person2", "Door2");
        Book book3 = new Book("Alien", "Moon");
        bookImpl.addBook(book1);
        bookImpl.addBook(book2);
        bookImpl.addBook(book3);

        bookImpl.markBookAsRead(book1);
        bookImpl.markBookAsRead(book2);
        bookImpl.markBookAsNotRead(book2);

        System.out.print("\nmarkBookAsNotReadAndWriteUnreadBooksTest result = ");
        bookImpl.writeUnreadBooks();

    }

    private void check(boolean expectedResult, boolean actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected result was : " + expectedResult + " but actual result was : " + actualResult);
        }
    }

}
