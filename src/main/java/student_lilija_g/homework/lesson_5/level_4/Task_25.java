package student_lilija_g.homework.lesson_5.level_4;

/*
Напишите программу, в которой:
- запросите у пользователя с консоли длину массива
- создайте массив указанной пользователем длины
- заполните массив числами полученными от пользователя
- распечатайте на консоль все элементы массива.
 */

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class Task_25 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter arrays length: ");
        int arraysLength = scanner.nextInt();

        int[] myArrays = new int[arraysLength];
        StringBuilder myString = new StringBuilder("{");  // Идея давала предупреждение => Прочитала в интернете, что если String в цикле, то для экономии памяти используют этот класс.
        //Это хорошо. Главное чтобы вы понимали, как формируется строка в таком случае. Builder это отдельный Pattern в программировании.

        for (int i = 0; i < arraysLength; i++) {

            System.out.print("Please enter array element number " + i + ": ");
            myArrays[i] = scanner.nextInt();
            myString.append(myArrays[i]);

            if (i < arraysLength - 1) {
                myString.append(",");
            } else {
                myString.append("}");
            }
        }
        System.out.println("Array: " + myString);
    }
}
