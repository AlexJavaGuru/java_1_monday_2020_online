package student_andris_tresutins.homework.lesson_6.level_4;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;
import java.util.Random;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Nice, why arr name is used? Don't hesitate to write full name array or twoDemantionalArray")
 class TwoDimensionalArray {
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
