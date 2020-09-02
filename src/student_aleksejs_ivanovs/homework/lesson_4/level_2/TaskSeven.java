package student_aleksejs_ivanovs.homework.lesson_4.level_2;

import java.util.Scanner;

class TaskSeven {

    public static void main(String[] args) {
        System.out.println("Enter two integers!");
        Scanner num = new Scanner (System.in);
        int numberOne = num.nextInt();
        int numberTwo = num.nextInt();

        if (numberOne == numberTwo) {
            System.out.println("Numbers are equals!");
        } else {
            System.out.println("Numbers are different!");
        }
    }

}
