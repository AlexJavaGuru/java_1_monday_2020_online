package student_alexander_shl.homework.lesson_9.level_3_junior.task_16;
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

class SuperClassConstructorInvoker {
    public SuperClassConstructorInvoker() {
        System.out.println(1);
//      super(); не является дочерним!
        System.out.println(2);
    }
}
