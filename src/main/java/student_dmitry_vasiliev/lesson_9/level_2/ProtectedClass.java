package student_dmitry_vasiliev.lesson_9.level_2;

import teacher.annotations.CodeReview;

// - Task_8
//    Исправьте код класса ProtectedClass так, что бы он компилировался.
//    Как вы думаете, почему protected классы создавать нельзя?
//    Напиши свой ответ в коментарии над исправленным кодом.
//  Ответ: модификатор protected можно использовать только для методов, переменных
//  и конструкторов (за исключением интерфейсов), для исключения их использования
//  неродственными классами.
@CodeReview(approved = true)
class ProtectedClass {

    private String title;
    private String author;


}


