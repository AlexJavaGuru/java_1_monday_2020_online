package student_dmitry_vasiliev.lesson_5.level_4;
//    Напишите программу, в которой:
//- запросите у пользователя с консоли длину массива
//- создайте массив указанной пользователем длины
//- заполните массив числами полученными от пользователя
//- распечатайте на консоль все элементы массива.

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Scanner;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Дмитрий, все хорошо, только почему у вас все время формат в классе страдает? Посмотрите, я исправил вам формат.")
class Task_25 {

    public int[] emptyArray(int arrayLength) {
        int[] newArray = new int[arrayLength];
        return newArray;
    }

    public int[] arrayLengthFromUser() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter array lenght...");
        int arrayLength = in.nextInt();
        return emptyArray(arrayLength);
    }

    public void fillNewArray(int[] array) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Please enter integer of array...");
            array[i] = in.nextInt();
        }
    }

    public String convertArrayToString(int[] array) {
        System.out.println("Array is: ");
        String str = "{";
        for (int i = 0; i < array.length; i++) {
            str = str + array[i];
            if (i < array.length - 1) {
                str = str + ",";
            }
        }
        return str + "}";
    }

}
