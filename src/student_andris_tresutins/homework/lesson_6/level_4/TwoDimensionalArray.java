package student_andris_tresutins.homework.lesson_6.level_4;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "В задании сказано:" +
        "Найти в интернете и написать пример кода в котором:\n" +
        "- создать класс TwoDimensionalArray,\n" +
        "- создать метод для заполнения массива случайными числами,\n" +
        "- создать метод для подсчёта суммы всех чисел в массиве." +
        "Не вижу два последних пункта.")
public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] arr = new int[10][10];
        arr[0][0] = 1;
        arr[1][0] = 2;
        arr[0][1] = 3;


        System.out.println(arr[0][0]);
        System.out.println(arr[1][0]);
        System.out.println(arr[0][1]);
    }
}
