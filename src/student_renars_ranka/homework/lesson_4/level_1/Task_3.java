package student_renars_ranka.homework.lesson_4.level_1;

import java.util.Scanner;

class Task_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter number of the day of the week...");
        int number = input.nextInt();

        if (number == 1) {
            System.out.println(number + " its Monday");
        }

        else if (number == 2) {
            System.out.println(number + " its Tuesday");
        }

        else if (number == 3) {
            System.out.println(number + " its Wednesday");
        }

        else if (number == 4) {
            System.out.println(number + " its Thursday");
        }

        else if (number == 5) {
            System.out.println(number + " its Friday");
        }

        else if (number == 6) {
            System.out.println(number + " its Saturday");
        }

        else if (number == 7) {
            System.out.println(number + " its Sunday");
        }

        else {
            System.out.println("Invalid number");
        }

        }
    }