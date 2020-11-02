package student_andris_tresutins.homework.lesson_9.level_4_5_6;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "t? почему t? =) Может это t -> Trader? Шучу. пишите полными словами Transaction transaction")
 class FraudRule2 extends FraudRule {


    public FraudRule2(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction transaction){

        int amount = transaction.getAmount();

        return amount > 1000000;
    }
}
