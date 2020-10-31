package student_aleksejs_ivanovs.homework.lesson_9.level_4_5_6;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class FraudRule3 extends FraudRule{   // Task_26

    public FraudRule3(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return t.getTrader().getCity().equals("Sidney");
    }

}
