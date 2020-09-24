package student_andris_tresutins.homework.lesson_5.level_5;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Arrays;
import java.util.Random;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Внес поправки по формату. Метод CreateArray можно сократить до одной строчки")
class ArrayUtil {

    public static void main(String[] args) {
        ArrayUtil victim = new ArrayUtil();
        System.out.println(victim.printArrayToConsole(5));

    }

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public int[] staticArray() {

        int[] array = {15, 24, 17, 99, 15};
        return array;
    }


    public int[] fillArray(int arrayLength) {

        Random randNum = new Random();

        int[] generatedArray = new int[arrayLength];

        for (int i = 0; i < generatedArray.length; i++) {
            generatedArray[i] = randNum.nextInt(100);
        }

        return generatedArray;


    }

    public String printArrayToConsole(int arrayLength) {

        ArrayUtil victim = new ArrayUtil();
        int[] print = victim.fillArray(arrayLength);
        return Arrays.toString(print);
    }

    public int findMaxNumber() {

        ArrayUtil victim = new ArrayUtil();
        int[] myIntArray = victim.staticArray();

        int max = myIntArray[1];
        for (int i = 0; i < myIntArray.length; i++) {
            if (myIntArray[i] > max) {
                max = myIntArray[i];
            }

        }
        return max;

    }

    public int findMinNumber() {

        ArrayUtil victim = new ArrayUtil();
        int[] myIntArray = victim.staticArray();

        int min = myIntArray[1];
        for (int i = 0; i < myIntArray.length; i++) {
            if (myIntArray[i] < min) {
                min = myIntArray[i];
            }

        }
        return min;

    }
}


