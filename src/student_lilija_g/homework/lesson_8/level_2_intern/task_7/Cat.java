package student_lilija_g.homework.lesson_8.level_2_intern.task_7;
/*
Можем явно вызвать конструктор родительского класса в конструкторе класса-потомка.
Родительский класс еще называют “суперклассом”, поэтому в Java для его обозначения
используется ключевое слово super.
 */
class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
    }

}
