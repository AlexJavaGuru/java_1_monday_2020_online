package student_lilija_g.homework.lesson_5.level_4;

/*
Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите все нечётные числа в массиве и выведети их на консоль.
 */

import teacher.annotations.CodeReview;

import java.util.Random;
import java.util.Scanner;

@CodeReview(approved = true)
class Task_30 {
    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public int[] arrayLengthFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter arrays length: ");
        int arraysLength = scanner.nextInt();
        return createArray(arraysLength);
    }

    void solutionTask_30(int[] myArray) {

        Random random = new Random();
        StringBuilder myString = new StringBuilder("Array: {");
        StringBuilder myOddNumbersInArray = new StringBuilder("Odd numbers in array: ");
        int j = 0;

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(100);
            myString.append(myArray[i]);

            if (myArray[i] % 2 != 0 && j == 0) {
                myOddNumbersInArray.append(myArray[i]);
                j++;
            } else {
                if (myArray[i] % 2 != 0) {
                    myOddNumbersInArray.append(",");
                    myOddNumbersInArray.append(myArray[i]);
                }
            }

            if (i < myArray.length - 1) {
                myString.append(",");
            } else {
                myString.append("}");
            }
        }
        System.out.println(myString);
        System.out.println("\n" + myOddNumbersInArray);
    }

    public static void main(String[] args) {
        Task_30 task_30 = new Task_30();
        int[] arrayDemo = task_30.arrayLengthFromUser();
        task_30.solutionTask_30(arrayDemo);
    }
}
