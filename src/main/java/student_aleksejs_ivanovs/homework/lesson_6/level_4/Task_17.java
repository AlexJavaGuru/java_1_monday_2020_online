package student_aleksejs_ivanovs.homework.lesson_6.level_4;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
class Task_17 {

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println(i);
            if (i == 5) {
                break;
            }
        }

        int i = 0;
        while (i < 20) {
            System.out.println(i);
            if (i == 5) {
                break;
            }
            i++;
        }
    }

}
