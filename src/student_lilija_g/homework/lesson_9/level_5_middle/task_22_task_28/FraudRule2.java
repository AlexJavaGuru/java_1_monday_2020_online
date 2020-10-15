package student_lilija_g.homework.lesson_9.level_5_middle.task_22_task_28;

class FraudRule2 extends FraudRule {

    private static final int MAX_LIMIT = 1000000;

    public FraudRule2(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction transaction) {
        return transaction.getAmount() >= MAX_LIMIT;
    }
}
