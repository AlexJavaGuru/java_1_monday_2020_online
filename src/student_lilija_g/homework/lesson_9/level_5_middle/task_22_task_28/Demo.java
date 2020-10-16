package student_lilija_g.homework.lesson_9.level_5_middle.task_22_task_28;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Demo {

    public static void main(String[] args) {

        Demo demo = new Demo();

        demo.notFraudRule1();
        demo.fraudRule1();

        demo.notFraudRule2();
        demo.fraudRule2();

        demo.notFraudRule3();
        demo.fraudRule3();

        demo.notFraudRule4();
        demo.fraudRule4();

        demo.notFraudRule5();
        demo.fraudRule5();

    }

    void totalTest(Boolean expectedValue, Boolean actualValue, String testName) {

        if (expectedValue == actualValue) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
            System.out.println("Expected Value = " + expectedValue);
            System.out.println("Actual Value = " + actualValue);
        }
    }

    void notFraudRule1() {
        Demo demo = new Demo();
        Trader trader = new Trader("Jessica", "Los Angeles", "USA");
        Transaction transaction = new Transaction(trader, 1000);
        FraudRule1 fraudRule1 = new FraudRule1("Pokemon");
        demo.totalTest(false, fraudRule1.isFraud(transaction), "Not Pokemon");
    }

    void fraudRule1() {
        Demo demo = new Demo();
        Trader trader = new Trader("Pokemon", "Los Angeles", "USA");
        Transaction transaction = new Transaction(trader, 1000);
        FraudRule1 fraudRule1 = new FraudRule1("Pokemon");
        demo.totalTest(true, fraudRule1.isFraud(transaction), "Pokemon");
    }

    void notFraudRule2() {
        Demo demo = new Demo();
        Trader trader = new Trader("Jessica", "Los Angeles", "USA");
        Transaction transaction = new Transaction(trader, 1000);
        FraudRule2 fraudRule2 = new FraudRule2("Amount < 1000000");
        demo.totalTest(false, fraudRule2.isFraud(transaction), "Amount < 1000000");
    }

    void fraudRule2() {
        Demo demo = new Demo();
        Trader trader = new Trader("Jessica", "Los Angeles", "USA");
        Transaction transaction = new Transaction(trader, 100000000);
        FraudRule2 fraudRule2 = new FraudRule2("Amount < 1000000");
        demo.totalTest(true, fraudRule2.isFraud(transaction), "Amount > 1000000");
    }

    void notFraudRule3() {
        Demo demo = new Demo();
        Trader trader = new Trader("Jessica", "Los Angeles", "USA");
        Transaction transaction = new Transaction(trader, 1000);
        FraudRule3 fraudRule3 = new FraudRule3("Sydney");
        demo.totalTest(false, fraudRule3.isFraud(transaction), "Not Sydney");
    }

    void fraudRule3() {
        Demo demo = new Demo();
        Trader trader = new Trader("Pokemon", "Sydney", "USA");
        Transaction transaction = new Transaction(trader, 1000);
        FraudRule3 fraudRule3 = new FraudRule3("Sydney");
        demo.totalTest(true, fraudRule3.isFraud(transaction), "Sydney");
    }

    void notFraudRule4() {
        Demo demo = new Demo();
        Trader trader = new Trader("Jessica", "Los Angeles", "USA");
        Transaction transaction = new Transaction(trader, 1000);
        FraudRule4 fraudRule4 = new FraudRule4("Jamaica");
        demo.totalTest(false, fraudRule4.isFraud(transaction), "Not Jamaica");
    }

    void fraudRule4() {
        Demo demo = new Demo();
        Trader trader = new Trader("Jessica", "Kingston", "Jamaica");
        Transaction transaction = new Transaction(trader, 1000);
        FraudRule4 fraudRule4 = new FraudRule4("Jamaica");
        demo.totalTest(true, fraudRule4.isFraud(transaction), "Jamaica");
    }

    void notFraudRule5() {
        Demo demo = new Demo();
        Trader trader = new Trader("Jessica", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 100);
        FraudRule5 fraudRule5 = new FraudRule5("Germany, Amount < 1000");
        demo.totalTest(false, fraudRule5.isFraud(transaction), "Germany, Amount < 1000");
    }

    void fraudRule5() {
        Demo demo = new Demo();
        Trader trader = new Trader("Jessica", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 10000);
        FraudRule5 fraudRule5 = new FraudRule5("Germany, Amount < 1000");
        demo.totalTest(true, fraudRule5.isFraud(transaction), "Germany, Amount > 1000");
    }
}
