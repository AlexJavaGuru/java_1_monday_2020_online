package student_artur_martinenko.homework.lesson_10.level_3_junior.task_10;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class InMemoryDatabaseDemo {

    public static void main(String[] args) {
        InMemoryDatabaseDemo victim = new InMemoryDatabaseDemo();
        victim.saveTest();
        victim.findByTitleTest();
    }

    public void check(boolean expected, boolean actual, String testName) {
        if (expected == actual) {
            System.out.println("Test " + testName + " - PASSED");
        } else {
            System.out.println("Test " + testName + " - FAILED");
            System.out.println("\tExpected " + expected + " but passed " + actual);
        }
    }

    public void saveTest() {
        Database database = new InMemoryDatabase();
        Product product = new Product("product1");
        database.save(product);
        boolean ifInDataBase = InMemoryDatabase.productList.contains(product);
        check(true, ifInDataBase, "saveTest");
    }

    public void findByTitleTest() {
        Database database = new InMemoryDatabase();
        Product product = new Product("product1");
        database.save(product);
        Product productToFind = database.findByTitle("Product1");
        boolean isProductsEqual = product.equals(productToFind);
        check(true, isProductsEqual, "findByTitleTest");
    }

}
