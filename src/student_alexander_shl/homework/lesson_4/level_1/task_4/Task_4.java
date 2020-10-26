package student_alexander_shl.homework.lesson_4.level_1.task_4;
/*
Написать программу, которая запрашивает у пользователя
целое число и выводит на консоль чётное оно или нет.

Подсказка: используйте для определения чётное число или нет
операцию остаток от деления (%). Если остаток от деления на 2
равен нулю то число чётное, иначе не чётное.
 */

import java.util.Scanner;

class Task_4 {

    public static void main(String[] args) {

        Task_4 myTask_4 = new Task_4();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter any integer Number: ");
        int number = scanner.nextInt();
        myTask_4.evenOrOdd(number);
    }

    void evenOrOdd(int inputNumber) {

        if (inputNumber % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }
}

