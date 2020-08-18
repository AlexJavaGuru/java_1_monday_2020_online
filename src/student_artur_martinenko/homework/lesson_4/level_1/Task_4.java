package student_artur_martinenko.homework.lesson_4.level_1;

import java.util.Scanner;

class Task_4 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        while (true){
            boolean isInt = scanner.hasNextInt();
            if(isInt){
                int input = scanner.nextInt();
                if(input % 2 == 0){
                    System.out.println("Number " + input + " is EVEN.");
                }else{
                    System.out.println("Number " + input + " is ODD.");
                }
                break;
            }else{
                System.out.print("Enter a valid integer number: ");
            }
            scanner.nextLine();
        }

    }

}
