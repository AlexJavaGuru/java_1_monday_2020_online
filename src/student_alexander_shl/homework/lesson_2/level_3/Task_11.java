package student_alexander_shl.homework.lesson_2.level_3;

/*Напишите программу, которая запрашивает у пользователя
три целых числа и выводит их среднее арифметическое
(складывает все числа и делит на их количество).
 */

import java.util.Scanner;

class Task_11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Please enter second number: ");
        int secondNumber = scanner.nextInt();

        System.out.println("Please enter third number: ");
        int thirdNumber = scanner.nextInt();

        int sumResult = firstNumber + secondNumber + thirdNumber;
        System.out.println("Sum: " + sumResult);

        System.out.print("среднее арифметическое 3-х чисел равно: " + sumResult/3);
    }
}
