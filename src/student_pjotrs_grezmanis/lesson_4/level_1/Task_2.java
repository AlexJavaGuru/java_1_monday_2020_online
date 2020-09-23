package student_pjotrs_grezmanis.lesson_4.level_1;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Почему не используете if else if? было бы меньше кода. Зачем проверять на все три условия каждый раз? Если можно не проверять другие, если одно истина.")
class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter wholeNumber");
        int wholeNumber = scanner.nextInt();

        if (wholeNumber < 0) {
            System.out.println("wholeNumber is negative");
        } else if (wholeNumber == 0) {
            System.out.println("wholeNumber is equal to zero ");
        } else {
            System.out.println("wholeNumber is pozitive");
        }


    }


}
