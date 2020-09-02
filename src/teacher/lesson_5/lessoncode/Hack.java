package teacher.lesson_5.lessoncode;

import java.util.Arrays;

public class Hack {

    public static void main(String[] args) {
        Hack myHack = new Hack();

        int[] numbers = myHack.createEmptyArray(5);

        myHack.fillArrayWithNumbers(numbers);

        System.out.println(Arrays.toString(numbers));
    }

    public int[] createEmptyArray(int size) {
        int[] array = new int[size];
        return array;
    }

    public void fillArrayWithNumbers(int[] inputArray) {
        inputArray[0] = 10;
        inputArray[1] = 20;
        inputArray[2] = 30;
        inputArray[3] = 40;
        inputArray[4] = 50;
    }

}
