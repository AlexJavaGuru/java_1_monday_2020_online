package student_regina_svistunov.lesson_4.level_1;

import java.util.Scanner;

public class Task_3 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter a number from 1 to 7: ");

            int number = scanner.nextInt();

            if (number == 1) {
                System.out.println(" Monday");
            } else if (number == 2) {
                System.out.println(" Thursday");
            } else if (number == 3) {
                System.out.println(" Wednesday");
            } else if (number == 4) {
                System.out.println(" Thursday");
            } else if (number == 5) {
                System.out.println(" Friday");
            } else if (number == 6) {
                System.out.println(" Saturday");
            } else if (number == 7) {
                System.out.println(" Sunday");
            } else {
                System.out.println("Please, write number from 1 to 7! :) ");
            }
        }
    }




//    Написать программу, которая запрашивает у пользователя
//        целое число от 1 до 7 и выводит на консоль соотметствующий
//        этому числу день недели.
//
//        Пример:
//        Ввод: 3
//        Вывод: Wednesday
//
//        Ввод: 5
//        Вывод: Friday