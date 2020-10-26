package student_lilija_g.homework.lesson_5.level_4;

/*
Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите наименьшее число в массиве и выведети его на консоль.
 */

import teacher.annotations.CodeReview;

import java.util.Random;
import java.util.Scanner;

@CodeReview(approved = true)
class Task_28 {

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public int[] arrayLengthFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter arrays length: ");
        int arraysLength = scanner.nextInt();
        return createArray(arraysLength);
    }

    void solutionTask_28(int[] myArray) {

        Random random = new Random();
        StringBuilder myString = new StringBuilder("Array: {");
        int minNumber = 0;

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(100);
            myString.append(myArray[i]);

            if (i==0) {
                minNumber = myArray[i];
            } else {
                if (minNumber > myArray[i]) {
                    minNumber = myArray[i];
                }
            }

            if (i < myArray.length - 1) {
                myString.append(",");
            } else {
                myString.append("}");
            }
        }
        System.out.println(myString);
        System.out.println("\nMin array's number: " + minNumber);
    }

    public static void main(String[] args) {
        Task_28 task_28 = new Task_28();
        int[] arrayDemo = task_28.arrayLengthFromUser();
        task_28.solutionTask_28(arrayDemo);
    }
}
