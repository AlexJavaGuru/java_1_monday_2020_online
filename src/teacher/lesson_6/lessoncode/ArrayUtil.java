package teacher.lesson_6.lessoncode;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class ArrayUtil {

    public int[] createArray(int arrayLength) {
        int[] resultArray = new int[arrayLength];
        return resultArray;
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
        }
    }

    public String convertArrayToString(int[] array) {
        String str = "{";
        for (int i = 0; i < array.length; i++) {
            str = str + array[i];
            if (i < array.length - 1) {
                str = str + ",";
            }
        }
        return str + "}";
    }

    public int[] createArrayWithLengthFromUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int arrayLenth = sc.nextInt();
        return createArray(arrayLenth);
    }

}
