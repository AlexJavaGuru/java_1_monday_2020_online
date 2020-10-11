package student_lilija_g.homework.lesson_9.level_4_junior.task_17;

class Demo {

    public static void main(String[] args) {

        Demo demo = new Demo();

        demo.notFraud();
        demo.fraud();

    }

    void totalTest(int expectedValue, int actualValue, String testName) {
        if (expectedValue == actualValue) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
            System.out.println("Expected Value = " + expectedValue);
            System.out.println("Actual Value = " + actualValue);
        }
    }

    void notFraud() {
        Demo demo = new Demo();
        Trader trader = new Trader("Jessica", "Los Angeles");
        Transaction transaction = new Transaction(trader, 1000);
        demo.totalTest(1000, transaction.getAmount(), "Not Pokemon");
    }

    void fraud() {
        Demo demo = new Demo();
        Trader trader = new Trader("Pokemon", "Los Angeles");
        Transaction transaction = new Transaction(trader, 1000);
        demo.totalTest(0, transaction.getAmount(), "Pokemon");
    }
}
