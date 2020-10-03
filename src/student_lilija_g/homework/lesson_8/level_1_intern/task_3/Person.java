package student_lilija_g.homework.lesson_8.level_1_intern.task_3;
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

        Person myPerson = new Person();
        System.out.println(myPerson);
        System.out.println(myPerson.fullName);
        System.out.println(myPerson.age);
        System.out.println(myPerson.address);

        Address myAddress = new Address("Jessica","Street",12,5,"Los Angeles","USA", "US123");
        System.out.println(myAddress);
        System.out.println(myAddress.name);
        System.out.println(myAddress.street);
        System.out.println(myAddress.house);
        System.out.println(myAddress.apartment);
        System.out.println(myAddress.city);
        System.out.println(myAddress.country);
        System.out.println(myAddress.zip);

        myPerson.address= myAddress;
        System.out.println(myPerson.address);
        System.out.println(myPerson.address.name);
        System.out.println(myPerson.address.street);
        System.out.println(myPerson.address.house);
        System.out.println(myPerson.address.apartment);
        System.out.println(myPerson.address.city);
        System.out.println(myPerson.address.country);
        System.out.println(myPerson.address.zip);
    }
}
