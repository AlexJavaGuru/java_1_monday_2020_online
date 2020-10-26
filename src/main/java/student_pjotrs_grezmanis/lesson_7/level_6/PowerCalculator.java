package student_pjotrs_grezmanis.lesson_7.level_6;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Зачем метод main?")
class PowerCalculator {
    public static void main(String[] args) {
    }
    public int power(int number, int power) {
        int result = 1 ;
        for (int i = 1; i <= power; i++) {
            result = result * number;
        }
        return result;
    }
}
