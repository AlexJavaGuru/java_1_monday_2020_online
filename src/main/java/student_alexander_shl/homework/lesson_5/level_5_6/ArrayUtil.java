package student_alexander_shl.homework.lesson_5.level_5_6;
/*
================================ level_5 ===================================================
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
================================ level_6 ===================================================
Task_35:
Создайте в классе ArrayUtil метод для
распечатки массива целых чисел на консоль.

class ArrayUtil {

    public void printArrayToConsole(int[] array) {
        // Write implementation here !!!
    }

}

Task_36:
Создайте в классе ArrayUtil метод для
нахождения максимального числа в массиве целых чисел.

class ArrayUtil {

    public int findMaxNumber(int[] array) {
        // Write implementation here !!!
    }

}


Task_38:
 Создайте в классе ArrayUtil метод для
нахождения минимального числа в массиве целых чисел.

class ArrayUtil {

    public int findMinNumber(int[] array) {
        // Write implementation here !!!
    }

}

 */

import java.util.Random;

class ArrayUtil {

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    } // level_5 Task_31

    public void fillArrayWithRandomNumbers(int[] array) { // level_5 Task_33

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 3;
        }
    }

    public int sumArray(int[] array) { //  Метод написан для теста задачи Task_33
        int sumResult = 0;
        for (int i : array) {
            sumResult += i;
        }
        return sumResult;
    }

    public void printArrayToConsole(int[] array) { // level_6 Task_35
        System.out.println("\nYour array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }

    public int findMaxNumber(int[] array) { // level_6 Task_36
        int maxNumber = 0;
        for (int j : array) {
            if (maxNumber < j) {
                maxNumber = j;
            }
        }
        return maxNumber;
    }

    public int minNumber(int[] array) { // level_6 Task_38
        int minNumber = array[0];
        for (int j : array) {
            if (minNumber > j) {
                minNumber = j;
            }
        }
        return minNumber;
    }
}
