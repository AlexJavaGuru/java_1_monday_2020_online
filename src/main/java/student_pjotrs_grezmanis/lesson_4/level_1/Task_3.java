package student_pjotrs_grezmanis.lesson_4.level_1;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Смотреть комментарии к Task_1, Task_2. В этом классе лучше использовать switch")
 class Task_3 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner (System.in);
         System.out.println("Enter wholeNumber range 1-7");
         int wholeNumber = scanner.nextInt();

         if(wholeNumber == 1)
         {
             System.out.println("Monday");
         }
         if(wholeNumber == 2)
         {
             System.out.println("Tuesday");
         }
         if(wholeNumber == 3)
         {
             System.out.println("Wednesday");
         }
         if(wholeNumber == 4)
         {
             System.out.println("Thursday");
         }
         if(wholeNumber == 5)
         {
             System.out.println("Friday");
         }
         if(wholeNumber == 6)
         {
             System.out.println("Saturday");
         }
         if(wholeNumber == 7)
         {
             System.out.println("Sunday");
         }


     }
}
