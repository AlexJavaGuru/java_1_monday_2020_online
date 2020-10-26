package student_lilija_g.homework.lesson_9.level_2_intern.task_9;

import teacher.annotations.CodeReview;

/*
Создайте класс PrivateConstructor.
Создайте класс PrivateConstructorDemo и в его main() методе создайте инстанцию класса PrivateConstructor.
После этого сделайте так, что бы инстанцию класса PrivateConstructor нельзя было создать
в демо классе. Подсказка кроется в названии класса!
PS: не забудьте закоментировать не компилирующийся код в демо классе.
 */
@CodeReview(approved = true)
class PrivateConstructor {
    String title;
    String author;

    private PrivateConstructor(String title, String author) {
        this.title = title;
        this.author = author;
    }
}
