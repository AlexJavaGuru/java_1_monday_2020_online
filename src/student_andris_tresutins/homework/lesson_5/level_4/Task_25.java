package student_andris_tresutins.homework.lesson_5.level_4;

import teacher.annotations.CodeReview;

import java.util.Scanner;
import java.util.Arrays;

@CodeReview(approved = true)
public class Task_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter length of the array");
        int arrLength = input.nextInt();

        int[] generatedArray = new int[arrLength];

        for ( int i = 0 ; i < generatedArray.length ; i++ ) {
            System.out.println("Enter value for array index - " + i);
            generatedArray[i] = input.nextInt();
        }
        System.out.println("Complete Array :");
        System.out.println(Arrays.toString(generatedArray));

    }

}
