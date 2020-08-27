package student_artur_martinenko.homework.lesson_5.level_2;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Хорошо, но можно было бы разбить задачи в методы. Создать массив - один метод, заполнить массив - другой и т.д. ")
class Task_10 {

    public static void main(String[] args) {
        int[] regularArray = new int[3];

        for (int i = 0; i < regularArray.length; i++) {
            regularArray[i] = (int) (Math.random() * 10);
        }

        for (int i : regularArray) {
            System.out.println(i);
        }
    }
}
