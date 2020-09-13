package student_aleksejs_ivanovs.homework.lesson_5.level_2;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Сделайте так, чтобы программа не зависила от размерности массива. Чтобы если я подставил там int[10], весь код бы работал правильным образом без изменений.")
class TaskTen {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        System.out.println(numbers[0] + "\n" + numbers[1] + "\n" + numbers[2]);
    }
}
