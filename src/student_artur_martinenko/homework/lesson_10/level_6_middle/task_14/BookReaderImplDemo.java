package student_artur_martinenko.homework.lesson_10.level_6_middle.task_14;

class BookReaderImplDemo {
    public static void main(String[] args) {
        BookReaderImplDemo victim = new BookReaderImplDemo();
        victim.addBookToLibraryTest1();
        victim.addBookToLibraryTest2();


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


}
