package student_artur_martinenko.homework.lesson_4.level_2;

import java.util.Scanner;

class Task_7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first integer number: ");
        int one = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter second integer number: ");
        int two = scanner.nextInt();

        if(one == two){
            System.out.println("Numbers are equals");
        }else {
            System.out.println("Numbers are different");
        }
    }


}
