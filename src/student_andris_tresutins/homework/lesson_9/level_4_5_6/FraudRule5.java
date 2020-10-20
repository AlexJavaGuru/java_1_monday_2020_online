package student_andris_tresutins.homework.lesson_9.level_4_5_6;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
 class FraudRule5 extends FraudRule {

    public FraudRule5(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction transaction){

        String country = transaction.getTrader().getCountry();
        int money = transaction.getAmount();

        return country == "Germany" && money > 1000;

    }
}
