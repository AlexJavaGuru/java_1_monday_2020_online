package student_regina_svistunov.lesson_5.level_4;

import java.util.Arrays;
import java.util.Scanner;

public class Task_25 {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Please, enter array length: ");
            int arraysLength = scanner.nextInt();

            int[] userArrays = new int[arraysLength];

            for (int i=0; i< arraysLength; i++) {

                System.out.println("Please, enter array number: ");
                Scanner input;
                userArrays[i] = scanner.nextInt();
            }
            System.out.println("Your array is: ");
            System.out.println(Arrays.toString(userArrays));


    }
}
