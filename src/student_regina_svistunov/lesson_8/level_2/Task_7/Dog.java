package student_regina_svistunov.lesson_8.level_2.Task_7;

//Как вызвать конструктор родительского класса?
//        Когда это нужно делать?
//        Приведите пример кода.


// Вызвать родительский класс можно с помощью ключевого слова super.

public class Dog {
    private String breed;
    private String name;


    public Dog(String breed, String name) {
        this.breed = breed;
        this.name = name;
    }
}
