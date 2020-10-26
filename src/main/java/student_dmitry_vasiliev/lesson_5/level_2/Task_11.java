package student_dmitry_vasiliev.lesson_5.level_2;

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class Task_11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter please integer number...");
        int number = in.nextInt();
        int[] numbers = new int[]{number, number, number};
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
    }
}
