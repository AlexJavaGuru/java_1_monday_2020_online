package student_artur_martinenko.homework.lesson_7.level_4_junior;

import java.util.Arrays;
import java.util.Scanner;

//Code refactoring from student_artur_martinenko.homework.lesson_5.level_4 Task_26.java

class Refactoring_2 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Refactoring_2 victim = new Refactoring_2();
        int[] intArray = victim.createAndFillArrayWithRandomNumbers();
        System.out.println("\nPrinting out your newly created array with random numbers = " + Arrays.toString(intArray));
    }

    public int[] createAndFillArrayWithRandomNumbers() {
        int[] intArray;
        System.out.print("Enter an array length: ");

        while (true) {
            boolean isInt = scanner.hasNextInt();
            if (isInt) {
                intArray = new int[scanner.nextInt()];
                fillArrayWithRandomNumbers(intArray);
                break;
            } else {
                System.out.println("Entered number is not integer. Please enter an integer.");
            }
            scanner.nextLine();
        }
        return intArray;
    }

    private void fillArrayWithRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 75);
        }
    }


}
