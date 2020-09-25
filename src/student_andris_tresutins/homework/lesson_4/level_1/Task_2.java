package student_andris_tresutins.homework.lesson_4.level_1;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Программа не соответствует заданию. она ничего не запрашивает у пользователя")
 class Task_2 {
    public static void main(String[] args) {
        int number = 0;

        if( number > 0 ){

            System.out.println(number + " - number is positive");

        } else if ( number == 0) {

            System.out.println(number + " - number is not negative or positive");

        }
        else {
            System.out.println(number + " - number is negative");
        }
    }

}
