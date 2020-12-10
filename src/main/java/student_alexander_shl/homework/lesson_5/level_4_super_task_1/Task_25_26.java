package student_alexander_shl.homework.lesson_5.level_4_super_task_1;
/*
Task_25:
Напишите программу, в которой:
- запросите у пользователя с консоли длину массива
- создайте массив указанной пользователем длины
- заполните массив числами полученными от пользователя
- распечатайте на консоль все элементы массива.

Task_26:
Напишите программу, в которой:
- запросите у пользователя с консоли длину массива
- создайте массив указанной пользователем длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива.

Super_task_1:
Проведите рефакторинг программ написанных
в рамках Lesson 5 day 4 с использованием
созданного класса ArrayUtil и его методов.
 */

import java.util.Scanner;

class Task_25_26 {

    public int[] createArray(int lengthFromUser) { // Task_25_26 + level_x super_task_1 refactoring
        return new int[lengthFromUser];
    }

    public int[] inputWithUser(int[] array) { // Task_25 + level_x super_task_1 refactoring

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            int j = i + 1;
            System.out.print("Please enter your number " + j + " : ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public void printArrayToConsole(int[] array) { // Task_25_26 + level_x super_task_1 refactoring
        System.out.println("\nYour array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }

    public int[] inputRandomNumbers(int[] array) { // Task_26
        for (int i = 0; i < array.length; i++) {
             array[i] = (int) (Math.random() * 100);
        }
        return array;
    }

    public static void main(String[] args) {

        Task_25_26 task = new Task_25_26();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your length of array: ");
        int numbers = scanner.nextInt();

        int[] arrayUser = task.inputWithUser(task.createArray(numbers)); // Task_25
        task.printArrayToConsole(arrayUser);

        int[] arrayRandom = task.inputRandomNumbers(task.createArray(numbers)); // Task_26
        task.printArrayToConsole(arrayRandom);
    }
}


