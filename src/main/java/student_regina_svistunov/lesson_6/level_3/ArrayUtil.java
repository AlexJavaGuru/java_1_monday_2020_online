package student_regina_svistunov.lesson_6.level_3;

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
            for (int i = 0; i < array.length; i++) {
                if (array[i] > maxNumber) {
                    maxNumber = array[i];
                }
            }  return maxNumber;
        }
        public int findMinNumber (int[] array) {
            int minNumber = array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i] < minNumber) {
                    minNumber = array[i];
                }
            }
            return minNumber;
        }

    public int findNumber(int[] newArray, int findNumber) {
            int number = 0;
        for (int i=0; i<newArray.length; i++) {
            if (newArray[i] == findNumber) {
                number = newArray[i];
            } else {
                findNumber = findNumber;
            }
        }
        return number;
    }
    public int countNumber (int[] newArray, int countNumber) {
            int number =0;
            for (int i =0; i<newArray.length; i++) {
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




