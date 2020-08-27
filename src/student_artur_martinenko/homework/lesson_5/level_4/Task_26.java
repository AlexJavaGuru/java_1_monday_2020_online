package student_artur_martinenko.homework.lesson_5.level_4;

import teacher.annotations.CodeReview;

import java.util.Arrays;
import java.util.Scanner;

@CodeReview(approved = true)
class Task_26 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] intArray;
        System.out.print("Enter an array length: ");

        while (true) {
            boolean isInt = scanner.hasNextInt();
            if (isInt) {
                int arrayLength = scanner.nextInt();
                intArray = new int[arrayLength];

                System.out.println("\nArray is created with length of " + arrayLength + "." +
                        "\nNow it will be filled with random generated numbers.");

                for (int i = 0; i < intArray.length; i++) {
                    intArray[i] = (int) (Math.random() * 75);
                }

                break;
            } else {
                System.out.println("Entered number is not integer. Please enter an integer.");
            }
            scanner.nextLine();
        }

        System.out.println("\nPrinting out your newly created array = " + Arrays.toString(intArray));

    }
}
