package student_lilija_g.homework.lesson_9.level_6_middle.task_30_task_33;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
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
