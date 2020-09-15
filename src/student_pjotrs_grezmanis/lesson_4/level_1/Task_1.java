package student_pjotrs_grezmanis.lesson_4.level_1;

import java.util.Scanner;

 class Task_1 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter whole number please");
        int wholeNumber = scanner.nextInt();

        if (wholeNumber < 0)
        {
            System.out.println("wholeNumber is negative");
        }
        if (wholeNumber > 0) {
            System.out.println("wholeNumber is pozitive");
        }


    }
}
