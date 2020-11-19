package student_andris_tresutins.homework.lesson_6.level_3;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Arrays;

@CodeReview(approved = false)
@CodeReviewComment(comment = "replaceAllNumbers - зачем у вас массив array123? У вас проблемы в методах: replaceNumber, replaceAllNumbers, reverseArray, sortArray" +
        "Зачем вы создаете там какие-то объекты victim? Эти методы должны работать с ходными аргументами, а не создавать массивы внутри себя. ")

class UtilArray {


    public int[] arrayOne (){
        int[] array = {12, 54, 3, 7, 458};
        return array;
    }

    public int[] arrayDupes (){
        int[] array = {54, 54, 3, 54, 458};
        return array;
    }

    public String numberSearch(int[] array, int searchNum) {

        int i;
        boolean found = false;
        for (i = 0; i < array.length; i++) {
            if (searchNum == array[i]) {
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


    public int numberSearchMultiple(int[] array, int searchNum) {

        int i;
        int foundNumCount = 0;
        boolean found = false;
        for (i = 0; i < array.length; i++) {
            if (searchNum == array[i]) {
                foundNumCount++;
                found = true;
            }
        }
        if (found) {
            return foundNumCount;
        } else {
            return 0;
        }
    }

    public int replaceNumber(int[] array, int numberToReplace, int newNumber) {

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

    public int[] replaceAllNumbers(int[] array, int numberToReplace, int newNumber) {


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
            return null;
        }

    }


    public int[] reverseArray(int[] array) {


        for (int i = 0; i < array.length / 2; i++) {
            int arr = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = arr;
        }

        return array;

    }

    public int[] sortArray(int[] array) {

        Arrays.sort(array);
        return array;

    }


}





