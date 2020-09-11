package student_andris_tresutins.homework.lesson_6.level_3;

import java.util.Random;

class UtilArray {



     public String numberSearch ( int searchnum) {

         Random randNum = new Random();

         int[] Array = new int[5];

         Array[0] = 12;
         Array[1] = 54;
         Array[2] = 3;
         Array[3] = 7;
         Array[4] = 458;


         int i;
         boolean found = false;
         for ( i = 0; i < Array.length; i++)
         {
             if (searchnum == Array[i])
             {
                 found = true;
                 break;
             }
         }
         if (found)
         {
             return "That number was found at index " + i;
         }
         else
         {
             return "That number was not found.";
         }

         }


     }




