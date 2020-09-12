package student_andris_tresutins.homework.lesson_5.level_5;

import java.util.Arrays;
import java.util.Random;

public class ArrayUtil {

    public int[] createArray(int arrayLength) {

        int[] generatedArray = new int[arrayLength];

        return generatedArray;
    }


    public int[] fillArray (int arrayLength) {

        Random randNum = new Random();

        int[] generatedArray = new int[arrayLength];

        for ( int i = 0 ; i < generatedArray.length ; i++ ) {
            generatedArray[i] = randNum.nextInt(100);
        }

        return generatedArray;


        }


    }


