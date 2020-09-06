package student_regina_svistunov.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_28 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        System.out.println("Please, enter array length: ");
        int arraysLength = scanner.nextInt();

        int[] userArrays = new int[arraysLength];

        for (int i=0; i< arraysLength; i++) {
            userArrays[i] = random.nextInt(100);
        }
        System.out.println("Random array is: ");
        System.out.println(Arrays.toString(userArrays));

        int minNumber = userArrays[0];

        for (int i = 0; i < userArrays.length; i++) {
            if (userArrays[i] < minNumber) {
                minNumber = userArrays[i];
            }
        }
        System.out.println("Fewer number of array is: " + minNumber);

    }
}

