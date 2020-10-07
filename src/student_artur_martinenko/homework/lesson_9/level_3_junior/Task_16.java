package student_artur_martinenko.homework.lesson_9.level_3_junior;

import teacher.annotations.CodeReview;

/*
Почему не компилируется код приведённый ниже?
Исправьте ошибку компиляции.

public class SuperClassConstructorInvoker {
    public SuperClassConstructorInvoker() {
        System.out.println(1);
        super();
        System.out.println(2);
    }
}
 */
class Task_16 {
}

//Потому что этот класс не является дочерним (does not inherit from any parent class).
//Поэтому джава не знает, от куда брать конструктор родителя.
@CodeReview(approved = true)
class SuperClassConstructorInvoker {
    public SuperClassConstructorInvoker() {
        System.out.println(1);
//        super();
        System.out.println(2);
    }
}
