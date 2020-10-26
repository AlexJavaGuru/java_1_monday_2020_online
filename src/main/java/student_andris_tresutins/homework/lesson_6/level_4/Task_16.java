package student_andris_tresutins.homework.lesson_6.level_4;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

//endless for loop with a "break" in it
@CodeReview(approved = true)
 class Task_16 {
    public static void main(String[] args) {

        for (int i = 0; i > -1; i++) {
            if (i<5000){
                System.out.println(i);
            }else{
                break;
            }
        }
    }
}
