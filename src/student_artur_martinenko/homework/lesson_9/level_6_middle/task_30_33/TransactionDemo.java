package student_artur_martinenko.homework.lesson_9.level_6_middle.task_30_33;

class TransactionDemo {
    public static void main(String[] args) {
        TransactionDemo victim = new TransactionDemo();
        victim.legalTraderTransactionTest();
        victim.transactionTooHugeTest();
        victim.illegalTraderTransactionTest();
        victim.illegalCityTransactionTest();
        victim.illegalCountryTransactionTest();
        victim.illegalCountryAndLimitTransactionTest1();
        victim.illegalCountryAndLimitTransactionTest2();
    }

    public void check(boolean expected, boolean actual, String fraudNameCaught, String testName) {
        if (expected == actual) {
            System.out.println("Test " + testName + " - PASSED");
            System.out.println("\t\tFraud caught -> " + fraudNameCaught);
        } else {
            System.out.println("Test " + testName + " - FAILED");
            System.out.println("\tExpected " + expected + " but passed " + actual);
        }
    }

    public void legalTraderTransactionTest() {
        Trader testTrader = new Trader("test", "riga", "latvia");
        Transaction testTransaction = new Transaction(testTrader, 100);
        FraudDetector fraudDetector = new FraudDetector();
        FraudDetectionResult fraudResult = fraudDetector.isFraud(testTransaction);
        boolean actual = fraudResult.getIfIsFraud();
        String fraudName = fraudResult.getRuleName();
        check(false, actual, fraudName, "legalTraderTransactionTest");
    }

    public void transactionTooHugeTest() {
        Trader testTrader = new Trader("test", "riga", "latvia");
        Transaction testTransaction = new Transaction(testTrader, 1000000);
        FraudDetector fraudDetector = new FraudDetector();
        FraudDetectionResult fraudResult = fraudDetector.isFraud(testTransaction);
        boolean actual = fraudResult.getIfIsFraud();
        String fraudName = fraudResult.getRuleName();
        check(true, actual, fraudName, "transactionTooHugeTest");
    }

    public void illegalTraderTransactionTest() {
        Trader pokemon = new Trader("Pokemon", "NY", "US");
        Transaction pokemonTransaction = new Transaction(pokemon, 100);
        FraudDetector fraudDetector = new FraudDetector();
        FraudDetectionResult fraudResult = fraudDetector.isFraud(pokemonTransaction);
        boolean actual = fraudResult.getIfIsFraud();
        String fraudName = fraudResult.getRuleName();
        check(true, actual, fraudName, "illegalTraderTransactionTest");
    }

    public void illegalCityTransactionTest() {
        Trader testTrader = new Trader("test", "Sydney", "Australia");
        Transaction testTransaction = new Transaction(testTrader, 100);
        FraudDetector fraudDetector = new FraudDetector();
        FraudDetectionResult fraudResult = fraudDetector.isFraud(testTransaction);
        boolean actual = fraudResult.getIfIsFraud();
        String fraudName = fraudResult.getRuleName();
        check(true, actual, fraudName, "illegalCityTransactionTest");
    }

    public void illegalCountryTransactionTest() {
        Trader testTrader = new Trader("test", "riga", "Jamaica");
        Transaction testTransaction = new Transaction(testTrader, 100);
        FraudDetector fraudDetector = new FraudDetector();
        FraudDetectionResult fraudResult = fraudDetector.isFraud(testTransaction);
        boolean actual = fraudResult.getIfIsFraud();
        String fraudName = fraudResult.getRuleName();
        check(true, actual, fraudName, "illegalCountryTransactionTest");
    }

    public void illegalCountryAndLimitTransactionTest1() {
        Trader testTrader = new Trader("test", "hamburg", "Germany");
        Transaction testTransaction = new Transaction(testTrader, 1001);
        FraudDetector fraudDetector = new FraudDetector();
        FraudDetectionResult fraudResult = fraudDetector.isFraud(testTransaction);
        boolean actual = fraudResult.getIfIsFraud();
        String fraudName = fraudResult.getRuleName();
        check(true, actual, fraudName, "illegalCountryAndLimitTransactionTest1");
    }

    public void illegalCountryAndLimitTransactionTest2() {
        Trader testTrader = new Trader("test", "hamburg", "Germany");
        Transaction testTransaction = new Transaction(testTrader, 100);
        FraudDetector fraudDetector = new FraudDetector();
        FraudDetectionResult fraudResult = fraudDetector.isFraud(testTransaction);
        boolean actual = fraudResult.getIfIsFraud();
        String fraudName = fraudResult.getRuleName();
        check(false, actual, fraudName, "illegalCountryAndLimitTransactionTest2");
    }


}
