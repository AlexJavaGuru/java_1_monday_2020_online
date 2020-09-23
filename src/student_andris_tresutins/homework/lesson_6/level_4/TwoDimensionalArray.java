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
        //Corrected :D
public class TwoDimensionalArray {
    public static void main(String[] args) {

        int[][] arr = new int[3][3];
        Random rand = new Random();


        int arraySum = 0;
        for(int i = 0; i< arr.length; i++)
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = rand.nextInt(100);
                System.out.println(arr[i][j]);
                arraySum += arr[i][j];
            }



        System.out.println("Sum : " + arraySum );
    }
}
