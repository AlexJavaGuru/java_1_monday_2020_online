package student_andris_tresutins.homework.lesson_5.level_4;

import teacher.annotations.CodeReview;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

@CodeReview(approved = true)
 class Task_26 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random randNum = new Random();

        System.out.println("Enter length of the array");
        int arrLength = input.nextInt();
        int[] generatedArray = new int[arrLength];

        for ( int i = 0 ; i < generatedArray.length ; i++ ) {
            generatedArray[i] = randNum.nextInt(100);
        }

        System.out.println("Complete Array :");
        System.out.println(Arrays.toString(generatedArray));

    }
}
