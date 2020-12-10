package student_alexander_shl.homework.lesson_5.level_4_super_task_1;
/* Task_27:
Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите наибольшее число в массиве и выведети его на консоль.

Task_28:
Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите наименьшее число в массиве и выведети его на консоль.

Task_29:
Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите все чётные числа в массиве и выведети их на консоль.

Task_30:
Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите все нечётные числа в массиве и выведети их на консоль.

Super_task_1:
Проведите рефакторинг программ написанных
в рамках Lesson 5 day 4 с использованием
созданного класса ArrayUtil и его методов.
 */

import java.util.Scanner;

class Task_27_28_29_30 {

    public int[] createArray(int lengthFromUser) { // Task_27 + level_x super_task_1 refactoring
        return new int[lengthFromUser];
    }

    public int[] inputArrayLength() { // level_x super_task_1 refactoring
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your array length: ");
        int arrayLength = scanner.nextInt();
        return createArray(arrayLength);
    }

    public int[] inputRandomNumbers(int[] array) { // Task_26 + level_x super_task_1 refactoring
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }

    public int maxNumber(int[] array) { // Task_27
        int maxNumber = 0;
        for (int j : array) {
            if (maxNumber < j) {
                maxNumber = j;
            }
        }
        return maxNumber;
    }

    public int minNumber(int[] array) { // Task_28
        int minNumber = array[0];
        for (int j : array) {
            if (minNumber > j) {
                minNumber = j;
            }
        }
        return minNumber;
    }

    public void evenNumbersInArray(int[] array) { // Task_29
        int j=0;
        for (int k : array) {
            if (k % 2 == 0 && j == 0) {
                j++;
                System.out.print("Even numbers in array: " + k);
            } else {
                if (k % 2 == 0) {
                    System.out.print(", " + k);
                }
            }
        }
        System.out.println("");
    }

    public void oddNumbersInArray(int[] array) { // Task_30
        int j=0;
        for (int k : array) {
            if (k % 2 != 0 && j == 0) {
                j++;
                System.out.print("Odd numbers in array: " + k);
            } else {
                if (k % 2 != 0) {
                    System.out.print(", " + k);
                }
            }
        }
        System.out.println("");
    }

    public void printArrayToConsole(int[] array) {
        System.out.println("\nYour array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }

    public static void main(String[] args) {
        Task_27_28_29_30 task = new Task_27_28_29_30();
        int[] array = task.inputRandomNumbers(task.inputArrayLength());
        task.printArrayToConsole(array);
        int maxResult = task.maxNumber(array);
        System.out.println("Maximal value in array: " + maxResult); // Task_27
        int minResult = task.minNumber(array);
        System.out.println("Minimal value in array: " + minResult); // Task_28
        task.evenNumbersInArray(array);                             // Task_29
        task.oddNumbersInArray(array);                              // Task_30
    }
}

