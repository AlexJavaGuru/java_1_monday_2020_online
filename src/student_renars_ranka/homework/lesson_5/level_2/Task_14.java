package student_renars_ranka.homework.lesson_5.level_2;

import java.util.Arrays;

public class Task_14 {
}
class ArraysOfIntFive {

    public static void main(String[] args) {
        ArraysOfIntFive arraysOfInt = new ArraysOfIntFive();

        int[] myFirstArray = new int[3];

        for (int i = 0; i < myFirstArray.length; i++){
            myFirstArray[i] = (int) (Math.random() * 50);
        }
        int sum = 0;
        for (int i : myFirstArray) {
            sum += i;
        }
        System.out.println(Arrays.toString(myFirstArray));
        System.out.println("Average of Arrays is = " + sum / myFirstArray.length);
    }
}
