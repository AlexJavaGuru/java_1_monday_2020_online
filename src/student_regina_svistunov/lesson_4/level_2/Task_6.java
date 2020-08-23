package student_regina_svistunov.lesson_4.level_2;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner Number1 = new Scanner(System.in);
        System.out.println( "Please enter first number: ");
        int number1 = Number1.nextInt();

        Scanner Number2 = new Scanner(System.in);
        System.out.println( "Please enter second number: ");
        int number2 = Number2.nextInt();

        if (number1 < number2){
            System.out.println(number1 + " is smaller than " + number2);
        }
        else{
            System.out.println(number2 + " is smaller than " + number1);
        }
    }
}


//    Написать программу, которая запрашивает у пользователя
//        два целых числа и выводит на консоль наименьшее из них.