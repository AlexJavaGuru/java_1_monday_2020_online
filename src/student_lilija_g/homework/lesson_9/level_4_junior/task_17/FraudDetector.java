package student_lilija_g.homework.lesson_9.level_4_junior.task_17;

class FraudDetector {

    boolean isFraud(Transaction transaction) {
        return isFraudRuleOne(transaction);
    }

    boolean isFraudRuleOne(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return "Pokemon".equals(trader.getFullName());
    }
}



