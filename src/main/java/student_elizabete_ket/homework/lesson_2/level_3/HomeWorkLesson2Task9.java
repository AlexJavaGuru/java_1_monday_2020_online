package student_elizabete_ket.homework.lesson_2.level_3;

import java.util.Scanner;

public class HomeWorkLesson2Task9 {
    public static void main(String[] args) {
        System.out.println("enter number:");
        Scanner number = new Scanner (System.in);
        int num = number.nextInt();

        for (int i=1; i <=10; i++) {
            int answer = num * i;

            System.out.println(num +" * "+i+" = "+ answer);
        }


    }
}
