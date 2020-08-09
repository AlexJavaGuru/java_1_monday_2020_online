package student_andris_tresutins.homework.lesson_2.level_3;

import java.util.Scanner;

public class task_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input number 1");
        int num1 = input.nextInt();
        System.out.println("input number 2");
        int num2 = input.nextInt();
        System.out.println("input number 3");
        int num3 = input.nextInt();
        System.out.print("The result = ");
        System.out.println((num1 + num2 + num3) / 3);
    }
}
