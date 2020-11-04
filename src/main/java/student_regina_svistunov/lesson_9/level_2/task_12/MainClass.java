package student_regina_svistunov.lesson_9.level_2.task_12;

//Какой будет результат выполнения следующей программы?
//
//class A {
//    public A() {
//        System.out.println("Class A Constructor");
//    }
//}
//
//class B extends A {
//    public B() {
//        System.out.println("Class B Constructor");
//    }
//}
//
//class C extends B {
//    public C() {
//        System.out.println("Class C Constructor");
//    }
//}
//
//public class MainClass {
//    public static void main(String[] args) {
//        C c = new C();
//    }
//}




public class MainClass {
    public static void main(String[] args) {
        C c = new C();
    }
}

// При вызове объекта "C" вызовутся все ("C", "B", "A") конструкторы родителей.
// Класс "С" наследуется от "B" родителя.
// Класс "В" наследуется от "А" родителя.
// Конструкторы родителей в данном случае не требуют аргументом для создания.
