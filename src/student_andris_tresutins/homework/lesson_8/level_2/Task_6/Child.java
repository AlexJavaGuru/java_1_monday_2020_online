package student_andris_tresutins.homework.lesson_8.level_2.Task_6;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Не стоилос создавать внутреннй класс для решения. Это только усложняет код. У вас два ребёнка, один без отца, другой без матери." +
        "Чтобы решить эту задачу, можно унаследовать мать от отца а сына от матери.")
public class Child extends Mother {

        class Child2 extends Father {

        }
}

