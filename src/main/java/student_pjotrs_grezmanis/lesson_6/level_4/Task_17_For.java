package student_pjotrs_grezmanis.lesson_6.level_4;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
class Task_17_For {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }
}

