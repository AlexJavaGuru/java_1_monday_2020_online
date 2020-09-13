package student_aleksejs_ivanovs.homework.lesson_5.level_2;

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class TaskEleven {

    public static void main(String[] args) {
        System.out.println("Enter three integers!");
        Scanner num = new Scanner(System.in);

        int[] numbers = new int[3];
        numbers[0] = num.nextInt();
        numbers[1] = num.nextInt();
        numbers[2] = num.nextInt();

        System.out.println(numbers[0] + "\n" + numbers[1] + "\n" + numbers[2]);
    }
}
