package student_artur_martinenko.homework.lesson_5.level_4;

import student_artur_martinenko.homework.lesson_5.level_5.ArrayUtil;

import java.util.Arrays;

class Task_27 {

    public static void main(String[] args) {

        int[] myArray = new int[14];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * Math.pow((Math.random() * 10), 3));
        }
        System.out.println(Arrays.toString(myArray));

//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < myArray.length; i++) {
//            int temp = myArray[i];
//            if (max < temp) {
//                max = temp;
//            }
//        }

        ArrayUtil arrayUtil = new ArrayUtil();
        int max = arrayUtil.findMaxNumber(myArray);

        System.out.println("\nMaximum number from array is " + max);

    }

}
