package student_andris_tresutins.homework.lesson_10.level_1;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public interface ArrayUtil {

     int[] createArray(int arrayLength);
     void fillArrayWithRandomNumbers(int[] array);
     void printArrayToConsole(int[] array);
     int findMaxNumber(int[] array);
     int findMinNumber(int[] array);
}
