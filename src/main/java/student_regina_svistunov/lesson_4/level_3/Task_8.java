package student_regina_svistunov.lesson_4.level_3;

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Write first number please: ");
        int number1 = scanner.nextInt();
        System.out.println(" Write second number please: ");
        int number2 = scanner.nextInt();
        System.out.println(" Write third number please: ");
        int number3 = scanner.nextInt();

            if (number1 == number2 && number1 == number3 ){
                System.out.println("All numbers are equals! ");
            }
            else if (number1 != number2 && number1 != number3 ) {
                System.out.println("All numbers are different! ");
            }
            else {
                System.out.println("Neither all are equal or different! ");
            }
        }
    }



//    Write a Java program that accepts three numbers and prints:
//        - "All numbers are equal" if all three numbers are equal,
//        - "All numbers are different" if all three numbers are different
//        - "Neither all are equal or different" otherwise.
