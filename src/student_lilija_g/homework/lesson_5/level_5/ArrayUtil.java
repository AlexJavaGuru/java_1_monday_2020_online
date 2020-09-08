package student_lilija_g.homework.lesson_5.level_5;
/*
Task_31:
Создайте класс ArrayUtil.
Создайте в этом классе метод для создания
массива целых чисел указанной длины.

class ArrayUtil {

    public int[] createArray(int arrayLength) {
        // Write implementation here !!!
    }

}

Task_33:
Создайте в классе ArrayUtil метод для
заполнения массива целых чисел случайными числами.

class ArrayUtil {

    public void fillArrayWithRandomNumbers(int[] array) {
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
//        for (int i = 0; i < array.length; i++) {
//            resultSum +=array[i];
//        }
        for (int i : array) {
            resultSum += i;
        }
        return resultSum;
    }
}
