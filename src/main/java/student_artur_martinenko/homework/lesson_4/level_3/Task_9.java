package student_artur_martinenko.homework.lesson_4.level_3;

import java.util.Scanner;

class Task_9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first integer number: ");
        int one = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter second integer number: ");
        int two = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter third integer number: ");
        int three = scanner.nextInt();

        if(one < two && two < three){
            System.out.println("increasing");
        }else if (one > two && two > three) {
            System.out.println("decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }


}
