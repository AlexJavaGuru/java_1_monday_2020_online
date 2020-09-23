package student_pjotrs_grezmanis.lesson_4.level_1;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Почему не используете if else? было бы меньше кода. Зачем проверять на оба условия каждый раз? Если можно не проверять второе, если первое истина.")
class Task_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter whole number please");
        int wholeNumber = scanner.nextInt();

        if (wholeNumber < 0) {
            System.out.println("wholeNumber is negative");
        } else {
            System.out.println("wholeNumber is pozitive");
        }
    }


}

