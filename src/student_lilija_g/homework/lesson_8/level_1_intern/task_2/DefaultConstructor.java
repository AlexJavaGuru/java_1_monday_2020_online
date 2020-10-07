package student_lilija_g.homework.lesson_8.level_1_intern.task_2;

import teacher.annotations.CodeReview;

/*
Нужно ли в классе создавать дефолтный конструктор
или Java его автоматически добавит при компиляции
кода? Ответьте на вопрос примером кода!

Ответ:
Компилятор Java автоматически создает конструктор по умолчанию (конструктор без аргументов) в случае,
если конструктор отсутствует в классе Java.

Создавать дефолтный конструктор специально, как в предыдущем примере, не надо, компилятор Java автоматически его создаст.
 */
@CodeReview(approved = true)
class DefaultConstructor {
    int argumentOne;
    String argumentTwo;
}
