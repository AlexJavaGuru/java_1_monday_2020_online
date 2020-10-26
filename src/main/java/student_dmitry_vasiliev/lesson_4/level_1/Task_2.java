package student_dmitry_vasiliev.lesson_4.level_1;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Можно было использовать конструкцию if else if. Ведь нет смысла проверять число, если первая проверка дала true.")
class Task_2 {
    private int num;
    public static void main(String[] args) {

        System.out.println("Enter please integer number for check...");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if (num>0)
            System.out.println(num + " is a positive number.");
        if (num<0)
            System.out.println(num + " is a negative number.");
        else
            System.out.println("Entered number is 0.");
    }
}