package student_dmitry_vasiliev.lesson_8.level_1;
/*1. Какие значения принимают свойства класса
        (ссылки на объекты и примитивные типы данных)
        при вызове дефолтного конструктора?

    Напишите программу, которая продемонстрирует
        ответ на этот вопрос.
  2. Исправьте код программы:
  class Person {

    private String fullName;
    private int age;
    private Address address;

}

PS: в этом задании класс Person должен явно наследоваться
        от класса Object, пропишите наследование правильно.
        */

class Person extends Object{

    public String fullName;
    public int age;
    public String address;

}
