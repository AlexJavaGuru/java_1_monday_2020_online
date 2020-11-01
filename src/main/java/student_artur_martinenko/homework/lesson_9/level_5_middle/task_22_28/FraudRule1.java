package student_artur_martinenko.homework.lesson_9.level_5_middle.task_22_28;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
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
