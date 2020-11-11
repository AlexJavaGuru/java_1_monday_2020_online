package student_andris_tresutins.homework.Lesson_12.level_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WrongUserInputHandlingDemo {
    public static void main(String[] args) {
        WrongUserInputHandlingDemo victim = new WrongUserInputHandlingDemo();
        victim.handleInput();

    }

        public int scanner() throws InputMismatchException {
            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter a whole number: ");
            int input = myObj.nextInt();
            return input;
        }

        public void handleInput() {
        try {
            int integer = scanner();
            System.out.println("You entered: " + integer);
            handleInput();
        }catch (InputMismatchException e) {
            System.out.println("Please enter an integer");
            handleInput();
            }
        }




}
