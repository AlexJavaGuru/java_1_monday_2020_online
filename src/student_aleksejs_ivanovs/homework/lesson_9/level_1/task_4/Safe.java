package student_aleksejs_ivanovs.homework.lesson_9.level_1.task_4;

/*Создайте класс сейф с двумя свойствами: пинкод и количество денег в сейфе.
Сделайте эти свойства публично доступными.
Создайте класс демо и продемонстрируйте, что можно делать с публичными свойствами объекта.*/

class Safe {

    public String pin;
    public int money;

    public Safe(String pin, int money) {
        this.pin = pin;
        this.money = money;
    }

}
