package student_andris_tresutins.homework.lesson_5.level_2;

import java.util.Arrays;
import java.util.Random;

public class Task_14 {

    public static void main(String[] args) {
        Random randInt = new Random();

        int[] wholenumbers = new int[3];

        int num1 = randInt.nextInt(100);
        int num2 = randInt.nextInt(100);
        int num3 = randInt.nextInt(100);

        wholenumbers[0] = num1;
        wholenumbers[1] = num2;
        wholenumbers[2] = num3;

        System.out.println(Arrays.toString(wholenumbers));

        int arraySum =  wholenumbers[0] + wholenumbers[1] + wholenumbers[2];
        int arrayAvg = arraySum / 3;

        System.out.println("Array value average: " + arrayAvg);
    }

}
