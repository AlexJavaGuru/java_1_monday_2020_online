package student_artur_martinenko.homework.lesson_8.level_2_intern.task_6;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Можно было бы использовать иерархическое наследование. Father от Mather, Child от Mather")
class Child extends Mother {   //multiple inheritance is forbidden in Java, only one.
}
