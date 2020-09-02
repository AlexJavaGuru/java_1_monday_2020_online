package student_arturs_arusanovs.lesson_5.level_2;

import java.util.Scanner;

class Task_11 {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write down the three cell values.");
            int number1 = scanner.nextInt();
            int number2 = scanner.nextInt();
            int number3 = scanner.nextInt();

        int[] numbers = {number1, number2, number3};

        System.out.println("Your arrays values: ");

        for (int i=0; i< numbers.length; i++) {
            System.out.println("[" + i + "]: " + numbers[i]);
        }
    }
}
