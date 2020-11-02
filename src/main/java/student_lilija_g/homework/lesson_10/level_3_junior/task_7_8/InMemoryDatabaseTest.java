package student_lilija_g.homework.lesson_10.level_3_junior.task_7_8;

class InMemoryDatabaseTest {

    public static void main(String[] args) {

        Database database = new InMemoryDatabase();
        InMemoryDatabaseTest myInMemoryDatabaseTest = new InMemoryDatabaseTest();

        Product productOne = new Product("Product name No.1");
        database.save(productOne);
        database.findByTitle("Product name No.1");
        myInMemoryDatabaseTest.totalTestBoolean(true, InMemoryDatabase.products.contains(productOne), "Save Product name No.1");
        myInMemoryDatabaseTest.totalTestBoolean(true, productOne.equals(database.findByTitle("Product name No.1")), "Find Product name No.1");

        Product productTwo = new Product("Product name No.2"); // Not save
        myInMemoryDatabaseTest.totalTestBoolean(false, InMemoryDatabase.products.contains(productTwo), "Before save Product name No.2");
        myInMemoryDatabaseTest.totalTestBoolean(false, productTwo.equals(database.findByTitle("Product name No.2")), "Before save Find Product name No.2");

        database.save(productTwo);
        myInMemoryDatabaseTest.totalTestBoolean(true, InMemoryDatabase.products.contains(productTwo), "After save Product name No.2");
        myInMemoryDatabaseTest.totalTestBoolean(true, productTwo.equals(database.findByTitle("Product name No.2")), "After save Find Product name No.2");
    }

    void totalTestBoolean(boolean expendedValue, boolean actualValue, String testName) {
        if (expendedValue == actualValue) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }
}
