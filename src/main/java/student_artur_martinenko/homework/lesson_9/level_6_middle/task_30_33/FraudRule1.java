package student_artur_martinenko.homework.lesson_9.level_6_middle.task_30_33;

class FraudRule1 extends FraudRule {
    private static final int MAX_FRAUD_LIMIT = 1000000;

    public FraudRule1() {
        super("Transaction limit");
    }

    @Override
    public boolean isFraud(Transaction transaction) {
        return transaction.getAmount() >= MAX_FRAUD_LIMIT;
    }
}
