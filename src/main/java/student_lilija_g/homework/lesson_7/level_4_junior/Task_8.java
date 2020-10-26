package student_lilija_g.homework.lesson_7.level_4_junior;
/*
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

===========================================================================

package student_lilija_g.homework.lesson_6.level_4.task_14;

Task_14:
Добавьте в класс ArrayUtil метод для сортировки массива целых чисел.
Напишите автоматические тесты в классе ArrayUtilTest доказывающие,
что ваша реализацяия метода работает правильно.

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

    public void sortArray(int[] array) {

        for (int i = 0; i < array.length; i++) {

            int minNumber = array[i];
            int minTempNumber = i;

            for (int j = i+1; j < array.length; j++) {
                if (array[j] < minNumber) {
                    minNumber = array[j];
                    minTempNumber = j;
                }
            }

            if (i != minTempNumber) {
                int tempNumber = array[i];
                array[i] = array[minTempNumber];
                array[minTempNumber] = tempNumber;
            }
        }
    }
}
*/

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Random;
import java.util.Arrays;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Отлично")
class Task_8 {

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

//        StringBuilder myString = new StringBuilder("Array: {");
//        for (int i = 0; i < array.length; i++) {
//            myString.append(array[i]);
//            if (i < array.length - 1) {
//                myString.append(",");
//            } else {
//                myString.append("}");
//            }
//        }
//        System.out.println(myString);
        System.out.println(Arrays.toString(array));
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

    public void sortArray(int[] array) {
        Arrays.sort(array);
//
//        for (int i = 0; i < array.length; i++) {
//
//            int minNumber = array[i];
//            int minTempNumber = i;
//
//            for (int j = i+1; j < array.length; j++) {
//                if (array[j] < minNumber) {
//                    minNumber = array[j];
//                    minTempNumber = j;
//                }
//            }
//
//            if (i != minTempNumber) {
//                int tempNumber = array[i];
//                array[i] = array[minTempNumber];
//                array[minTempNumber] = tempNumber;
//            }
//        }
    }

    public static void main(String[] args) {

        Task_8 myTask_8 = new Task_8();
        int[] myArray = myTask_8.createArray(10);
        myTask_8.fillArrayWithRandomNumbers(myArray);
        myTask_8.printArrayToConsole(myArray);
        myTask_8.sortArray(myArray);
        myTask_8.printArrayToConsole(myArray);

    }
}
