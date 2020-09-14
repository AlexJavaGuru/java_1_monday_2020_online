package student_pjotrs_grezmanis.lesson_4.level_2;

import java.util.Scanner;
 class Task_5 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter wholeNumber One");
         int a = scanner.nextInt();
         System.out.println("Enter wholeNumber Two");
         int b = scanner.nextInt();

         if (a >= b ){
             System.out.println(a);
         }

         if (b >= a){
             System.out.println(b);
         }



     }
}
