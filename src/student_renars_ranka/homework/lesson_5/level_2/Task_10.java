package student_renars_ranka.homework.lesson_5.level_2;

import java.lang.reflect.Array;
import java.util.Arrays;

class Task_10 {
}

class ArraysOfIntOne {

    public static void main(String[] args) {
        ArraysOfIntOne arraysOfInt = new ArraysOfIntOne();

        int[] myFirstArray = new int[3];

        for (int i = 0; i < myFirstArray.length; i++){
            myFirstArray[i] = (int) (Math.random() * 50);
        }
        System.out.println(Arrays.toString(myFirstArray));
    }
}
