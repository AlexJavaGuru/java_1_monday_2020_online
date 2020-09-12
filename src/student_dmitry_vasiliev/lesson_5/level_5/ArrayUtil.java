package student_dmitry_vasiliev.lesson_5.level_5;

import java.lang.reflect.Array;
import java.util.Random;

class ArrayUtil {

    public int[] createArray(int arrayLength) {
        int[] newArray = new int[arrayLength];
        return  newArray;
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
        array[i] = random.nextInt(50);
        }
    }

    public void printArrayToConsole(int[] array) {
        for (int i = 0; i < array.length; i++) {
        System.out.println(array[i]);
        }
    }

    public void printArrayToConsoleString(int[] array) {
        String str = "{";
        for (int i = 0; i < array.length; i++) {
            str = str + array[i];
            if (i < array.length - 1) {
                str = str + ",";
            }
        }
        System.out.println("Array is: " + str + "}");

    }

    public void findMaxNumberPrint(int[] array) {
        int maxNumber = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
            } else {
                maxNumber = maxNumber;
            }
        }
        System.out.println("Max number of array is " + maxNumber + ".");
    }

    public int findMaxNumberReturn(int[] array) {
        int maxNumber = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
            } else {
                maxNumber = maxNumber;
            }
        }
        return maxNumber;
    }
    
}
