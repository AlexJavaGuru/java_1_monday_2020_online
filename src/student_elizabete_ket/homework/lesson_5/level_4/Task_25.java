package student_elizabete_ket.homework.lesson_5.level_4;

import java.util.Arrays;
import java.util.Scanner;

class Task_25 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, give me length of the array:");
        int[] clientArray = new int[scanner.nextInt()];

        for (int i = 0; i < clientArray.length; i++){
            System.out.println("Please, enter array`s number: ");
            clientArray[i] = scanner.nextInt();

        }
        System.out.println("Client arrays is " + Arrays.toString(clientArray));
    }
}
