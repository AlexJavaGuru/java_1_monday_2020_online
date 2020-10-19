package student_andris_tresutins.homework.lesson_9.level_4_5;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Test {

    public static void main(String[] args) {

        Test test = new Test();

        test.fraudTest();
        test.isNotFraudTest();
        test.tooMuchMoneyTest();
        test.notTooMuchMoneyTest();
        test.sydneyTest();
        test.denyJamaicaTest();
        test.denyGermanyTest();
        test.acceptGermanyTest();

    }

    //Task 21
    public void acceptGermanyTest() {

        FraudRule5 detect = new FraudRule5("test");
        Trader trader = new Trader("Jimmy", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 999);

        boolean actual = detect.isFraud(transaction);
        boolean expected = false;

        check(expected, actual, "Accepts Germany Below 1000 Test");

    }

    public void denyGermanyTest() {

        FraudRule5 detect = new FraudRule5("test");
        Trader trader = new Trader("Jimmy", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 1001);

        boolean actual = detect.isFraud(transaction);
        boolean expected = true;

        check(expected, actual, "Denies Germany above 1000 Test");

    }

    // Task 20
    public void denyJamaicaTest() {

        FraudRule4 detect = new FraudRule4("test");
        Trader trader = new Trader("Rodney", "Kingston", "Jamaica");
        Transaction transaction = new Transaction(trader, 999999);

        boolean actual = detect.isFraud(transaction);
        boolean expected = true;

        check(expected, actual, "Denies Jamaica Test");

    }

    // Task 19
    public void sydneyTest() {

        FraudRule3 detect = new FraudRule3("test");
        Trader trader = new Trader("Rodney", "Sydney", "Australia");
        Transaction transaction = new Transaction(trader, 999999);

        boolean actual = detect.isFraud(transaction);
        boolean expected = true;

        check(expected, actual, "Denies Sydney Test");

    }

    // Task 18
    public void notTooMuchMoneyTest() {

        FraudRule2 detect = new FraudRule2("test");
        Trader trader = new Trader("Jeremy", "Capetown", "South Africa");
        Transaction transaction = new Transaction(trader, 999999);

        boolean actual = detect.isFraud(transaction);
        boolean expected = false;

        check(expected, actual, "Enough Money Test");

    }

    public void tooMuchMoneyTest() {

        FraudRule2 detect = new FraudRule2("test");
        Trader trader = new Trader("Jessica", "London", "england");
        Transaction transaction = new Transaction(trader, 1000001);

        boolean actual = detect.isFraud(transaction);
        boolean expected = true;

        check(expected, actual, "Too Much Money Test");

    }

    // Task 17
    public void isNotFraudTest() {

        FraudRule1 detect = new FraudRule1("test");
        Trader trader = new Trader("aRegularUser", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 2000);

        boolean actual = detect.isFraud(transaction);
        boolean expected = false;

        check(expected, actual, "Isn't Fraud Test");

    }

    public void fraudTest() {

        FraudRule1 detect = new FraudRule1("test");
        Trader trader = new Trader("Pokemon", "englandIsMyCity", "fakeInfo");
        Transaction transaction = new Transaction(trader, 2000);

        boolean actual = detect.isFraud(transaction);
        boolean expected = true;

        check(expected, actual, "Fraud Test");

    }

    public void check(boolean expectedResult, boolean actual, String testName) {
        if (expectedResult == actual) {
            System.out.println(testName + " Test Has Passed");
        } else {
            System.out.println(testName + " Test Has Failed");
            System.out.println("The result was : " + actual);
            System.out.println("expected : " + expectedResult);
        }

    }
}
