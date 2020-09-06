package student_dmitry_vasiliev.lesson_4.level_2;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Такая же проблема. Почему не используете if else if? забываете про пробелы между знаками <> ")
public class Task_5 {
    private int num;
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter please first integer number...");
        int num1 = in.nextInt();

        System.out.println("Enter please second integer number...");
        int num2 = in.nextInt();

        int result = num1 - num2;
        if (result>0)
            System.out.println(num1 + " is greater that " + num2 + ".");
        if (result<0)
            System.out.println(num2 + " is greater that " + num1 + ".");
        else
            System.out.println(num2 + " is equal " + num1 + ".");
    }
}
