package student_regina_svistunov.lesson_9.level_3.task_16;

//Почему не компилируется код приведённый ниже?
//        Исправьте ошибку компиляции.
//
//public class SuperClassConstructorInvoker {
//    public SuperClassConstructorInvoker() {
//        System.out.println(1);
//        super();
//        System.out.println(2);
//    }
//}

public class SuperClassConstructorInvoker {
    public SuperClassConstructorInvoker() {
        System.out.println(1);
//        super();  эта строчка лишняя (ее надо добовлять наследнику)
        System.out.println(2);
    }
}
