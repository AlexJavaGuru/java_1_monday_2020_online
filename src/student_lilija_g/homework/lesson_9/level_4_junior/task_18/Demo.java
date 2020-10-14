package student_lilija_g.homework.lesson_9.level_4_junior.task_18;

class Demo {

    public static void main(String[] args) {

        Demo demo = new Demo();

        demo.notFraudRuleOne();
        demo.fraudRuleOne();

        demo.notFraudRuleTwo();
        demo.fraudRuleTwo();

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

    void notFraudRuleOne() {
        Demo demo = new Demo();
        Trader trader = new Trader("Jessica", "Los Angeles");
        Transaction transaction = new Transaction(trader, 1000);
        demo.totalTest(1000, transaction.getAmount(), "Not Pokemon");
    }

    void fraudRuleOne() {
        Demo demo = new Demo();
        Trader trader = new Trader("Pokemon", "Los Angeles");
        Transaction transaction = new Transaction(trader, 1000);
        demo.totalTest(0, transaction.getAmount(), "Pokemon");
    }
    void notFraudRuleTwo() {
        Demo demo = new Demo();
        Trader trader = new Trader("Jessica", "Los Angeles");
        Transaction transaction = new Transaction(trader, 1000);
        demo.totalTest(1000, transaction.getAmount(), "Amount < 1000000");
    }

    void fraudRuleTwo() {
        Demo demo = new Demo();
        Trader trader = new Trader("Jessica", "Los Angeles");
        Transaction transaction = new Transaction(trader, 100000000);
        demo.totalTest(0, transaction.getAmount(), "Amount > 1000000");
    }
}
