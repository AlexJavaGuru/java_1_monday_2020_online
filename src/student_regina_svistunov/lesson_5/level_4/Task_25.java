package student_regina_svistunov.lesson_5.level_4;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Arrays;
import java.util.Scanner;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Регина, в каждом классе я исправляю вам формат...надо будет на занятии с вами обсудить")
public class Task_25 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter array length: ");
        int arraysLength = scanner.nextInt();

        int[] userArrays = new int[arraysLength];

        for (int i = 0; i < arraysLength; i++) {

            System.out.println("Please, enter array number: ");
            Scanner input;
            userArrays[i] = scanner.nextInt();
        }
        System.out.println("Your array is: ");
        System.out.println(Arrays.toString(userArrays));


    }
}
