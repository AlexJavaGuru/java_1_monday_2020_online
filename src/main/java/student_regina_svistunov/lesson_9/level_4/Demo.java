package student_regina_svistunov.lesson_9.level_4;

public class Demo {


    public static void main(String[] args) {

        Demo test = new Demo();
        test.pokemonTest();
        test.fraudRuleTwoTest();
        test.fraudRuleThreeTest();
        test.fraudRuleFourTest();
        test.fraudRuleFiveTest();

    }

    void mainTest(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " test is PASSED");
        } else {
            System.out.println(testName + " test is FAILED");
        }
    }

    void pokemonTest() {
        Demo demo = new Demo();
        Trader trader = new Trader("Pokemon", "", "");
        Transaction transaction = new Transaction(trader, 0);
        demo.mainTest(0, transaction.getAmount(), "Pokemon");

    }

    void fraudRuleTwoTest() {
        Demo demo = new Demo();
        Trader trader = new Trader("Pokemon", "", "");
        Transaction transaction = new Transaction(trader, 1000000);
        demo.mainTest(1000000, transaction.getAmount(), "Fraud rule 2: Transaction over 1000000");
    }

    void fraudRuleThreeTest() {
        Demo demo = new Demo();
        Trader trader = new Trader("Pokemon", "Sidney","");
        Transaction transaction = new Transaction(trader, 1000000);
        demo.mainTest(1000000, transaction.getAmount(), "Fraud rule 3: Sidney");
    }

    void fraudRuleFourTest() {
        Demo demo = new Demo();
        Trader trader = new Trader("Pokemon", "Sidney", "Jamaica");
        Transaction transaction = new Transaction(trader, 1000000);
        demo.mainTest(1000000, transaction.getAmount(), "Fraud rule 4: Jamaica");
    }

    void fraudRuleFiveTest() {
        Demo demo = new Demo();
        Trader trader = new Trader("Pokemon", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 1000);
        demo.mainTest(1000, transaction.getAmount(), "Fraud rule 5: Germany and transaction under 1000");

    }


}
