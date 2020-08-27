package student_lilija_g.homework.lesson_4.level_x.super_task_1;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Это не тесты. Это просто вывод на консоль")
public class FizzBuzzTest {

    public static void main(String[] args) {
        FizzBuzz myFizzBuzz = new FizzBuzz();

        System.out.printf("\n  3: " + myFizzBuzz.detect(3));
        System.out.printf("\n  5: " + myFizzBuzz.detect(5));
        System.out.printf("\n 15: " + myFizzBuzz.detect(15));
        System.out.printf("\n 17: " + myFizzBuzz.detect(17));
    }
}
