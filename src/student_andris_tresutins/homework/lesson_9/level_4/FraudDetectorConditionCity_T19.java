package student_andris_tresutins.homework.lesson_9.level_4;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "t? почему t? =) так и пишите Trader trader")
public class FraudDetectorConditionCity_T19 {

    boolean deniedCity(Trader t){

        String city = t.getCity();
        return "Sydney".equals(city);

    }
}
