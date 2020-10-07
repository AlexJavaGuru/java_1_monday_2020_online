package student_artur_martinenko.homework.lesson_8.level_1_intern.task_3;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;
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


@CodeReview(approved = true)
class Person {

    private String fullName;
    private int age;
    private Address address;

    public Person() {
    }

    public Person(String fullName, int age, Address address) {
        this.fullName = fullName;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
