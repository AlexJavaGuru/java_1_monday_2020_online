package student_elizabete_ket.homework.lesson_5.level_2;

import java.util.Scanner;

class Task_11 {

    public static void main(String[] args) {

        int[] numbers = new int[3];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert first number:");
        int numberOne = scanner.nextInt();
        System.out.println("Insert second number:");
        int numberTwo = scanner.nextInt();
        System.out.println("Insert third number:");
        int numberThree = scanner.nextInt();

        numbers[0] = numberOne;
        numbers[1] = numberTwo;
        numbers[2] = numberThree;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("[" + i + "] = " + numbers[i]);
        }

//        for (int number : numbers){
//            System.out.println(number);
//        }


    }


}
