package student_pjotrs_grezmanis.lesson_5.level_2;

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] number = new int[3];
        number[0] = 0;
        number[1] = 1;
        number[2] = 2;

        System.out.println("Please enter number1");
        number[0] = input.nextInt();

        System.out.println("Please enter number2");
        number[1] = input.nextInt();

        System.out.println("Please enter number3");
        number[2] = input.nextInt();

        System.out.println(number[0]);
        System.out.println(number[1]);
        System.out.println(number[2]);




    }
}
