package student_aleksejs_ivanovs.homework.lesson_4.level_3;

import java.util.Scanner;

class TaskNine {

    public static void main(String[] args) {
        System.out.println("Enter three integers!");
        Scanner num = new Scanner (System.in);
        int numberOne = num.nextInt();
        int numberTwo = num.nextInt();
        int numberThree = num.nextInt();

        if (numberOne < numberTwo && numberTwo < numberThree) {
            System.out.println("Increasing!");
        } else if (numberOne > numberTwo && numberTwo > numberThree) {
            System.out.println("Decreasing!");
        } else {
            System.out.println("Neither increasing or decreasing order!");
        }
    }

}
