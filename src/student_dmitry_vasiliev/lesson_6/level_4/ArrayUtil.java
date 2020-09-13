package student_dmitry_vasiliev.lesson_6.level_4;

//import java.lang.reflect.Array;
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

    public void findMinNumberPrint(int[] array) {
        int maxNumber = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
            } else {
                maxNumber = maxNumber;
            }
        }
        int minNumber = maxNumber;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minNumber) {
                minNumber = array[i];
            } else {
                minNumber = minNumber;
            }
        }
        System.out.println("Min number of array is " + minNumber + ".");
    }

    public int findMinNumberReturn(int[] array) {
        int maxNumber = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
            } else {
                maxNumber = maxNumber;
            }
        }
        int minNumber = maxNumber;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minNumber) {
                minNumber = array[i];
            } else {
                minNumber = minNumber;
            }
        }
        return minNumber;
    }

    public void findSelectedNumberPrint(int[] array, int selectedNumber) {
        int number = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == selectedNumber) {
                number = array[i];
            } else {
                selectedNumber = selectedNumber;
            }
        }
        if (number == selectedNumber) {
            System.out.println("Array contains the selected number " + selectedNumber + ".");
        } else {
            System.out.println("Array does not contain the selected number " + selectedNumber + ".");
        }

    }

        public int findSelectedNumberReturn(int[] array, int selectedNumber) {
            int number = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == selectedNumber) {
                    number = array[i];
                } else {
                    selectedNumber = selectedNumber;
                }
            }
            return number;

        }

        public int counterSelectedNumber(int[] array, int selectedNumber) {
            int number = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == selectedNumber) {
                    number++;
                } else {
                    selectedNumber = selectedNumber;
                }
            }
            return number;

        }

        public int changeFirstSelectedNumber(int[] array, int selectedNumber, int newNumber) {
            int number = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == selectedNumber) {
                    array[i] = newNumber;
                    number = i;
                    i = array.length;
                } else {
                    selectedNumber = selectedNumber;
                }
            }
            return number;
        }

        public int changeAllSelectedNumber(int[] array, int selectedNumber, int newNumber) {
            int number = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == selectedNumber) {
                    array[i] = newNumber;
                    number++;
                } else {
                    selectedNumber = selectedNumber;
                }
                System.out.print( array[i] + " ");
            }
            return number;
        }

        public int arrayRotate(int[] array) {
            int number = 0;
            int k = array.length - 1;
            int[] newArray = new int[array.length];
            System.out.print("Old array - ");
            for (int i = 0; i < array.length; i++) {
                newArray[k] = array[i];
                k--;
                number++;
                System.out.print( array[i] + " ");
            }
            System.out.print("; New array - ");
            for (int i = 0; i < newArray.length; i++) {
                System.out.print( newArray[i] + " ");
            }
            return number;
        }

        public int arraySortMinMax(int[] array) {
            int maxNumber = 0;
            int value = 0;
            int nextNum = array.length - 1;
            int[] newArray = new int[array.length];

            System.out.print("Old array - ");
            for (int i = 0; i < array.length; i++) {
                System.out.print( array[i] + " ");
            }

            for (int i = 0; i < array.length; i++) {
                for (int k = 0; k < array.length; k++) {
                    if (array[k] > maxNumber) {
                        maxNumber = array[k];
                        value = k;
                    } else {
                        maxNumber = maxNumber;
                        }
                }
                newArray[nextNum] = maxNumber;
                nextNum--;
                maxNumber = 0;
                array[value] = 0;
            }
            System.out.print("; New array - ");
            for (int i = 0; i < newArray.length; i++) {
                System.out.print( newArray[i] + " ");
            }
            return newArray[0];
        }
}

