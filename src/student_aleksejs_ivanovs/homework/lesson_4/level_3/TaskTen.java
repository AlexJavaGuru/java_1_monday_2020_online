package student_aleksejs_ivanovs.homework.lesson_4.level_3;

import java.util.Scanner;

class TaskTen {

    public static void main(String[] args) {
        System.out.println("Enter three integers!");
        Scanner num = new Scanner (System.in);
        int numberOne = num.nextInt();
        int numberTwo = num.nextInt();
        int numberThree = num.nextInt();

        if (numberOne > numberTwo) {
            if (numberOne > numberThree) {
                System.out.println("The number " + numberOne + " is larger!");
            } else {
                System.out.println("The number " + numberThree + " is larger!");
            }
        } else {
            if (numberTwo > numberThree) {
                System.out.println("The number " + numberTwo + " is larger!");
            } else {
                System.out.println("The number " + numberThree + " is larger!");
            }
        }
    }

}
