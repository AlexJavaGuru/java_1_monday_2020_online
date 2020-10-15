package student_lilija_g.homework.lesson_9.level_6_middle.task_30_task_33;

class FraudRule4 extends FraudRule {
    public FraudRule4(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return "Jamaica".equals(trader.getCountry());
    }
}
