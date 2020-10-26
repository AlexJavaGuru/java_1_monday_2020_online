package student_regina_svistunov.lesson_4.level_1;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println( "Please, enter the number");

        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " - is even number!");
        }
        else {
            System.out.println(number + "- is odd number!");
        }
    }
}


 //   Написать программу, которая запрашивает у пользователя
 //       целое число и выводит на консоль чётное оно или нет.

 //       Подсказка: используйте для определения чётное число или нет
 //       операцию остаток от деления (%). Если остаток от деления на 2
 //       равен нулю то число чётное, иначе не чётное.

