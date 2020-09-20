package student_aleksejs_ivanovs.homework.lesson_6.level_4;

import java.util.Scanner;

class Task_16 {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.println("First cycle :");

        while (true) {
            System.out.println("Write number");
            int stopNumber = number.nextInt();

            if (stopNumber == 0) {
                break;
            } else {
                System.out.println("Your number : " + stopNumber);
            }
            System.out.println("Write 0 to exit");
        }

        System.out.println("Second cycle :");

        for ( ; ; ) {
            System.out.println("Write number");
            int stopNumber = number.nextInt();

            if (stopNumber == 0) {
                break;
            } else {
                System.out.println("Your number : " + stopNumber);
            }
            System.out.println("Write 0 to exit");
        }
    }

}
