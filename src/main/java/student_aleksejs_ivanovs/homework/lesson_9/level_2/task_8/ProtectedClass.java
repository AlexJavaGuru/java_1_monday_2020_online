package student_aleksejs_ivanovs.homework.lesson_9.level_2.task_8;

/*Исправьте код класса ProtectedClass так, что бы он компилировался.

protected class ProtectedClass {

    private String title;
    private String author;


}

Как вы думаете, почему protected классы создавать нельзя?
Напиши свой ответ в коментарии над исправленным кодом.*/

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class ProtectedClass {

    //You cannot use a 'protected' access operator because it will not be visible to Java Virtual Machine

    private String title;
    private String author;

}
