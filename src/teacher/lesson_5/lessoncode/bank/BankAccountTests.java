package teacher.lesson_5.lessoncode.bank;

public class BankAccountTests {

    public void testAddFounds() {
        BankAccount victim = new BankAccount("Test Name");

        Transaction[] transactions = {new Transaction(true, 100)};
        victim.executeTransaction(transactions);

        check(100, victim.getMoney(), "Test1");
    }

    public void testMultipleTransactions() {
        BankAccount victim = new BankAccount("Test Name");


        Transaction[] transactions = {
                new Transaction(true, 100),
                new Transaction(true, 100),
                new Transaction(true, 100),
                new Transaction(true, 100)
        };
        victim.executeTransaction(transactions);

        check(400, victim.getMoney(), "Test2");
    }

    private void check(int expectedValue, int actualValue, String testName) {
        if (expectedValue == actualValue) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expecting value: " + expectedValue);
            System.out.println("Actual value: " + actualValue);
        }
    }

}
