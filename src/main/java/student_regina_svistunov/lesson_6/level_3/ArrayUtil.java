package student_regina_svistunov.lesson_6.level_3;

//Task_9
//        Добавьте в класс ArrayUtil метод для проверки содержит
//        ли массив целых чисел указынное число.
//        Напишите автоматические тесты в классе ArrayUtilTest
//        доказывающие, что ваша реализацяия метода работает правильно.
//Task_10
//        Добавьте в класс ArrayUtil метод для проверки сколько
//        раз содержит массив целых чисел указынное число.
//        Напишите автоматические тесты в классе
//        ArrayUtilTest доказывающие,
//        что ваша реализацяия метода работает правильно.
//Task_11
//        Добавьте в класс ArrayUtil метод для замены
//        первого вхождения указанного числа в массиве целых чисел
//        на другое число.
//        Напишите автоматические тесты в классе ArrayUtilTest доказывающие,
//        что ваша реализацяия метода работает правильно.
//        Подсказка: void replace(int[] arr, int numberToReplace, int newNumber).
//Task_12
//        Добавьте в класс ArrayUtil метод для замены вхождений
//        указанного числа в массиве целых чисел на другое число.
//        Напишите автоматические тесты в классе ArrayUtilTest доказывающие,
//        что ваша реализацяия метода работает правильно.
//        Подсказка: void replaceAll(int[] arr, int numberToReplace, int newNumber).
//Task_13
//        Добавьте в класс ArrayUtil метод для
//        переворота массива целых чисел.
//        Напишите автоматические тесты в классе ArrayUtilTest доказывающие,
//        что ваша реализацяия метода работает правильно.


import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Random;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Знакомую ошибку вижу - findNumber = findNumber; точно не списали эти ошибки с кого-то? =) Надо исправить. Это строка не делает ничего. Весь блок else в том месте - лишний")
public class ArrayUtil {

        public int[] createArray(int arrayLength) {
            return new int[arrayLength];
        }

        public void fillArrayWithRandomNumbers(int[] array) {
            Random random = new Random();
            for (int i=0; i < array.length; i++) {
                array[i] = random.nextInt(50);
            }
        }
        public int findMaxNumber(int[] array) {
            int maxNumber = array[0];
            for (int i : array) {
                int j = array[i];
                if (j > maxNumber) {
                    maxNumber = j;
                }
            }
            return maxNumber;
        }
        public int findMinNumber (int[] array) {
            int minNumber = array[0];
            for (int i : array) {
                if (array[i] < minNumber) {
                    minNumber = array[i];
                }
            }
            return minNumber;
        }

    public boolean findNumber(int[] newArray, int findNumber) {
        for (int i : newArray) {
            if (i == findNumber) {
                return true;
            }
        }
        return false;
    }
    public int countNumber (int[] newArray, int countNumber) {
            int number =0;
            for (int i : newArray) {
                if (newArray[i] == countNumber) {
                    number++;
                }
            }
            return number;
    }

    public int replace(int[] array, int numberToReplace, int newNumber) {
            int number = 0;
            for (int i=0; i<array.length; i++) {
                if (array[i] == numberToReplace) {
                    array[i] = newNumber;
                    number = i;
                    i = array.length;
                }
            }
            return number;
    }
    public int replaceAll(int[] array, int numberToReplace, int newNumber) {
            int number = 0;
            for (int i=0; i<array.length; i++) {
                if (array[i] == numberToReplace) {
                    array[i] = newNumber;
                    number++;
                }
            }
            return number;
    }
    public int[] reverse(int[] array) {
            int number;
            for(int i=0; i<array.length; i++) {
                number = array[array.length -1 - i];
                array[i] = number;
            }
            return array;
    }
    }




