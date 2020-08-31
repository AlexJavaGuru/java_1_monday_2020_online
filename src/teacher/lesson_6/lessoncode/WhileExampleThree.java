package teacher.lesson_6.lessoncode;

import java.util.Scanner;

public class WhileExampleThree {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Please enter a number what you want to find");
        int numberToFind = scanner.nextInt();

        int i = 0;
        boolean isNumberFound = false;
        while (i < array.length) {
            int number = array[i];
            if (number == numberToFind) {
                isNumberFound = true;
                break;
            }
            i++;
        }

        if (isNumberFound) {
            System.out.println("Number is found");
        } else {
            System.out.println("Number is not found!");
        }
    }
}
