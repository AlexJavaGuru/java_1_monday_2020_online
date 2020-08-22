package student_arturs_arusanovs.lesson_4.level_3;

import java.util.Scanner;

class Task_10 {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write first number please.");
        int number1 = scanner.nextInt();
        System.out.println("Write second number please.");
        int number2 = scanner.nextInt();
        System.out.println("Write third number please.");
        int number3 = scanner.nextInt();

        if (number1 > number2 && number1 > number3) {
            System.out.println( number1 + " is the largest number.");
        } else if (number2 > number1 && number2 > number3){
            System.out.println( number2 + " is the largest number.");
        } else if (number3 > number1 && number3 > number2) {
            System.out.println( number3 + " is the largest number.");
        } else {
            System.out.println("All numbers are the same.");
        }
    }
}
