package student_renars_ranka.homework.lesson_5.level_2;

import teacher.annotations.CodeReview;

import java.util.Arrays;

@CodeReview(approved = true)
public class Task_13 {
}
class ArraysOfIntFor {

    public static void main(String[] args) {
        ArraysOfIntFor arraysOfInt = new ArraysOfIntFor();

        int[] myFirstArray = new int[3];

        for (int i = 0; i < myFirstArray.length; i++){
            myFirstArray[i] = (int) (Math.random() * 50);
        }
        int sum = 0;
        for (int i : myFirstArray) {
            sum += i;
        }
        System.out.println(Arrays.toString(myFirstArray));
        System.out.println("Sum of Arrays is = " + sum);
    }
}