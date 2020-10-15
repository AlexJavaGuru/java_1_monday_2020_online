package student_lilija_g.homework.lesson_9.level_4_junior.task_21;

class FraudDetector {

    boolean isFraud(Transaction transaction, int amount) {
        return isFraudRuleOne(transaction) ||
                isFraudRuleTwo(transaction, amount) ||
                isFraudRuleThree(transaction) ||
                isFraudRuleFour(transaction) ||
                isFraudRuleFive(transaction, amount);
    }

    boolean isFraudRuleOne(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return "Pokemon".equals(trader.getFullName());
    }

    boolean isFraudRuleTwo(Transaction transaction, int amount) {
        return amount > 1000000;
    }

    Boolean isFraudRuleThree(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return "Sydney".equals(trader.getCity());
    }

    Boolean isFraudRuleFour(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return "Jamaica".equals(trader.getCountry());
    }

    boolean isFraudRuleFive(Transaction transaction, int amount) {
        Trader trader = transaction.getTrader();
        return "Germany".equals(trader.getCountry()) && amount > 1000;
    }
}



