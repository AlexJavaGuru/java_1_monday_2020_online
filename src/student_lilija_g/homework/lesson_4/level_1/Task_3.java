package student_lilija_g.homework.lesson_4.level_1;

import java.util.Scanner;

class Task_3 {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter your integer from 1 to 7: ");
        int yourNumber = myScanner.nextInt();

        if (yourNumber < 1 || yourNumber > 7)

            System.out.println("Your number " + yourNumber + " is out of range.");

        switch (yourNumber) {
            case 1:
                System.out.println("Your number " + yourNumber + " - Monday.");
                break;
            case 2:
                System.out.println("Your number " + yourNumber + " - Tuesday.");
                break;
            case 3:
                System.out.println("Your number " + yourNumber + " - Wednesday.");
                break;
            case 4:
                System.out.println("Your number " + yourNumber + " - Thursday.");
                break;
            case 5:
                System.out.println("Your number " + yourNumber + " - Friday.");
                break;
            case 7:
                System.out.println("Your number " + yourNumber + " - Sunday.");
                break;
        }

    }

}
