package student_andris_tresutins.homework.lesson_6.level_3;

import java.util.Arrays;


class UtilArray {



     public String numberSearch ( int searchnum) {


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


    public int numberSearchMultiple (int searchnum) {

        int[] Array = new int[5];

        Array[0] = 54;
        Array[1] = 7;
        Array[2] = 54;
        Array[3] = 54;
        Array[4] = 458;


        int i;
        int foundnumcount = 0;
        boolean found = false;
        for (i = 0; i < Array.length; i++) {
            if (searchnum == Array[i]) {
                foundnumcount++;
                found = true;
            }
        }
        if (found) {
            return foundnumcount;
        } else {
            return 0;
        }
    }

        public int replaceNumber(int numberToReplace, int newNumber) {

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
                if (numberToReplace == Array[i])
                {

                    found = true;
                    break;
                }
            }
            if (found)
            {
                Array[i] = newNumber;
                return Array[i];
            }
            else
            {
                return 0;
            }

        }

    public String replaceAllNumbers(int numberToReplace, int newNumber) {

        int[] Array = new int[5];

        Array[0] = 12;
        Array[1] = 54;
        Array[2] = 54;
        Array[3] = 54;
        Array[4] = 458;


        int i;
        boolean found = false;
        for ( i = 0; i < Array.length; i++)
        {
            if (numberToReplace == Array[i])
            {
                Array[i] = newNumber;
                found = true;
            }
        }
        if (found)
        {
            return Arrays.toString(Array);
        }
        else
        {
            return "something went wrong :/";
        }

    }


    public String reverseArray() {

        int[] Array = {12, 13, 54, 14, 458};

        for(int i = 0; i < Array.length / 2; i++)
        {
            int arr = Array[i];
            Array[i] = Array[Array.length - i - 1];
            Array[Array.length - i - 1] = arr;
        }

        return Arrays.toString(Array);

    }


}





