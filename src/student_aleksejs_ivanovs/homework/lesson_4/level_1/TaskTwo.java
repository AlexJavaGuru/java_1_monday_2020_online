package student_aleksejs_ivanovs.homework.lesson_4.level_1;

import java.util.Scanner;

class TaskTwo {

    public static void main(String[] args) {
        System.out.println("Enter an integer!");
        Scanner num = new Scanner (System.in);
        int number = num.nextInt();

        if (number > 0) {
            System.out.println("The number " + number + " is positive number!");
        } else if (number < 0) {
            System.out.println("The number " + number + " is negative number!");
        } else {
            System.out.println("The number " + number + " is zero!");
        }
    }

}
