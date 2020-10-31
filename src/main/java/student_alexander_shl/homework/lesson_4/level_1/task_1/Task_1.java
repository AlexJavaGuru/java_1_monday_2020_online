package student_alexander_shl.homework.lesson_4.level_1.task_1;
/*
Написать программу, которая запрашивает у
пользователя
целое число и выводит на консоль
положительное оно или отрицательное.
 */

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class Task_1 {

    public static void main(String[] args) {

        Task_1 myTask_1 = new Task_1();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter any integer Number: ");
        int number = scanner.nextInt();
        myTask_1.positiveOrNegative(number);
    }

    void positiveOrNegative(int inputNumber) {
        if (inputNumber >= 0) {
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is negative");
        }
    }

}
