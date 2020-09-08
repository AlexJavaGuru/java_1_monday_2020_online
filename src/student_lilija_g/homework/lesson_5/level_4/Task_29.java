package student_lilija_g.homework.lesson_5.level_4;

/*
Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите все чётные числа в массиве и выведети их на консоль.
 */

import teacher.annotations.CodeReview;

import java.util.Random;
import java.util.Scanner;

@CodeReview(approved = true)
class Task_29 {

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public int[] arrayLengthFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter arrays length: ");
        int arraysLength = scanner.nextInt();
        return createArray(arraysLength);
    }

    void solutionTask_29(int[] myArray) {

        Random random = new Random();
        StringBuilder myString = new StringBuilder("Array: {");
        StringBuilder myEvenNumbersInArray = new StringBuilder("Even numbers in array: ");
        int j = 0;

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(100);
            myString.append(myArray[i]);

            if (myArray[i] % 2 == 0 && j == 0) {
                myEvenNumbersInArray.append(myArray[i]);
                j++;
            } else {
                if (myArray[i] % 2 == 0) {
                    myEvenNumbersInArray.append(",");
                    myEvenNumbersInArray.append(myArray[i]);
                }
            }

            if (i < myArray.length - 1) {
                myString.append(",");
            } else {
                myString.append("}");
            }
        }
        System.out.println(myString);
        System.out.println("\n" + myEvenNumbersInArray);
    }

    public static void main(String[] args) {
        Task_29 task_29 = new Task_29();
        int[] arrayDemo = task_29.arrayLengthFromUser();
        task_29.solutionTask_29(arrayDemo);
    }
}
