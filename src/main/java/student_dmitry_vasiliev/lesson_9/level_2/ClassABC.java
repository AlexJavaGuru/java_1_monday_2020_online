package student_dmitry_vasiliev.lesson_9.level_2;

// - Task_12
// Какой будет результат выполнения следующей программы?
//Ответ: в классе main производится вызов конструктора класса С, далее оказыватся,
//что класс С наследник класса В и компилятор обращается к нему, а далее
//по родственной линии, к классу А. Таким образом выполняется sout класса А, далее
//классов В и С.
//Но где это реально использовать, пока в голову не приходит))
//Это принцип, который надо понимать, что джаве надо вызвать конструкторы родителей класса, при создании объектов наследников.

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
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

class MainClass {
    public static void main(String[] args) {
        C c = new C();
    }
}
