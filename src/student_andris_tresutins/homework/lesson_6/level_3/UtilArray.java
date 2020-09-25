package student_andris_tresutins.homework.lesson_6.level_3;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Arrays;

@CodeReview(approved = false)
@CodeReviewComment(comment = "searchnum, foundnumcount - no camelCase style. Methods numberSearch(), numberSearchMultiple() are not used from tests...")
class UtilArray {

    public int[] arrayOne (){
        int[] array = {12, 54, 3, 7, 458};
        return array;
    }

    public int[] arraydupes (){
        int[] array = {54, 54, 3, 54, 458};
        return array;
    }

    public String numberSearch(int[] array, int searchnum) {

        int i;
        boolean found = false;
        for (i = 0; i < array.length; i++) {
            if (searchnum == array[i]) {
                found = true;
                break;
            }
        }
        if (found) {
            return "That number was found at index " + i;
        } else {
            return "That number was not found.";
        }

    }


    public int numberSearchMultiple(int[] array, int searchnum) {

        int i;
        int foundnumcount = 0;
        boolean found = false;
        for (i = 0; i < array.length; i++) {
            if (searchnum == array[i]) {
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

        UtilArray victim = new UtilArray();
        int[] array = victim.arrayOne();


        int i;
        boolean found = false;
        for (i = 0; i < array.length; i++) {
            if (numberToReplace == array[i]) {

                found = true;
                break;
            }
        }
        if (found) {
            array[i] = newNumber;
            return array[i];
        } else {
            return 0;
        }

    }

    public int[] replaceAllNumbers(int numberToReplace, int newNumber) {

        UtilArray victim = new UtilArray();
        int[] array = victim.arraydupes();
        int[] array123 = {0,0,0,0,0};


        int i;
        boolean found = false;
        for (i = 0; i < array.length; i++) {
            if (numberToReplace == array[i]) {
                array[i] = newNumber;
                found = true;
            }
        }
        if (found) {
            return array;
        } else {
            return array123;
        }

    }


    public int[] reverseArray() {

        UtilArray victim = new UtilArray();
        int[] array = victim.arrayOne();

        for (int i = 0; i < array.length / 2; i++) {
            int arr = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = arr;
        }

        return array;

    }

    public int[] sortArray() {

        UtilArray victim = new UtilArray();
        int[] array = victim.arrayOne();

        Arrays.sort(array);
        return array;

    }


}





