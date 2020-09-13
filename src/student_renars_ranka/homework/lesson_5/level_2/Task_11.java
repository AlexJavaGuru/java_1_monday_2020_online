package student_renars_ranka.homework.lesson_5.level_2;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Arrays;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Попробуйте переделать программу, чтобы она работала, даже когда я поставлю размер массива 5 или 10 или любое другое число.")
class Task_11 {
}
class ArraysOfIntTwo {

    public static void main(String[] args) {
        ArraysOfIntTwo arraysOfInt = new ArraysOfIntTwo();

        int[] myFirstArray = new int[3];

        myFirstArray[0] = 10;
        myFirstArray[1] = 20;
        myFirstArray[2] = 30;

        System.out.println(Arrays.toString(myFirstArray));
    }
}