package student_aleksejs_ivanovs.homework.lesson_9.level_2.task_12;

import teacher.annotations.CodeReview;

/*Какой будет результат выполнения следующей программы?

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
}*/
@CodeReview(approved = true)
class MainClass {

    public static void main(String[] args) {
        C c = new C();
        //When the program starts, all the parent constructors are called

        //Class A Constructor
        //Class B Constructor
        //Class C Constructor
    }

}
