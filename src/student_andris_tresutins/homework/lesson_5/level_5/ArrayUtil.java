package student_andris_tresutins.homework.lesson_5.level_5;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Arrays;
import java.util.Random;

@CodeReview(approved = true)
class ArrayUtil {


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



}


