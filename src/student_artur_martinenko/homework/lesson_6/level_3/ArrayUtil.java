package student_artur_martinenko.homework.lesson_6.level_3;

import java.util.ArrayList;
import java.util.Arrays;

class ArrayUtil {

    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] tempArr = {-876, 2, 3, 1, -876, 5, 6, -876, 8, 9};
        arrayUtil.sortArrayAscending(tempArr);
        System.out.println(Arrays.toString(tempArr));

    }

    public void sortArrayAscending(int[] array) {  //lesson_6 (Task_14)
        int tempInt;
        //comparing int i with all other elements (j (i+1)j < array.length) from the array
        for (int i = 0; i < array.length; i++) {
//            System.out.println("i");
            for (int j = i + 1; j < array.length; j++) {
//                System.out.println("j");  //one number i will be compared with all other elements from array
                if (array[i] > array[j]) {  //checking whether j (i+1) is less then i.
                    tempInt = array[i];     //temporarily holding i value
                    array[i] = array[j];    //swapping the values
                    array[j] = tempInt;     //assigning j to higher value
                }
            }
        }
    }

    public void reverseArray(int[] array) {  //lesson_6 (Task_13)
        int[] tempArr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            tempArr[i] = array[i];
        }
        int arrIndex = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            array[arrIndex] = tempArr[i];
            arrIndex++;
        }
    }

    public void replaceAll(int[] arr, int numberToReplace, int newNumber) {  //lesson_6 (Task_12)
        if (isInArray(arr, numberToReplace)) {
            for (int i = 0; i < arr.length; i++) {
                if (numberToReplace == arr[i]) {
                    arr[i] = newNumber;
                }
            }
        }
    }

    public void replace(int[] arr, int numberToReplace, int newNumber) {  //lesson_6 (Task_11)
        if (isInArray(arr, numberToReplace)) {
            for (int i = 0; i < arr.length; i++) {
                if (numberToReplace == arr[i]) {
                    arr[i] = newNumber;
                    break;
                }
            }
        }
    }


    public int isTimesInArray(int[] array, int number) {  //lesson_6 (Task_10)
        int count = 0;
        for (int i : array) {
            if (number == i) {
                count++;
            }
        }
        return count;
    }

    public boolean isInArray(int[] array, int number) {  //lesson_6 (Task_9)
        for (int i : array) {
            if (number == i) {
                return true;
            }
        }
        return false;
    }

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 103);
        }
    }

    public void printArrayToConsole(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public int findMaxNumber(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i : array) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }

    public int findMinNumber(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i : array) {
            if (min > i) {
                min = i;
            }
        }
        return min;
    }

    public ArrayList<Integer> findEvenNumber(int[] array) {
        ArrayList<Integer> evenNumberArray = new ArrayList<>();
        for (int i : array) {
            if (i % 2 == 0 && i != 0) {
                evenNumberArray.add(i);
            }
        }
        return evenNumberArray;
    }

    public ArrayList<Integer> findOddNumber(int[] array) {
        ArrayList<Integer> oddNumberArray = new ArrayList<>();
        for (int i : array) {
            if (i % 2 != 0) {
                oddNumberArray.add(i);
            }
        }
        return oddNumberArray;
    }


}
