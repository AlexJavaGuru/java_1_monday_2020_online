package student_dmitry_vasiliev.lesson_2.level_1;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Исправил за вас")
public class Divide {
    public static void main(String[] args) {
        int a = 50;
        int b = 3;
        int c = a / b;
        System.out.println(c);
    }
}
