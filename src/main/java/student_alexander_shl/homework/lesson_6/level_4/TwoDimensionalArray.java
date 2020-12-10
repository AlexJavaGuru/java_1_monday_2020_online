package student_alexander_shl.homework.lesson_6.level_4;

import java.util.Random;

/*
Task_18:
Как объявить двумерный массив?
Найти в интернете и написать пример кода в котором:
- создать класс TwoDimensionalArray,
- создать метод для заполнения массива случайными числами,
- создать метод для подсчёта суммы всех чисел в массиве.

Создать класс TwoDimensionalArrayTest и написать
автоматические тесты для метода подсчёта суммы всех
чисел в массиве.
 */
class TwoDimensionalArray {

    public int[][] createArray(int lengthOneFromUser, int lengthTwoFromUser) {
        return new int[lengthOneFromUser][lengthTwoFromUser];
    }

    public void arrayFillWithRandomNumbers(int[][] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = random.nextInt(100);
            }
        }
    }

    public int sumArrayNumbers(int[][] array) {
        int result = 0;
        for (int[] ints : array) {
            for (int j = 0; j < array[0].length; j++) {
                result = result + ints[j];
            }
        }
        return result;
    }
}
