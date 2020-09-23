package student_pjotrs_grezmanis.lesson_5.level_4;

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class Task_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array lenght: ");
        int size = scanner.nextInt();
        int array[] = new int[size];
        System.out.println("Insert array elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Inserted array elements:");
        for (int i = 0; i < size; i++) {
            System.out.println(" " + array[i]);
        }

    }
}
