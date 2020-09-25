package student_andris_tresutins.homework.lesson_4.level_1;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = false)
@CodeReviewComment(comment = "для этой задачи на много удобнее было бы использовать switch case")
class Task_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number of the day of the week");
        int number = input.nextInt();

        if (number == 1) {
            System.out.println(number + " - Monday");
        } else if (number == 2) {
            System.out.println(number + " - Tuesday");
        } else if (number == 3) {
            System.out.println(number + " - Wednesday");
        } else if (number == 4) {
            System.out.println(number + " - Thursday");
        } else if (number == 5) {
            System.out.println(number + " - Friday");
        } else if (number == 6) {
            System.out.println(number + " - Saturday");
        } else if (number == 7) {
            System.out.println(number + " - Sunday");
        } else {
            System.out.println("invalid number");
        }
    }
}
