package student_andris_tresutins.homework.lesson_7.level_6;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Fix format. raiseNumbertopower - not in camelCase" )
class Task_10 {
//
//why?
//
//
        public double raiseNumbertopower(double number, double power){

        double result = 1;

        if (power < 0) {
            number = 1.0 / number;
            power = -power;
        }

        for (int i = 0; i < power; i++) {
            result = result * number;
        }

        return result;
    }
}
