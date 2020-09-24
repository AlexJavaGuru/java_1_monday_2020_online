package student_andris_tresutins.homework.lesson_5.level_4;

import teacher.annotations.CodeReview;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

@CodeReview(approved = true)
 class Task_30 {

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



        for (int i = 0; i < generatedArray.length; i++) {
            int arrayVal = generatedArray[i];
            if (arrayVal % 2 == 1 ) {


                System.out.print("Array index " + i + " value is not even : ");
                System.out.println(arrayVal);
            }
        }


    }
}
