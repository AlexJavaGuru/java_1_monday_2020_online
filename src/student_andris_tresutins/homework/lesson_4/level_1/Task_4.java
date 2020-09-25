package student_andris_tresutins.homework.lesson_4.level_1;

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class Task_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println( "enter number");
        int num = input.nextInt();
        double num2 = num % 2;

        if (num2 == 0) {
            System.out.println("even");

        } else {
            System.out.println("not even");

        }
    }
}
