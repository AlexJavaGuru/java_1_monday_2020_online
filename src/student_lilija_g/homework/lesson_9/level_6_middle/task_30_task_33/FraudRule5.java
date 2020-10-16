package student_lilija_g.homework.lesson_9.level_6_middle.task_30_task_33;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class FraudRule5 extends FraudRule {
    public FraudRule5(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return "Germany".equals(trader.getCountry()) && transaction.getAmount() > 1000;
    }
}
