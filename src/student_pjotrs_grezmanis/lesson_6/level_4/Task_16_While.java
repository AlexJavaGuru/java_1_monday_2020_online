package student_pjotrs_grezmanis.lesson_6.level_4;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
class Task_16_While {
    public static void main(String[] args) {
        int number = 3;
        int result = 1;
        int power = 1;
        while (true) {
            result = result * number;
            System.out.println(number + " in power " + power + "=" + result);
            power++;
            if (power > 10);
            break;
        }
    }
}

