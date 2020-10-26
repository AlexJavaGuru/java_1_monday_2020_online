package student_artur_martinenko.homework.lesson_9.level_2_intern.task_12;

import teacher.annotations.CodeReview;

/*
Какой будет результат выполнения следующей программы?

class A {
    public A() {
        System.out.println("Class A Constructor");
    }
}

class B extends A {
    public B() {
        System.out.println("Class B Constructor");
    }
}

class C extends B {
    public C() {
        System.out.println("Class C Constructor");
    }
}

public class MainClass {
    public static void main(String[] args) {
        C c = new C();
    }
}
 */
@CodeReview(approved = true)
public class MainClass {
    public static void main(String[] args) {
        //При создании объекта 'с', вызовутся автоматически все кострукторы родителей,
        // потому что конструкторы родителей не требуют никаких аргкментов для их создания.
        C c = new C();
    }
}
