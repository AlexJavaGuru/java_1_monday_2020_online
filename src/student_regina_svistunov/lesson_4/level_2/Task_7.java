package student_regina_svistunov.lesson_4.level_2;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner Number1 = new Scanner(System.in);
        System.out.println( "Please enter first number: ");
        int number1 = Number1.nextInt();

        Scanner Number2 = new Scanner(System.in);
        System.out.println( "Please enter second number: ");
        int number2 = Number2.nextInt();

        if (number1 == number2){
            System.out.println("Numbers are equals! ");
        }
        else{
            System.out.println("Numbers are different! ");
        }
    }
}


//    Написать программу, которая запрашивает у пользователя
//        два целых числа и выводит на консоль:
//        - "Numbers are equals" - если числа равны
//        - "Numbers are different" - если числа не равны