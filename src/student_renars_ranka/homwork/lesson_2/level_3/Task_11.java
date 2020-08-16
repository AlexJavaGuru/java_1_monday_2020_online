package student_renars_ranka.homwork.lesson_2.level_3;

import java.util.Scanner;

    public class Task_11 {

        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

            System.out.print("Input first number: ");
            int number1 = in.nextInt();

            System.out.print("Input second number: ");
            int number2 = in.nextInt();

            System.out.print("Input third number: ");
            int number3 = in.nextInt();

            System.out.println((number1 + number2 + number3) / 3);
        }

    }
