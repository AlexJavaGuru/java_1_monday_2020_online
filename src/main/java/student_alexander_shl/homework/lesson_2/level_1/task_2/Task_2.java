package student_alexander_shl.homework.lesson_2.level_1.task_2;

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.println("Please enter second number: ");
        double secondNumber = scanner.nextDouble();

        double sumResult = firstNumber + secondNumber;
        System.out.println("Sum: " + sumResult);

        double multiplyResult = firstNumber * secondNumber;
        System.out.println("Multiply: " + multiplyResult);

        double subtractionResult = firstNumber - secondNumber;
        System.out.println("Subtraction: " + subtractionResult);

        double divisionResult = firstNumber / secondNumber;
        System.out.println("Division: " + divisionResult);
    }

}
