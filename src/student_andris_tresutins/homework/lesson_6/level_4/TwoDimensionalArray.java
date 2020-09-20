package student_andris_tresutins.homework.lesson_6.level_4;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;
import java.util.Random;

@CodeReview(approved = false)
@CodeReviewComment(comment = "В задании сказано:" +
        "Найти в интернете и написать пример кода в котором:\n" +
        "- создать класс TwoDimensionalArray,\n" +
        "- создать метод для заполнения массива случайными числами,\n" +
        "- создать метод для подсчёта суммы всех чисел в массиве." +
        "Не вижу два последних пункта." +
        "" +
        "Andris, the whole array must be filled with the numbers...not only three items. Please correct.")
public class TwoDimensionalArray {
    public static void main(String[] args) {

        int[][] arr = new int[10][10];
        Random rand = new Random();

        arr[0][0] = rand.nextInt(100);
        arr[1][0] = rand.nextInt(100);
        arr[0][1] = rand.nextInt(100);


        System.out.println(arr[0][0]);
        System.out.println(arr[1][0]);
        System.out.println(arr[0][1]);

        int arraySum = arr[0][0] +  arr[1][0] + arr[0][1];

        System.out.println("Sum : " + arraySum );
    }
}
