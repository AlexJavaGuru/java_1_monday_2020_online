package student_lilija_g.homework.lesson_5.level_6.task_36;
/*
Создайте в классе ArrayUtil метод для
нахождения максимального числа в массиве целых чисел.

class ArrayUtil {

    public int findMaxNumber(int[] array) {
        // Write implementation here !!!
    }
}
 */

import teacher.annotations.CodeReview;

import java.util.Random;

@CodeReview(approved = true)
class ArrayUtil {
    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 5;
        }
    }

    public int sumArray(int[] array) {

        int resultSum = 0;
        for (int i : array) {
            resultSum += i;
        }
        return resultSum;
    }

    public void printArrayToConsole(int[] array) {

        StringBuilder myString = new StringBuilder("Array: {");
        for (int i = 0; i < array.length; i++) {
            myString.append(array[i]);
            if (i < array.length - 1) {
                myString.append(",");
            } else {
                myString.append("}");
            }
        }
        System.out.println(myString);
    }

    public int findMaxNumber(int[] array) {
        int maxNumber = array[0];
        for (int i : array) {
            if (i > maxNumber) {
                maxNumber = i;
            }
        }
        return maxNumber;
    }
}
