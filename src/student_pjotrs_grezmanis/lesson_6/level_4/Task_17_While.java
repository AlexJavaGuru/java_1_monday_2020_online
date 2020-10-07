package student_pjotrs_grezmanis.lesson_6.level_4;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Не стоит писать конструкции в одну строку. Это очень трудно читать. Сделайте красивый if с фигурными скобками")
class Task_17_While {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 100) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
            i++;
        }
    }
}


