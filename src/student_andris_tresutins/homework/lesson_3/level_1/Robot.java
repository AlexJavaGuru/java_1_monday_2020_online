package student_andris_tresutins.homework.lesson_3.level_1;

//TODO: Исправить формат класса. Новые строки между секциями (переменные, конструкторы, классы). Методы нельзя писать в одну строку. Все долджно быть правильно.
// Когда вы видите метод в одну строчку, то вы видите рядом с ним "+". Таким образом, Идея схлопывает маленике методы в строчку, чтобы те занимали меньше места, но это большая разница
// когда это делает идея и когда мы так изначально пишем. Такого быть не должно -> public void sayHello(){System.out.println("Hello from " + name);}
public class Robot {
    public String name;
    public Robot(String robotName) {this.name= robotName; }
    public void sayHello(){System.out.println("Hello from " + name);}
    public void sayYourName(){ System.out.println("I am " + name); }

}
