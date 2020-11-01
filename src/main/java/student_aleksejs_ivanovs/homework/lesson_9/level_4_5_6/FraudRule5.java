package student_aleksejs_ivanovs.homework.lesson_9.level_4_5_6;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class FraudRule5 extends FraudRule{   // Task_28

    public FraudRule5(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return t.getTrader().getCountry().equals("Germany") && t.getAmount() == 1000;
    }

}
