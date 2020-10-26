package student_renars_ranka.homework.lesson_4.level_1;

import java.util.Scanner;

class Task_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number...");
        int number = input.nextInt();
        double number2 = number % 2;

        if (number2 == 0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Not even");
        }
    }
}
