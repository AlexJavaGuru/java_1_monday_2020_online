package student_artur_martinenko.homework.lesson_9.level_4_junior.task_20;

import teacher.annotations.CodeReview;

import java.util.ArrayList;

@CodeReview(approved = true)
class TransactionDemo {
    public static void main(String[] args) {
        TransactionDemo victim = new TransactionDemo();
        victim.legalTraderTransactionTest();
        victim.illegalTraderTransactionTest();
        victim.fraudTradersArrayContainsPokemonTest();
        victim.transactionTooHugeTest();
        victim.illegalCityTransactionTest();
        victim.illegalCountryTransactionTest();
    }

    public void check(boolean expected, boolean actual, String testName) {
        if (expected == actual) {
            System.out.println("Test " + testName + " - PASSED");
        } else {
            System.out.println("Test " + testName + " - FAILED");
            System.out.println("\tExpected " + expected + " but passed " + actual);
        }
    }

    public void legalTraderTransactionTest() {
        Trader testTrader = new Trader("test", "riga", "latvia");
        Transaction testTransaction = new Transaction(testTrader, 100);
        boolean actual = testTransaction.getAmount() == 100;
        check(true, actual, "legalTraderTransactionTest");
    }

    public void illegalTraderTransactionTest() {
        Trader pokemon = new Trader("Pokemon", "NY", "US");
        Transaction pokemonTransaction = new Transaction(pokemon, 100);
        boolean actual = pokemonTransaction.getAmount() == 0;
        check(true, actual, "illegalTraderTransactionTest");
    }

    public void fraudTradersArrayContainsPokemonTest() {
        ArrayList<String> fraudTraders = new ArrayList<>(FraudDetector.getBannedNames());
        Trader pokemon = new Trader("Pokemon", "NY", "US");
        boolean actual = fraudTraders.contains(pokemon.getFullName().toLowerCase());
        check(true, actual, "fraudTradersArrayContainsPokemonTest");
    }

    public void transactionTooHugeTest() {
        Trader testTrader = new Trader("test", "riga", "latvia");
        Transaction testTransaction = new Transaction(testTrader, 1000000);
        boolean actual = testTransaction.getAmount() == 0;
        check(true, actual, "transactionTooHugeTest");
    }

    public void illegalCityTransactionTest() {
        Trader testTrader = new Trader("test", "Sydney", "Australia");
        Transaction testTransaction = new Transaction(testTrader, 100);
        boolean actual = testTransaction.getAmount() == 0;
        check(true, actual, "illegalCityTransactionTest");
    }

    public void illegalCountryTransactionTest() {
        Trader testTrader = new Trader("test", "riga", "Jamaica");
        Transaction testTransaction = new Transaction(testTrader, 100);
        boolean actual = testTransaction.getAmount() == 0;
        check(true, actual, "illegalCountryTransactionTest");
    }


}
