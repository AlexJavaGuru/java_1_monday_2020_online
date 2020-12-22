package student_alexander_shl.homework.lesson_10.level_3_junior.task_10;

class InMemoryDatabaseTest {
    public static void main(String[] args) {

        Database database = new InMemoryDatabase();
        InMemoryDatabaseTest test = new InMemoryDatabaseTest();

        Product productTV = new Product("TV");
        database.save(productTV);
        database.findByTitle("TV");

        test.checkTestBoolean(true, InMemoryDatabase.products.contains(productTV), "Save Method Product TV");
        test.checkTestBoolean(true, productTV.equals(database.findByTitle("TV")), "Find Method Product TV");

        Product productTable = new Product("Product Table");
        test.checkTestBoolean(false, InMemoryDatabase.products.contains(productTable), "Contain Product Table");
        test.checkTestBoolean(false, productTable.equals(database.findByTitle("Product Table")), "Find Product Table");

        database.save(productTable);
        test.checkTestBoolean(true, InMemoryDatabase.products.contains(productTable), "Save Product Table");
        test.checkTestBoolean(true, productTable.equals(database.findByTitle("Product Table")), "Find Product Table");

    }
    void checkTestBoolean(boolean calculatedValue, boolean realValue, String testName) {
        if (calculatedValue == realValue) {
            System.out.println(testName + ": Test OK");
        } else {
            System.out.println(testName + ": Test WRONG");
            System.out.println("calculatedValue = " + calculatedValue);
            System.out.println("realValue = " + realValue);
        }
    }
}

