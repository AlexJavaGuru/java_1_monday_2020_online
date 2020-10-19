package student_lilija_g.homework.lesson_9.level_2_intern.task_8;

import teacher.annotations.CodeReview;

/*
Исправьте код класса ProtectedClass так, что бы он компилировался.

protected class ProtectedClass {

    private String title;
    private String author;

}

Как вы думаете, почему protected классы создавать нельзя?
Напиши свой ответ в коментарии над исправленным кодом.
 */
@CodeReview(approved = true)
class ProtectedClass { // если объявить класс, как "protected class ProtectedClass", то он будет невидимым JVM, вызывая ошибку.

    private String title;
    private String author;

}
