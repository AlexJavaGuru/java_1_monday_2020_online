package student_artur_martinenko.homework.lesson_12.level_3_junior.task_19;

import teacher.annotations.CodeReview;

import java.util.InputMismatchException;
import java.util.Scanner;

//Task_19
/*
Создайте класс WrongUserInputHandlingDemo
и в main() методе этого класса напишите код, который
- запрашивает у пользователя целое число
- если пользователь введёт не число а строку программа должна сообщить
  пользователю о допущенной ошибке и запросить ввести целое число еще раз.
 */
@CodeReview(approved = true)
class WrongUserInputHandlingDemo {


    public static void main(String[] args) {
        WrongUserInputHandlingDemo victim = new WrongUserInputHandlingDemo();
        victim.inputHandling();
    }

    private void inputHandling() {
        try {
            int number = askForInteger();
            System.out.println("\nYou've entered number: " + number);
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException. Please enter an Integer.");
            inputHandling();
        }
    }

    public int askForInteger() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        return scanner.nextInt();
    }


}
