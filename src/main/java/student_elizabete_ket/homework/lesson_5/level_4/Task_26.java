package student_elizabete_ket.homework.lesson_5.level_4;

import teacher.annotations.CodeReview;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

@CodeReview(approved = true)
public class Task_26 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, give me array`s length:");
        int[] clientArray = new int[scanner.nextInt()];

        Random random = new Random();
        for (int i = 0; i < clientArray.length; i++) {
            clientArray[i] = random.nextInt(100);
            System.out.println("[" + i + "] = " + clientArray[i]);
        }
        System.out.println("Client array is " + Arrays.toString(clientArray));

    }

}
