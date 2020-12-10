package student_alexander_shl.homework.lesson_6.level_4;
/*
Task_15:
Напишите бесконечный цикл при помощи while и for.

Task_16:
Как выйти из бесконечного цикла?
Найдите в интернете и напишите пример кода
для циклов while и for.
 */

import java.util.Scanner;

class Task_15_16 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//      while (true) {   // Task_15
        for (; ; ) {     // Task_15
            System.out.println("Please enter your number: ");
            int number = scanner.nextInt();
            if (number == 0) {
                break;              // Task_16
            }
        }
    }
}
