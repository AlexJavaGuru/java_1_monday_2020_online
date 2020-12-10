package student_alexander_shl.homework.lesson_5.level_2;

import java.util.Scanner;

/* Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива числом, запрошенным у пользователя,
 - вывести значение каждой ячейки на консоль.
 */

class Task_11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            int j = i + 1;
            System.out.print("Please enter your number " + j + " : ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("\nYour array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("number[" + i + "] = " + numbers[i]);
        }
    }
}
