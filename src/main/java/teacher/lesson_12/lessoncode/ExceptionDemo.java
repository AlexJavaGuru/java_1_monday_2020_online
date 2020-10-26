package teacher.lesson_12.lessoncode;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

    public static void main(String[] args) {
        ExceptionDemo demo = new ExceptionDemo();
        demo.menu();
    }

    public void menu() {
        System.out.println("1 -> add product");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        switch (userInput) {
            case 1:
                addProduct();
                break;
                default:
        }

    }

    public void addProduct() {
        Scanner scanner = new Scanner(System.in);
        try {
            scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Input wrong format");
            menu();
        }
    }
}
