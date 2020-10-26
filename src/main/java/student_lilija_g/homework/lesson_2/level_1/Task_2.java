package student_lilija_g.homework.lesson_2.level_1;

import java.util.Scanner;

class Task_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your double number One: ");
        double firstDoubleNumber = scanner.nextDouble();

        System.out.println("Enter your double number Two");
        double secondDoubleNumber = scanner.nextDouble();

        System.out.println("Addition: " + (firstDoubleNumber + secondDoubleNumber));
        System.out.println("Subtraction: " + (firstDoubleNumber - secondDoubleNumber));
        System.out.println("Multiplication: " + (firstDoubleNumber * secondDoubleNumber));
        System.out.println("Division: " + (firstDoubleNumber / secondDoubleNumber));


    }


}
