package student_lilija_g.homework.lesson_5.level_4;

/*
Напишите программу, в которой:
        - запросите у пользователя с консоли длину массива
        - создайте массив указанной пользователем длины
        - заполните массив случайными числами
        - распечатайте на консоль все элементы массива.
*/

import teacher.annotations.CodeReview;

import java.util.Scanner;
import java.util.Random;

@CodeReview(approved = true)
class Task_26 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Please enter arrays length: ");
        int arraysLength = scanner.nextInt();

        int[] myArrays = new int[arraysLength];
        StringBuilder myString = new StringBuilder("{");

        for (int i = 0; i < arraysLength; i++) {
            myArrays[i] = random.nextInt(100);
            System.out.println("Array element number " + i + ": " + myArrays[i]);
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
