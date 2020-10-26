package student_artur_martinenko.homework.lesson_9.level_1_intern.task_7;

import teacher.annotations.CodeReview;

/*
Исправьте код класса PrivateClass так, что бы он компилировался.

private class PrivateClass {

    private String title;
    private String author;


}
 */
@CodeReview(approved = true)
class PrivateClass {    //have to remove 'private' access modifier.

    private String title;
    private String author;


}
