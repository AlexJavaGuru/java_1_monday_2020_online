package student_dmitry_vasiliev.lesson_4.level_1;

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class Task_1 {
    private int num;
    public static void main(String[] args) {

        System.out.println("Enter please integer number for check...");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if (num>=0)
            System.out.println(num + " is a positive number.");
        else
            System.out.println(num + " is a negative number.");
    }
}
