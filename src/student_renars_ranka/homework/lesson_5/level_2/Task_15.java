package student_renars_ranka.homework.lesson_5.level_2;

import java.util.Arrays;

public class Task_15 {
}
class ArraysOfIntSix {

    public static void main(String[] args) {
        ArraysOfIntSix arraysOfInt = new ArraysOfIntSix();

        int[] myFirstArray = new int[3];

        for (int i = 0; i < myFirstArray.length; i++){
            myFirstArray[i] = (int) (Math.random() * 50);
        }
        System.out.println(Arrays.toString(myFirstArray));

        for (int i = 0; i < myFirstArray.length; i++) {
            myFirstArray[i] +=2;
        }
        System.out.println(Arrays.toString(myFirstArray));
    }
}