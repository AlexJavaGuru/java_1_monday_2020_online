package student_artur_martinenko.homework.lesson_4.level_3;

import java.util.Scanner;

class Task_8 {

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

        if(one == two && one == three){
            System.out.println("All numbers are equal");
        }else if (one != two && one != three && two != three) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }


}
