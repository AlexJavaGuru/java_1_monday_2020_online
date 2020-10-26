package student_aleksejs_ivanovs.homework.lesson_5.level_2;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Random;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Наверное только надо было сначала увеличить каждое значение на +2 а потом вывести на консоль все элементы. Как бы разделить операции")
class TaskFifteen {

    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
            System.out.println(numbers[i]);
        }
        System.out.println(" ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] + 2;
            System.out.println(numbers[i]);
        }

    }
}
