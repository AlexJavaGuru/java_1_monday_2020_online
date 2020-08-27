package student_artur_martinenko.homework.lesson_5.level_4;

import student_artur_martinenko.homework.lesson_5.level_5.ArrayUtil;

import java.util.Arrays;
import java.util.Scanner;

class Task_25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] intArray;
        System.out.print("Enter an array length: ");

        while (true) {
            boolean isInt = scanner.hasNextInt();
            if (isInt) {
                int arrayLength = scanner.nextInt();
                intArray = new int[arrayLength];
                scanner.nextLine();

                System.out.println("\nArray is created with length of " + arrayLength + "." +
                        "\nPlease enter " + arrayLength + " integers to fill up your array.");

                int iteration = 0;
                while (iteration < intArray.length) {
                    boolean isIntInArray = scanner.hasNextInt();
                    if (isIntInArray) {
                        intArray[iteration] = scanner.nextInt();
                        iteration++;
                    } else {
                        System.out.println("Entered number is not integer. Please enter an integer.");
                    }
                    scanner.nextLine();
                }

                break;
            } else {
                System.out.println("Entered number is not integer. Please enter an integer.");
            }
            scanner.nextLine();
        }

//        System.out.println("\nPrinting out your newly created array = " + Arrays.toString(intArray));

        ArrayUtil arrayUtil = new ArrayUtil();
        System.out.print("\nPrinting out your newly created array = ");
        arrayUtil.printArrayToConsole(intArray);

    }
}
