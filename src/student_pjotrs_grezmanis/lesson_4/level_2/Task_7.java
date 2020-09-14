package student_pjotrs_grezmanis.lesson_4.level_2;

import java.util.Scanner;

class Task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter wholeNumber One");
        int a = scanner.nextInt();
        System.out.println("Enter wholeNumber Two");
        int b = scanner.nextInt();

        if (a == b ){
            System.out.println("Numbers are equals");
        }

        if (b != a){
            System.out.println("Numbers are different");
        }



    }
}


