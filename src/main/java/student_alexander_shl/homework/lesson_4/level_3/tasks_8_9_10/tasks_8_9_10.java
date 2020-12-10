package student_alexander_shl.homework.lesson_4.level_3.tasks_8_9_10;
/*
Write a Java program that accepts three numbers and prints:
- "All numbers are equal" if all three numbers are equal,
- "All numbers are different" if all three numbers are different
- "Neither all are equal or different" otherwise.
task_9:
Write a program that accepts three numbers from the user and prints:
- "increasing" if the numbers are in increasing order,
- "decreasing" if the numbers are in decreasing order,
- "Neither increasing or decreasing order" otherwise.
task_10:
Написать программу, которая запрашивает у пользователя
три целых числа и выводит на консоль наибольшее из них.

PS: перед решением этой задачи распишите на бумаге
или в коментарии все возможные варианты (комбинации).
Это поможет вам правильно написать программу!
 */

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Вам надо пересмотреть тему про условыне переходы if else. Попробуйте сделать" +
        "через else if конструкцию" +
        "")
class tasks_8_9_10 {


    public static void main(String[] args) {

        tasks_8_9_10 myTask = new tasks_8_9_10();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter integer Number one: ");
        int number1 = scanner.nextInt();

        System.out.println("Please enter integer Number two: ");
        int number2 = scanner.nextInt();

        System.out.println("Please enter integer Number three: ");
        int number3 = scanner.nextInt();

        myTask.findEqualsDifferentNumber(number1, number2, number3);
        myTask.findIncreasingDecreasing(number1, number2, number3);
        myTask.findMaximalNumber(number1, number2, number3);
    }

    void findEqualsDifferentNumber(int inputNumber1, int inputNumber2, int inputNumber3) {
        if (inputNumber1 == inputNumber2 && inputNumber1 == inputNumber3) {
            System.out.print("All numbers are equal.");
        } else if (inputNumber1 != inputNumber2
                && inputNumber1 != inputNumber3
                && inputNumber2 != inputNumber3) {
            System.out.print("All numbers are different.");}
        else
            System.out.print("Neither all are equal or different.");
    }

    void findIncreasingDecreasing(int inputNumber1, int inputNumber2, int inputNumber3) {

        if (inputNumber1 < inputNumber2 && inputNumber2 < inputNumber3) {
            System.out.print("increasing");
        } else if (inputNumber1 > inputNumber2
                && inputNumber2 > inputNumber3) {
            System.out.print("decreasing.");
        } else
            System.out.print("Neither increasing or decreasing order.");
    }

    void findMaximalNumber(int inputNumber1, int inputNumber2, int inputNumber3) {
        if (inputNumber3 > inputNumber1 && inputNumber3 > inputNumber2)  {
            System.out.println("The maximal number :" + inputNumber3);
        } else {
            if (inputNumber1 > inputNumber2 && inputNumber1 > inputNumber3) {
                System.out.println("The maximal number :" + inputNumber1);
            } else {
                System.out.println("The maximal number :" + inputNumber2);
            }
        }
    }
}











