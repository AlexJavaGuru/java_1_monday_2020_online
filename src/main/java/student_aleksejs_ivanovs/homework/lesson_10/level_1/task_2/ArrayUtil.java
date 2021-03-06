package student_aleksejs_ivanovs.homework.lesson_10.level_1.task_2;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
interface ArrayUtil {

    int[] createArray(int arrayLength);

    void fillArrayWithRandomNumbers(int[] array);

    void printArrayToConsole(int[] array);

    int findMaxNumber(int[] array);

    int findMinNumber(int[] array);

}
