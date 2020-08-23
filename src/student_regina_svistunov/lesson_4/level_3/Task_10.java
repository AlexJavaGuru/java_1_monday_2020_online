package student_regina_svistunov.lesson_4.level_3;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Write first number please: ");
        int number1 = scanner.nextInt();
        System.out.println(" Write second number please: ");
        int number2 = scanner.nextInt();
        System.out.println(" Write third number please: ");
        int number3 = scanner.nextInt();

        if ( number1 > number2 && number1 > number3) {
            System.out.println(" The largest number is " + number1);
        }
        else if ( number2 > number1 && number2 > number3) {
            System.out.println(" The largest number is " + number2);
        }
        else if ( number3 > number1 && number3 > number2) {
            System.out.println(" The largest number is " + number3);
        }
        else {
            System.out.println(" All numbers are equal! ");
        }
}
}

//    Написать программу, которая запрашивает у пользователя
//        три целых числа и выводит на консоль наибольшее из них.
//        PS: перед решением этой задачи распишите на бумаге
//        или в коментарии все возможные варианты (комбинации).
//        Это поможет вам правильно написать программу!