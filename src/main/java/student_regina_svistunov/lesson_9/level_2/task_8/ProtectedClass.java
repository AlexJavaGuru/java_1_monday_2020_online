package student_regina_svistunov.lesson_9.level_2.task_8;


//Исправьте код класса ProtectedClass так, что бы он компилировался.
//protected class ProtectedClass {
//
//    private String title;
//    private String author;
//}
//
//    Как вы думаете, почему protected классы создавать нельзя?
//        Напиши свой ответ в коментарии над исправленным кодом.


public class ProtectedClass { // можно и без Public

    private String title;
    private String author;
}

// Модификатор доступа protected в Java не может быть применен к классу и интерфейсам. Аналогично приватному классу
