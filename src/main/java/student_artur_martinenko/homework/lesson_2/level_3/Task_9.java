package student_artur_martinenko.homework.lesson_2.level_3;

import java.util.Scanner;

public class Task_9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int number = scanner.nextInt();
        scanner.close();

        for( int i = 1; i <= 10; i++){
            System.out.println(number +" x "+ i + " = " + (number*i));
        }

    }


}
