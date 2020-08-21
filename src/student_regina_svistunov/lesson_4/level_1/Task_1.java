package student_regina_svistunov.lesson_4.level_1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

            System.out.println("Give me the number, please :) ");
            int number = scanner.nextInt();

            if (number < 0 ) {
                System.out.println( number + " is negative! ");
            }
            else {
                System.out.println( number + " is positive!");
        }
        }
    }

//    Написать программу, которая запрашивает у пользователя
//        целое число и выводит на консоль
//        положительное оно или отрицательное.
