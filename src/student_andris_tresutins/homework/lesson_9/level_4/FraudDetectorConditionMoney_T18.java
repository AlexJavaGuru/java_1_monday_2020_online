package student_andris_tresutins.homework.lesson_9.level_4;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "t? почему t? =) Может это t -> Trader? Шучу. пишите полными словами Transaction transaction")
public class FraudDetectorConditionMoney_T18 {

    boolean moneyAmount(Transaction t){

        int amount = t.getAmount();

        return amount > 1000000;
    }
}
