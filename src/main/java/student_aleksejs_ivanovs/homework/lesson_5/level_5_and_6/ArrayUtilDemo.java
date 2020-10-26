package student_aleksejs_ivanovs.homework.lesson_5.level_5_and_6;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class ArrayUtilDemo {

    public static void main(String[] args) {
        ArrayUtil array = new ArrayUtil();
        int arrayLength = 8;
        int[] newArray = array.createArray(arrayLength);
        array.fillArrayWithRandomNumbers(newArray);
        array.printArrayToConsole(newArray);

        int max = array.findMaxNumber(newArray);
        System.out.print("\nMax = " + max);

        int min = array.findMinNumber(newArray);
        System.out.print("\nMin = " + min);
    }

}
