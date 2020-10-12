package student_lilija_g.homework.lesson_9.level_5_middle.task_29;

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
        FraudDetector fraudDetector = new FraudDetector();
        demo.totalTest(false, fraudDetector.isFraud(transaction), "Not Pokemon");
    }

    void fraudRule1() {
        Demo demo = new Demo();
        Trader trader = new Trader("Pokemon", "Los Angeles", "USA");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetector fraudDetector = new FraudDetector();
        demo.totalTest(true, fraudDetector.isFraud(transaction), "Pokemon");
    }

    void notFraudRule2() {
        Demo demo = new Demo();
        Trader trader = new Trader("Jessica", "Los Angeles", "USA");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetector fraudDetector = new FraudDetector();
        demo.totalTest(false, fraudDetector.isFraud(transaction), "Amount < 1000000");
    }

    void fraudRule2() {
        Demo demo = new Demo();
        Trader trader = new Trader("Jessica", "Los Angeles", "USA");
        Transaction transaction = new Transaction(trader, 100000000);
        FraudDetector fraudDetector = new FraudDetector();
        demo.totalTest(true, fraudDetector.isFraud(transaction), "Amount > 1000000");
    }

    void notFraudRule3() {
        Demo demo = new Demo();
        Trader trader = new Trader("Jessica", "Los Angeles", "USA");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetector fraudDetector = new FraudDetector();
        demo.totalTest(false, fraudDetector.isFraud(transaction), "Not Sydney");
    }

    void fraudRule3() {
        Demo demo = new Demo();
        Trader trader = new Trader("Jessica", "Sydney", "Australia");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetector fraudDetector = new FraudDetector();
        demo.totalTest(true, fraudDetector.isFraud(transaction), "Sydney");
    }

    void notFraudRule4() {
        Demo demo = new Demo();
        Trader trader = new Trader("Jessica", "Los Angeles", "USA");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetector fraudDetector = new FraudDetector();
        demo.totalTest(false, fraudDetector.isFraud(transaction), "Not Jamaica");
    }

    void fraudRule4() {
        Demo demo = new Demo();
        Trader trader = new Trader("Jessica", "Kingston", "Jamaica");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetector fraudDetector = new FraudDetector();
        demo.totalTest(true, fraudDetector.isFraud(transaction), "Jamaica");
    }

    void notFraudRule5() {
        Demo demo = new Demo();
        Trader trader = new Trader("Jessica", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 100);
        FraudDetector fraudDetector = new FraudDetector();
        demo.totalTest(false, fraudDetector.isFraud(transaction), "Germany, Amount < 1000");
    }

    void fraudRule5() {
        Demo demo = new Demo();
        Trader trader = new Trader("Jessica", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 10000);
        FraudDetector fraudDetector = new FraudDetector();
        demo.totalTest(true, fraudDetector.isFraud(transaction), "Germany, Amount > 1000");
    }
}
