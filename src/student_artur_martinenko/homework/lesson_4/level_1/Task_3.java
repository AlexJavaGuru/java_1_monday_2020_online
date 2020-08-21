package student_artur_martinenko.homework.lesson_4.level_1;

import java.util.Scanner;

class Task_3 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter an integer form 1 till 7 which represents week day: ");
        while (true){
            boolean isInt = scanner.hasNextInt();
            if(isInt){
                int input = scanner.nextInt();
                if(0 < input && input <=7){
                    switch (input){
                        case 1:
                            System.out.println("Monday.");
                            break;
                        case 2:
                            System.out.println("Tuesday.");
                            break;
                        case 3:
                            System.out.println("Wednesday.");
                            break;
                        case 4:
                            System.out.println("Thursday.");
                            break;
                        case 5:
                            System.out.println("Friday.");
                            break;
                        case 6:
                            System.out.println("Saturday.");
                            break;
                        default:
                            System.out.println("Sunday.");
                            break;
                    }
                    break;
                }
            }else{
                    System.out.print("Please enter a valid integer number from 1 till 7: ");
            }
            scanner.nextLine();
        }
        scanner.close();

    }

}
