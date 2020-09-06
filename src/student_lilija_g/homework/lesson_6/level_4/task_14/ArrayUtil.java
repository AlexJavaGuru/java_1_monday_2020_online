package student_lilija_g.homework.lesson_6.level_4.task_14;
/*
Task_14:
Добавьте в класс ArrayUtil метод для сортировки массива целых чисел.
Напишите автоматические тесты в классе ArrayUtilTest доказывающие,
что ваша реализацяия метода работает правильно.
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
