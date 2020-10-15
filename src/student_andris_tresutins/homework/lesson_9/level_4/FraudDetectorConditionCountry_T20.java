package student_andris_tresutins.homework.lesson_9.level_4;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "t? почему t? =) так и пишите Trader trader")
public class FraudDetectorConditionCountry_T20 {

    boolean deniedCountry(Trader t){

        String country = t.getCountry();
        return "Jamaica".equals(country);

    }
}
