package student_pjotrs_grezmanis.lesson_2.level_1;

import java.util.Scanner;

 class Task_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println("Please enter two double number");

        double firstDoubleNumber = scanner.nextDouble();

        double secondDoubleNumber = scanner.nextDouble();

        double sum = secondDoubleNumber + firstDoubleNumber;

        double sud = secondDoubleNumber - firstDoubleNumber;

        double div = secondDoubleNumber / firstDoubleNumber;

        double mul = secondDoubleNumber * firstDoubleNumber;



        System.out.println("Sum = " + sum);
        System.out.println("Sud = " + sud);
        System.out.println("Div = " + div);
        System.out.println("Mul = " + mul);


    }
}
