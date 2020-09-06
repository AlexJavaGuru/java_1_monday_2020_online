package student_lilija_g.homework.lesson_5.level_6.task_35;
/*
Создайте в классе ArrayUtil метод для
распечатки массива целых чисел на консоль.

class ArrayUtil {

    public void printArrayToConsole(int[] array) {
        // Write implementation here !!!
    }

}
 */

import java.util.Random;

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
}
