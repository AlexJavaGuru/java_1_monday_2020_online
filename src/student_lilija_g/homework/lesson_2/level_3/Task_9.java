package student_lilija_g.homework.lesson_2.level_3;

import java.util.Scanner;

public class Task_9 {

    public static void main(String[] args) {

        System.out.println ("Input a number: ");
        Scanner inputNumber = new Scanner(System.in);

        int newNumber = inputNumber.nextInt();

        for (int i=1; i<=10; i++){
            int resultNumber = newNumber * i;
            System.out.println(newNumber +" x "+ i +" = "+ resultNumber);
        }
    }
}
