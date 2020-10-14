package student_lilija_g.homework.lesson_9.level_6_middle.task_30_task_33;

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
            System.out.println(testName + " test = OK\n");
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
        FraudDetectionResult fraudDetectionResult = fraudDetector.isFraud(transaction);
        demo.totalTest(false, fraudDetectionResult.isFraud(), fraudDetectionResult.getRuleName());
    }

    void fraudRule1() {
        Demo demo = new Demo();
        Trader trader = new Trader("Pokemon", "Los Angeles", "USA");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetector fraudDetector = new FraudDetector();
        FraudDetectionResult fraudDetectionResult = fraudDetector.isFraud(transaction);
        demo.totalTest(true, fraudDetectionResult.isFraud(), fraudDetectionResult.getRuleName());
    }

    void notFraudRule2() {
        Demo demo = new Demo();
        Trader trader = new Trader("Jessica", "Los Angeles", "USA");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetector fraudDetector = new FraudDetector();
        FraudDetectionResult fraudDetectionResult = fraudDetector.isFraud(transaction);
        demo.totalTest(false, fraudDetectionResult.isFraud(), fraudDetectionResult.getRuleName());
    }

    void fraudRule2() {
        Demo demo = new Demo();
        Trader trader = new Trader("Jessica", "Los Angeles", "USA");
        Transaction transaction = new Transaction(trader, 100000000);
        FraudDetector fraudDetector = new FraudDetector();
        FraudDetectionResult fraudDetectionResult = fraudDetector.isFraud(transaction);
        demo.totalTest(true, fraudDetectionResult.isFraud(), fraudDetectionResult.getRuleName());
    }

    void notFraudRule3() {
        Demo demo = new Demo();
        Trader trader = new Trader("Jessica", "Los Angeles", "USA");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetector fraudDetector = new FraudDetector();
        FraudDetectionResult fraudDetectionResult = fraudDetector.isFraud(transaction);
        demo.totalTest(false, fraudDetectionResult.isFraud(), fraudDetectionResult.getRuleName());
    }

    void fraudRule3() {
        Demo demo = new Demo();
        Trader trader = new Trader("Jessica", "Sydney", "Australia");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetector fraudDetector = new FraudDetector();
        FraudDetectionResult fraudDetectionResult = fraudDetector.isFraud(transaction);
        demo.totalTest(true, fraudDetectionResult.isFraud(), fraudDetectionResult.getRuleName());
    }

    void notFraudRule4() {
        Demo demo = new Demo();
        Trader trader = new Trader("Jessica", "Los Angeles", "USA");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetector fraudDetector = new FraudDetector();
        FraudDetectionResult fraudDetectionResult = fraudDetector.isFraud(transaction);
        demo.totalTest(false, fraudDetectionResult.isFraud(), fraudDetectionResult.getRuleName());
    }

    void fraudRule4() {
        Demo demo = new Demo();
        Trader trader = new Trader("Jessica", "Kingston", "Jamaica");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetector fraudDetector = new FraudDetector();
        FraudDetectionResult fraudDetectionResult = fraudDetector.isFraud(transaction);
        demo.totalTest(true, fraudDetectionResult.isFraud(), fraudDetectionResult.getRuleName());
    }

    void notFraudRule5() {
        Demo demo = new Demo();
        Trader trader = new Trader("Jessica", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 100);
        FraudDetector fraudDetector = new FraudDetector();
        FraudDetectionResult fraudDetectionResult = fraudDetector.isFraud(transaction);
        demo.totalTest(false, fraudDetectionResult.isFraud(), fraudDetectionResult.getRuleName());
    }

    void fraudRule5() {
        Demo demo = new Demo();
        Trader trader = new Trader("Jessica", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 10000);
        FraudDetector fraudDetector = new FraudDetector();
        FraudDetectionResult fraudDetectionResult = fraudDetector.isFraud(transaction);
        demo.totalTest(true, fraudDetectionResult.isFraud(), fraudDetectionResult.getRuleName());
    }
}
