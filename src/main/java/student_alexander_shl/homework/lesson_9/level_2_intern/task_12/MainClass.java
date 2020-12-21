package student_alexander_shl.homework.lesson_9.level_2_intern.task_12;
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

 */

class MainClass {
    public static void main(String[] args) {
        C c = new C();
    }
}
/*

Class A Constructor
Class B Constructor
Class C Constructor

Объекту "c" при создании необходимы все кострукторы родителей, потому что
конструкторы родителей не требуют никаких аргументов для их создания,
поэтому выполняется первым "Class A Constructor", далее "Class B Constructor",
и только потом "Class C Constructor".
 */