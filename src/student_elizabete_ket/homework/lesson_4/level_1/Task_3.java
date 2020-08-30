package student_elizabete_ket.homework.lesson_4.level_1;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Please enter number from 1 till 7:");

        int inputNumber = sc.nextInt();
        if (inputNumber == 1) {
            System.out.println("It`s Monday");
        } else if (inputNumber == 2) {
            System.out.println("It`s Tuesday");
        } else if (inputNumber == 3) {
            System.out.println("It`s Wednesday");
        } else if (inputNumber == 4) {
            System.out.println("It`s Thursday");
        } else if (inputNumber == 5) {
            System.out.println("It`s Friday");
        } else if (inputNumber == 6) {
            System.out.println("It`s Saturday");
        } else if (inputNumber ==7) {
            System.out.println("It`s Sunday");
        } else {
            System.out.println("Wrong number was entering!");
        }
    }
}