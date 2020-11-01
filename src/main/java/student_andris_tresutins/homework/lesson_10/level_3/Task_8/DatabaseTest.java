package student_andris_tresutins.homework.lesson_10.level_3.Task_8;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class DatabaseTest {
    public static void main(String[] args) {
        DatabaseTest test = new DatabaseTest();
        test.saveTest();
        test.findByTitleTest();

    }

    void saveTest() {
        Database victim = new InMemoryDatabase();
        Product product = new Product("Beans");
        victim.save(product);

        boolean result = InMemoryDatabase.list.contains(product);
        boolean expected = true;

        check(expected, result, "Save test");

    }

    void findByTitleTest() {
        Database victim = new InMemoryDatabase();
        Product product = new Product("Bread");
        victim.save(product);
        Product bread = victim.findByTitle("Bread");

        boolean result = product.equals(bread);
        boolean expected = true;

        check(expected, result, "Find By Title test");

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
}
