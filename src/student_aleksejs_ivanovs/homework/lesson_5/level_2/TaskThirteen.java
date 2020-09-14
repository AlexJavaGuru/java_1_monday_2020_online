package student_aleksejs_ivanovs.homework.lesson_5.level_2;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Random;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Сделайте так, чтобы программа не зависила от размерности массива. Чтобы если я подставил там int[10], весь код бы работал правильным образом без изменений.")
class TaskThirteen {

    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[3];
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
            sum += numbers[i];
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\nSum of array cells = " + sum);
    }
}
