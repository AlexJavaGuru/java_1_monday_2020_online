package student_aleksejs_ivanovs.homework.lesson_9.level_4_5_6;

class FraudDetectorTest {

    public static void main(String[] args) {
        FraudDetectorTest test = new FraudDetectorTest();
        test.fraudDetectorTest();
        test.fraudDetectorTestTwo();
        test.fraudDetectorTestThree();
        test.fraudDetectorTestFour();
        test.fraudDetectorTestFive();
        test.fraudDetectorTestSix();
    }

    public void fraudDetectorTest() {
        Trader trader = new Trader("Pokemon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 100);
        FraudDetector fraudDetector = new FraudDetector();
        FraudDetectionResult fraudDetectionResult = fraudDetector.isFraud(transaction);

        boolean actualResult = fraudDetectionResult.getFraud();
        String ruleName = fraudDetectionResult.getRuleName();

        check(true, actualResult, "fraudDetectorTest", ruleName);
    }

    public void fraudDetectorTestTwo() {
        Trader trader = new Trader("Ghost", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000000);
        FraudDetector fraudDetector = new FraudDetector();
        FraudDetectionResult fraudDetectionResult = fraudDetector.isFraud(transaction);

        boolean actualResult = fraudDetectionResult.getFraud();
        String ruleName = fraudDetectionResult.getRuleName();

        check(true, actualResult, "fraudDetectorTestTwo", ruleName);
    }

    public void fraudDetectorTestThree() {
        Trader trader = new Trader("Ghost", "Sidney", "Latvia");
        Transaction transaction = new Transaction(trader, 100);
        FraudDetector fraudDetector = new FraudDetector();
        FraudDetectionResult fraudDetectionResult = fraudDetector.isFraud(transaction);

        boolean actualResult = fraudDetectionResult.getFraud();
        String ruleName = fraudDetectionResult.getRuleName();

        check(true, actualResult, "fraudDetectorTestThree", ruleName);
    }

    public void fraudDetectorTestFour() {
        Trader trader = new Trader("Ghost", "Riga", "Jamaica");
        Transaction transaction = new Transaction(trader, 100);
        FraudDetector fraudDetector = new FraudDetector();
        FraudDetectionResult fraudDetectionResult = fraudDetector.isFraud(transaction);

        boolean actualResult = fraudDetectionResult.getFraud();
        String ruleName = fraudDetectionResult.getRuleName();

        check(true, actualResult, "fraudDetectorTestFour", ruleName);
    }

    public void fraudDetectorTestFive() {
        Trader trader = new Trader("Ghost", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetector fraudDetector = new FraudDetector();
        FraudDetectionResult fraudDetectionResult = fraudDetector.isFraud(transaction);

        boolean actualResult = fraudDetectionResult.getFraud();
        String ruleName = fraudDetectionResult.getRuleName();

        check(true, actualResult, "fraudDetectorTestFive", ruleName);
    }

    public void fraudDetectorTestSix() {
        Trader trader = new Trader("Ghost", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 100);
        FraudDetector fraudDetector = new FraudDetector();
        FraudDetectionResult fraudDetectionResult = fraudDetector.isFraud(transaction);

        boolean actualResult = fraudDetectionResult.getFraud();
        String ruleName = fraudDetectionResult.getRuleName();

        check(false, actualResult, "fraudDetectorTestSix", ruleName);
    }

    private void check(boolean expectedResult, boolean actualResult, String testName, String ruleName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " (RuleName is : " + ruleName + ")" + " has passed");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected result was : " + expectedResult + " but actual result was : " + actualResult);
        }
    }

}
