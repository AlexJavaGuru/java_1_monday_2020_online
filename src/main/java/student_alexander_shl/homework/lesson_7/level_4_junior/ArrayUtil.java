package student_alexander_shl.homework.lesson_7.level_4_junior;

import java.util.Arrays;

/*
Task_8:
Как научиться писать простые, понятные и маленькие методы?
Это можно сделать с помощью тренировки.
Возьмите одну из написанных вами программ, лучше самую сложную.

Поставьте перед собой цель - переписать код так, что бы длина
каждого метода в нём не привышала 10 строк кода. Перепишите код!

Если вам это удалось, то поставьте себе новую цель переписать код так,
что бы длина каждого метода в нём не привышала 5 строк кода. Перепишите код!

Убедитесь, что ваш код стал более читаемым и в нём будет проще разобраться.

Экстремальное задание не для всех :)
Длина каждого метода в нём не привышала 4 строки кода. Перепишите код!

Супер Экстрим задание не для всех :)
Длина каждого метода в нём не привышала 3 строки кода. Перепишите код!
 */

class ArrayUtil { // package student_alexander_shl.homework.lesson_6.level_3_4;

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

    public int[] arraySort(int[] array) { // lesson_6 level_4 Task_14
//        for (int i = 0; i < array.length; i++) {
//            int minValue = array[i];
//            int minTempValue = i;
//            for (int j = i+1; j < array.length; j++) {
//                if (array[j] < minValue) {
//                    minValue = array[j];
//                    minTempValue = j;
//                }
//            }
//            if (i != minTempValue) {
//                int tempValue = array[i];
//                array[i] = array[minTempValue];
//                array[minTempValue] = tempValue;
//            }
//        }
        Arrays.sort(array); // lesson_7 level_4_junior Task_8 - рефакторинг lesson_6 level_4 Task_14.
        return array;
    }
}
