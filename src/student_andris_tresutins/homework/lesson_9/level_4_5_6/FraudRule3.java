package student_andris_tresutins.homework.lesson_9.level_4_5_6;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "t? почему t? =) так и пишите Trader trader")
 class FraudRule3 extends FraudRule {


    public FraudRule3(String ruleName) {
        super(ruleName);
    }


    public boolean isFraud(Transaction transaction){

        String city = transaction.getTrader().getCity();
        return "Sydney".equals(city);

    }
}
