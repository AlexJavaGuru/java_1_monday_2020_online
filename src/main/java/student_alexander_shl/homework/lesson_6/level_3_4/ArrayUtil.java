package student_alexander_shl.homework.lesson_6.level_3_4;
/*
level_3 Task_9:
Добавьте в класс ArrayUtil метод для проверки содержит
ли массив целых чисел указынное число.
Напишите автоматические тесты в классе ArrayUtilTest
доказывающие, что ваша реализацяия метода работает правильно.

level_3 Task_10:
Добавьте в класс ArrayUtil метод для проверки сколько
раз содержит массив целых чисел указынное число.
Напишите автоматические тесты в классе
ArrayUtilTest доказывающие,
что ваша реализацяия метода работает правильно.

level_3 Task_11:
Добавьте в класс ArrayUtil метод для замены
первого вхождения указанного числа в массиве целых чисел
на другое число.
Напишите автоматические тесты в классе ArrayUtilTest доказывающие,
что ваша реализацяия метода работает правильно.

Подсказка: void replace(int[] arr, int numberToReplace, int newNumber).

level_3 Task_12:
Добавьте в класс ArrayUtil метод для замены вхождений
указанного числа в массиве целых чисел на другое число.
Напишите автоматические тесты в классе ArrayUtilTest доказывающие,
 что ваша реализацяия метода работает правильно.

Подсказка: void replaceAll(int[] arr, int numberToReplace, int newNumber).

level_3 Task_13:
Добавьте в класс ArrayUtil метод для
переворота массива целых чисел.
Напишите автоматические тесты в классе ArrayUtilTest доказывающие, что ваша реализацяия метода работает правильно.

level_4 Task_14:
обавьте в класс ArrayUtil метод для сортировки массива целых чисел.
Напишите автоматические тесты в классе ArrayUtilTest доказывающие,
что ваша реализацяия метода работает правильно.
 */

class ArrayUtil {

    public boolean findNumber(int[] allNumbers, int number) { // Task_9
        for (int i : allNumbers) {
            if (i == number) {
                return true;
            }
        }
        return false;
    }

    public int howMachContainsNumberInArray(int[] allNumbers, int number) { // level_3 Task_10
        int howMach = 0;
        for (int i : allNumbers) {
            if (i == number) {
                howMach++;
            }
        }
        return howMach;
    }


    public void replace(int[] arr, int numberToReplace, int newNumber) { // level_3 Task_11
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                break;
            }
        }
    }

    public void replaceAll(int[] arr, int numberToReplace, int newNumber) { // level_3 Task_12
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
            }
        }
    }

    public int[] arrayRevers(int[] array) { // level_3 Task_13
        int j = 0;
        int[] resultArray = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            resultArray[j] = array[i];
            j++;
        }
        return resultArray;
    }

    public int[] arraySort(int[] array) { // level_4 Task_14
        for (int i = 0; i < array.length; i++) {
            int minValue = array[i];
            int minTempValue = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < minValue) {
                    minValue = array[j];
                    minTempValue = j;
                }
            }
            if (i != minTempValue) {
                int tempValue = array[i];
                array[i] = array[minTempValue];
                array[minTempValue] = tempValue;
            }
        }
        return array;
    }
}

