package student_andris_tresutins.homework.lesson_10.level_6;



public class BookReaderTest {

    public static void main(String[] args) {
        BookReaderTest test = new BookReaderTest();
        test.bookSaveTest();
        test.bookSaveDuplicateTest();
        test.deleteBookTest();


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
        Book book1 = new Book("Visual", "Jeff");
        Book book2 = new Book("Visual", "Jeff");
        victim.save(book1);
        victim.save(book2);


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
