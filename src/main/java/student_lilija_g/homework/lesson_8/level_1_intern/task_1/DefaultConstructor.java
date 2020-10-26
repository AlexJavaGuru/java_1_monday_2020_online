package student_lilija_g.homework.lesson_8.level_1_intern.task_1;

import teacher.annotations.CodeReview;

/*
Что такое дефолтный конструктор класса?
Создайте класс и в нём объявите дефолтный конструктор.
Создайте класс Demo и продемонстрируйте вызов
дефолтного конструктора.

Ответ:
Конструктор по умолчанию (default constructor), в ООП — это конструктор, который может быть вызван без аргументов.

Компилятор Java автоматически создает конструктор по умолчанию (конструктор без аргументов) в случае,
если конструктор отсутствует в классе Java.

По сути конструктор нужен для автоматической инициализации переменных.

 */
@CodeReview(approved = true)
class DefaultConstructor {
    int argumentOne;
    String argumentTwo;

    public DefaultConstructor() {       // default constructor
    }
}
