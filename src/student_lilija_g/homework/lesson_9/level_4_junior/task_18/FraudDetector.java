package student_lilija_g.homework.lesson_9.level_4_junior.task_18;

class FraudDetector {

    boolean isFraud(Transaction transaction,int amount) {
        return isFraudRuleOne(transaction)||isFraudRuleTwo(transaction,amount);
    }

    boolean isFraudRuleOne(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return "Pokemon".equals(trader.getFullName());
    }
    boolean isFraudRuleTwo(Transaction transaction,int amount) {
        return amount>1000000;
    }
}



