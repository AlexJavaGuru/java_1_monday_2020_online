package student_regina_svistunov.lesson_8.level_1;

//Какие значения принимают свойства класса
//        (ссылки на объекты и примитивные типы данных)
//        при вызове дефолтного конструктора?
//
//class Person {
//
//    private String fullName;
//    private int age;
//    private Address address;
//
//}
//
//    Напишите программу, которая продемонстрирует
//        ответ на этот вопрос.


public class Person {

    private String fullName;
    private int age;
    private String address;

    public Person(String fullName, int age, String address) {
        this.fullName = fullName;
        this.age = age;
        this.address = address;
    }

}
