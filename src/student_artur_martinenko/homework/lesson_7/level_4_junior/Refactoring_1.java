package student_artur_martinenko.homework.lesson_7.level_4_junior;

import java.util.Arrays;
import java.util.Scanner;

//Ваш пердыдущий комментарий (ниже) на мой код.
//@CodeReviewComment(comment = "Жаль, что все слито в один метод. Вы же уже умете методы писать? =D Что случилось?")
//Code refactoring from student_artur_martinenko.homework.lesson_5.level_4 Task_25.java

class Refactoring_1 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Refactoring_1 victim = new Refactoring_1();
        int[] intArray = victim.createAndFillArray();
        System.out.println("\nPrinting out your newly created array = " + Arrays.toString(intArray));
    }

    public int[] createAndFillArray() {
        System.out.print("Enter an array length: ");
        int[] intArray;
        while (true) {
            boolean isInt = scanner.hasNextInt();
            if (isInt) {
                intArray = new int[scanner.nextInt()];
                System.out.println("\nFill array with " + intArray.length + " integers :");
                fillArrayWithIntegers(intArray);
                break;
            } else {
                System.out.println("Entered number is not integer. Please enter an integer.");
            }
            scanner.nextLine();
        }
        return intArray;
    }

    private void fillArrayWithIntegers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean isIntInArray = scanner.hasNextInt();
            if (isIntInArray) {
                array[i] = scanner.nextInt();
            } else {
                System.out.println("Entered number is not integer. Please enter an integer.");
            }
            scanner.nextLine();
        }
    }


}
