package student_andris_tresutins.homework.lesson_9.level_4_5;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "t? почему t? =) так и пишите Trader trader")
 class FraudRule4 extends FraudRule {

    public FraudRule4(String ruleName) {
        super(ruleName);
    }


    public boolean isFraud(Transaction transaction){

        String country = transaction.getTrader().getCountry();
        return "Jamaica".equals(country);

    }
}
