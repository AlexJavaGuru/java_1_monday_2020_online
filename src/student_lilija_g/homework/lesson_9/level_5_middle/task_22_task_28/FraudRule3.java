package student_lilija_g.homework.lesson_9.level_5_middle.task_22_task_28;

class FraudRule3 extends FraudRule {
    public FraudRule3(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return "Sydney".equals(trader.getCity());
    }
}
