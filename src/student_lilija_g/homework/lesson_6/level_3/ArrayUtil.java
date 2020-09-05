package student_lilija_g.homework.lesson_6.level_3;
/*
Task_9:
Добавьте в класс ArrayUtil метод для проверки содержит ли массив целых чисел указынное число.
Напишите автоматические тесты в классе ArrayUtilTest доказывающие, что ваша реализацяия метода работает правильно.

Task_10:
Добавьте в класс ArrayUtil метод для проверки сколько раз содержит массив целых чисел указынное число.
Напишите автоматические тесты в классе ArrayUtilTest доказывающие, что ваша реализацяия метода работает правильно.

Task_11
Добавьте в класс ArrayUtil метод для замены первого вхождения указанного числа в массиве целых чисел на другое число.
Напишите автоматические тесты в классе ArrayUtilTest доказывающие, что ваша реализацяия метода работает правильно.
Подсказка: void replace(int[] arr, int numberToReplace, int newNumber).

Task_12
Добавьте в класс ArrayUtil метод для замены вхождений указанного числа в массиве целых чисел на другое число.
Напишите автоматические тесты в классе ArrayUtilTest доказывающие, что ваша реализацяия метода работает правильно.
Подсказка: void replaceAll(int[] arr, int numberToReplace, int newNumber).

Task_13
Добавьте в класс ArrayUtil метод для переворота массива целых чисел.
Напишите автоматические тесты в классе ArrayUtilTest доказывающие, что ваша реализацяия метода работает правильно.
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

    public int findMaxNumber(int[] array) {
        int maxNumber = array[0];
        for (int i : array) {
            if (i > maxNumber) {
                maxNumber = i;
            }
        }
        return maxNumber;
    }

    public int findMinNumber(int[] array) {
        int minNumber = array[0];
        for (int i : array) {
            if (i < minNumber) {
                minNumber = i;
            }
        }
        return minNumber;
    }

    public boolean findNumber(int[] array, int numberForFind) {
        for (int i : array) {
            if (i == numberForFind) {
                return true;
            }
        }
        return false;
    }

    public int howManyContains(int[] array, int numberForFind) {
        int j = 0;
        for (int i : array) {
            if (i == numberForFind) {
                j++;
            }
        }
        return j;
    }

    public int replace(int[] array, int numberToReplace, int newNumber) {
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                if (j == 0) {
                    array[i] = newNumber; // Меняем только первое встреченное число
                    j++;
                }
            }

        }

        return j;

    }

    public int replaceAll(int[] array, int numberToReplace, int newNumber) {
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
                j++;
            }
        }

        return j;

    }

    public int[] reversArray(int[] array) {

        int j = 0;
        int[] myReversArray = new int[array.length];

        for (int i = array.length - 1; i >= 0; i--) {
            myReversArray[j] = array[i];
            j++;
        }
        return myReversArray;
    }

    public int returnNumberForIndex(int[] array, int index) { // Для теста reversArray
        return array[index];
    }

}

