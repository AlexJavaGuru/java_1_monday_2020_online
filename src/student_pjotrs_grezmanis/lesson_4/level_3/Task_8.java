package student_pjotrs_grezmanis.lesson_4.level_3;
import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = false)
@CodeReviewComment(comment = "плохое название переменных. Исправить формат.")
class Task_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number One");
        int a = scanner.nextInt();
        System.out.println("Enter number Two");
        int b = scanner.nextInt();
        System.out.println("Enter number Three");
        int c = scanner.nextInt();

        if (a == b && b == c) {

            System.out.println("all three numbers are equal");
        }
        else if (a != b && b != c && c != a) {

            System.out.println("all three numbers are differen");
        }

        else{
            System.out.println("Neither all are equal or different");

                }
            }
 }

