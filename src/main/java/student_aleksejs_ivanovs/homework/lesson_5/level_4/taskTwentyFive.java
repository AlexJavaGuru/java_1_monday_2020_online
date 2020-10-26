package student_aleksejs_ivanovs.homework.lesson_5.level_4;

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class taskTwentyFive {

    public static void main(String[] args) {
        System.out.println("Enter the length of the array!");
        Scanner num = new Scanner(System.in);
        int arrayLength = num.nextInt();
        int[] array = new int[arrayLength];

        System.out.println("Enter " + arrayLength + " integers!");
        for (int i = 0; i < arrayLength; i++) {
            array[i] = num.nextInt();
        }
        for (int i = 0; i < arrayLength; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
