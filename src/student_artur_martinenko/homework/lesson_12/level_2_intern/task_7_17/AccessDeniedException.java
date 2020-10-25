package student_artur_martinenko.homework.lesson_12.level_2_intern.task_7_17;
//Task_11
/*
Для описания ошибки обозначающей, что у пользователя нет
прав вызывать метод findByUid() нужно создать свой класс ошибки:

class AccessDeniedException extends Exception {

}

И изменить сигнатуру метода findByUid() в интерфейсе следующим образом:

interface BankApi {

    Optional<BankClient> findByUid(UserCredentials credentials,
                                   String uid) throws AccessDeniedException;

}

Теперь из сигнатуры метода следует, что данный метод может
вернуть ("кинуть") ошибку типа AccessDeniedException.
 */

//Task_17
/*
Почему класс AccessDeniedException в нашем случае
лучше наследовать от Exception, а не от RuntimeException?

class AccessDeniedException extends Exception {

}
 */

class AccessDeniedException extends Exception {
//Task_17
//Exception indicates conditions that a reasonable application might want to catch.

}
