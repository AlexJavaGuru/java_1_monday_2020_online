package student_regina_svistunov.lesson_8.level_1;

// Task_1
//Что такое дефолтный конструктор класса?
//        Создайте класс и в нём объявите дефолтный конструктор.
//        Создайте класс Demo и продемонстрируйте вызов
//        дефолтного конструктора.

//Task_2
//        Нужно ли в классе создавать дефолтный конструктор
//        или Java его автоматически добавит при компиляции
//        кода? Ответьте на вопрос примером кода!
// Если в классе не описан конструктор, компилятор автоматически добавляет в код конструктор без параметров.



public class Cat {
    private String name;
    private String color;
    private int age;

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }
}

