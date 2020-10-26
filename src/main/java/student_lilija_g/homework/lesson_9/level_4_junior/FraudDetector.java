package student_lilija_g.homework.lesson_9.level_4_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class FraudDetector {

    boolean isFraud(Transaction transaction, int amount) {
        return isFraudRuleOne(transaction) ||
                isFraudRuleTwo(transaction, amount) ||
                isFraudRuleThree(transaction) ||
                isFraudRuleFour(transaction) ||
                isFraudRuleFive(transaction, amount);
    }

    boolean isFraudRuleOne(Transaction transaction) {                                        // Task_17
        Trader trader = transaction.getTrader();
        return "Pokemon".equals(trader.getFullName());
    }

    boolean isFraudRuleTwo(Transaction transaction, int amount) {
        return amount > 1000000;
    } // Task_18

    Boolean isFraudRuleThree(Transaction transaction) {                                      // Task_19
        Trader trader = transaction.getTrader();
        return "Sydney".equals(trader.getCity());
    }

    Boolean isFraudRuleFour(Transaction transaction) {                                       // Task_20
        Trader trader = transaction.getTrader();
        return "Jamaica".equals(trader.getCountry());
    }

    boolean isFraudRuleFive(Transaction transaction, int amount) {                           // Task_21
        Trader trader = transaction.getTrader();
        return "Germany".equals(trader.getCountry()) && amount > 1000;
    }
}



