package student_dmitry_vasiliev.lesson_9.level_3;

/*- Task_16
Почему не компилируется код приведённый ниже?
        Исправьте ошибку компиляции.*/

public class SuperClassConstructorInvoker {
    public SuperClassConstructorInvoker() {
        super();
        System.out.println(1);
        //super();
        System.out.println(2);
    }
}
