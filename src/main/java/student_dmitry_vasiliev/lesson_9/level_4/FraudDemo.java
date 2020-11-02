package student_dmitry_vasiliev.lesson_9.level_4;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class FraudDemo {

    public static void main(String[] args) {

        FraudDemo test = new FraudDemo();

        test.Rule1Test();
        test.Rule2Test();
        test.Rule3Test();
        test.Rule4Test();
        test.Rule5Test();
    }
    void Rule1Test (){
        String testName = "Is Pokemon";
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Pokemon","Berlin","Germany");
        Transaction transaction = new Transaction(trader, 100);
        printTestResult(fraudDetector.isFraud(transaction),testName);
    }
    void Rule2Test (){
        String testName = "Is > 1000000";
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Poke","Tallinn","Estonia");
        Transaction transaction = new Transaction(trader, 1000001);
        printTestResult(fraudDetector.isFraud(transaction),testName);
    }
    void Rule3Test (){
        String testName = "Is Sidney";
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Poke","Sidney","Australia");
        Transaction transaction = new Transaction(trader, 1000000);
        printTestResult(fraudDetector.isFraud(transaction),testName);
    }
    void Rule4Test (){
        String testName = "Is Jamaica";
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Poke","Portmore","Jamaica");
        Transaction transaction = new Transaction(trader, 1000000);
        printTestResult(fraudDetector.isFraud(transaction),testName);
    }
    void Rule5Test (){
        String testName = "Germany1000";
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Poke","Frankfurt","Germany");
        Transaction transaction = new Transaction(trader, 1001);
        printTestResult(fraudDetector.isFraud(transaction),testName);
    }

    private void printTestResult(boolean check, String testName) {
        if (check) {
            System.out.println("Test " + testName + " has passed!");
        } else {
            System.out.println("Test " + testName + " failed!");
        }
    }
}
