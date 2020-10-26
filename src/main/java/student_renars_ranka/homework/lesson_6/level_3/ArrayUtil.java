package student_renars_ranka.homework.lesson_6.level_3;

import teacher.annotations.CodeReview;

import java.util.Random;

@CodeReview(approved = true)
class ArrayUtil {

    public int[] createArray(int arrayLength) {
        int[] resultArray = new int[arrayLength];
        return resultArray;
    }

    public void fillArrayWithRandomNubers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 5;
        }
    }

    public String convertArrayToString(int[] array) {
        String string = "{";
        for (int i = 0; i < array.length; i++) {
            string = string + array[i];
            if (i < array.length -1) {
                string = string + ",";
            }
        } return string + "}";
    }

    public boolean findNumber(int[] array, int numberForFind) {
        for (int i : array) {
            if (i == numberForFind) {
                return true;
            }
        } return false;
    }

}
