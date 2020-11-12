package student_andris_tresutins.homework.lesson_14.level_1;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
@FunctionalInterface
public interface FruitSearchCriteria {
    boolean test(Apple apple);
}
