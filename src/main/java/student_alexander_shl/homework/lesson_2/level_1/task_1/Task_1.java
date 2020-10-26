package student_alexander_shl.homework.lesson_2.level_1.task_1;

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class Task_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Please enter second number: ");
        int secondNumber = scanner.nextInt();

        int sumResult = firstNumber + secondNumber;
        System.out.println("Sum: " + sumResult);

        int multiplyResult = firstNumber * secondNumber;
        System.out.println("Multiply: " + multiplyResult);

        int subtractionResult = firstNumber - secondNumber;
        System.out.println("Subtraction: " + subtractionResult);

        int divisionResult = firstNumber / secondNumber;
        System.out.println("Division: " + divisionResult);
    }

}
