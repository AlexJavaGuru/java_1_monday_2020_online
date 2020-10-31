package student_aleksejs_ivanovs.homework.lesson_9.level_4_5_6;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class FraudRule2 extends FraudRule{   // Task_25

    public FraudRule2(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return t.getAmount() == 1000000;
    }

}
