package student_artur_martinenko.homework.lesson_9.level_2_intern.task_9;
/*
Создайте класс PrivateConstructor.
Создайте класс PrivateConstructorDemo и в его main() методе создайте инстанцию класса PrivateConstructor.
После этого сделайте так, что бы инстанцию класса PrivateConstructor нельзя было создать
в демо классе. Подсказка кроется в названии класса!
PS: не забудьте закоментировать не компилирующийся код в демо классе.
 */
class PrivateConstructor {
    int number;

    private PrivateConstructor(int number) {
        this.number = number;
    }
}
