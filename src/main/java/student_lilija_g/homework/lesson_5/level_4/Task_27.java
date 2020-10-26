package student_lilija_g.homework.lesson_5.level_4;

/*
Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите наибольшее число в массиве и выведети его на консоль.
 */

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Random;
import java.util.Scanner;
@CodeReview(approved = true)
@CodeReviewComment(comment = "Конечно можно было разделить два действия =). Заполнение массива и поиск числа ))) А то у вас выходит, что поиск происходит на лету. Это экономит ресурсы однозначно," +
        "но в реальности такое супер редко бывает )")
class Task_27 {

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public int[] arrayLengthFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter arrays length: ");
        int arraysLength = scanner.nextInt();
        return createArray(arraysLength);
    }

    void solutionTask_27(int[] myArray) {

        Random random = new Random();
        StringBuilder myString = new StringBuilder("Array: {");
        int maxNumber = 0;

        for (int i = 0; i < myArray.length; i++) {

            myArray[i] = random.nextInt(100);
            myString.append(myArray[i]);

            if (maxNumber < myArray[i]) {
                maxNumber = myArray[i];
            }

            if (i < myArray.length - 1) {
                myString.append(",");
            } else {
                myString.append("}");
            }
        }
        System.out.println(myString);
        System.out.println("\nMax array's number: " + maxNumber);
    }

    public static void main(String[] args) {
        Task_27 task_27 = new Task_27();
        int[] arrayDemo = task_27.arrayLengthFromUser();
        task_27.solutionTask_27(arrayDemo);
    }
}
