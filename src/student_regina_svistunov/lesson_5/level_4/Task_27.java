package student_regina_svistunov.lesson_5.level_4;

import teacher.annotations.CodeReview;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

@CodeReview(approved = true)
public class Task_27 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        System.out.println("Please, enter array length: ");
        int arraysLength = scanner.nextInt();

        int[] userArrays = new int[arraysLength];

        for (int i = 0; i < arraysLength; i++) {
            userArrays[i] = random.nextInt(100);
        }
        System.out.println("Random array is: ");
        System.out.println(Arrays.toString(userArrays));

        int maxNumber = userArrays[0];

        for (int i = 0; i < userArrays.length; i++) {
            if (userArrays[i] > maxNumber) {
                maxNumber = userArrays[i];
            }
        }
        System.out.println("Maximum number of array is: " + maxNumber);


    }

}
