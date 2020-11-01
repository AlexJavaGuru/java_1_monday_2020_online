package student_alexander_shl.homework.lesson_4.level_2.tasks_5_6_7;
/*
Написать программу, которая запрашивает у пользователя
два целых числа и выводит на консоль:
- наибольшее из них; // task_5
- наименьшее из них; // task_6
- "Numbers are equals" - если числа равны // task_7
- "Numbers are different" - если числа не равны // task_7
 */

import teacher.annotations.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class Tasks_5_6_7 {

    public static void main(String[] args) {

        Tasks_5_6_7 myTask = new Tasks_5_6_7();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter integer Number one: ");
        int number1 = scanner.nextInt();

        System.out.println("Please enter integer Number two: ");
        int number2 = scanner.nextInt();

        myTask.findEqualsDifferentNumber(number1, number2);

    }

    void findEqualsDifferentNumber(int inputNumber1, int inputNumber2) {
        if (inputNumber1 == inputNumber2) {
            System.out.println("Numbers are equals");
        } else {
            System.out.println("Numbers are different");
            if (inputNumber1 > inputNumber2) {
                System.out.println("The maximal number :" + inputNumber1);
                System.out.println("The minimal number :" + inputNumber2);
            } else {
                System.out.println("The maximal number :" + inputNumber2);
                System.out.println("The minimal number :" + inputNumber1);
            }
        }
    }
}

