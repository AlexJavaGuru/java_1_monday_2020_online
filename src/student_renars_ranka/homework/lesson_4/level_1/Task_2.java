package student_renars_ranka.homework.lesson_4.level_1;

import java.util.Scanner;
//Почему бы не использовать if else if? Зачем делать все три проверки? если можно сделать только одну, ведь они взаимноисключающие
class Task_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number...");

        int number = input.nextInt();

        if (number > 0) {

            System.out.println(number + " number is positive!");
        }

        if (number < 0) {

            System.out.println(number + " number is negative!");
        }
        if (number == 0){
            System.out.println(number + " number is equal to zero!");
        }

    }
}
