package student_arturs_arusanovs.lesson_5.level_2;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Вы не задаете числа случайно.")
class Task_12 {

    public static void main (String[] args){

        int[] numbers = new int[3];

        for (int i=0; i<numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
            System.out.println("[" + i + "]: " + numbers[i]);
        }
    }
}
