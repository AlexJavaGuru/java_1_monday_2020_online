package student_alexander_shl.homework.lesson_8.level_1_intern.task_3;
/*
Какие значения принимают свойства класса
(ссылки на объекты и примитивные типы данных)
при вызове дефолтного конструктора?

class Person {

    private String fullName;
    private int age;
    private Address address;

}

Напишите программу, которая продемонстрирует
ответ на этот вопрос.
 */

class Person {

    private String fullName;
    private int age;
    private Address address;

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person); // student_alexander_shl.homework.lesson_8.level_1_intern.task_3.Person@XXXXXXXX ссылка на объект в hip
        System.out.println(person.fullName); // String возвращает null;
        System.out.println(person.age);      // Int    возвращает 0;
        System.out.println(person.address);  // Object возвращает null.
    }

}
