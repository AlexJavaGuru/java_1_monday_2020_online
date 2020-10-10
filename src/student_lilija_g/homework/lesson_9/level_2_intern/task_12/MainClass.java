package student_lilija_g.homework.lesson_9.level_2_intern.task_12;
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

/*
Class A Constructor
Class B Constructor
Class C Constructor

Вызовется сначала конструктор С, который вызовет конструктор родителя B,
в свою очередь конструктор B вызовет родительский конструктор A.
Конструктор A (родитель) может выполнятся без каких-либо параметров, поэтому
выполняется первым, далее достаточно данных для выполнения B конструктора,
и только потом будет выполнятся конструктор С.

 */
class MainClass {
    public static void main(String[] args) {
        C c = new C();
    }
}
