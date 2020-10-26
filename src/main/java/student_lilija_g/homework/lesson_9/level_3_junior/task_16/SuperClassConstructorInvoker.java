package student_lilija_g.homework.lesson_9.level_3_junior.task_16;

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
@CodeReview(approved = true)
public class SuperClassConstructorInvoker {
    public SuperClassConstructorInvoker() {
        System.out.println(1);
        //super(); Так как класс SuperClassConstructorInvoker не является дочерним
        System.out.println(2);
    }
}
