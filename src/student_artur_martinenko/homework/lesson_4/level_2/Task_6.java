package student_artur_martinenko.homework.lesson_4.level_2;

import java.util.Scanner;

class Task_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first integer number: ");
        int one = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter second integer number: ");
        int two = scanner.nextInt();

        boolean oneIsBigger = one > two;
        if(!oneIsBigger){
            System.out.println("The smallest number is " + one);
        }else if (one == two) {
            System.out.println("Number " + one + " and " + two + " are even");
        } else {
            System.out.println("The smallest number is " + two);
        }
    }


}
