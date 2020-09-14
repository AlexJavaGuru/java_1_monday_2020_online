package student_pjotrs_grezmanis.lesson_4.level_1;

import java.util.Scanner;

 class Task_4 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner (System.in) ;
         System.out.println("Enter whole number");
         int wholeNumber =  scanner.nextInt();

         if (wholeNumber % 2 == 0) {
             System.out.println("even number");
         }
         else {
             System.out.println("odd number");

         }

     }
}
