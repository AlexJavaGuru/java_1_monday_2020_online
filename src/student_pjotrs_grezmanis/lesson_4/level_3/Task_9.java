package student_pjotrs_grezmanis.lesson_4.level_3;

import java.util.Scanner;

 class Task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number One");
        int a = scanner.nextInt();
        System.out.println("Enter number Two");
        int b = scanner.nextInt();
        System.out.println("Enter number Three");
        int c = scanner.nextInt();

        if (a < b && b < c) {
            System.out.println("increasing");
        } else if (a > b && b > c) {
            System.out.println("decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
