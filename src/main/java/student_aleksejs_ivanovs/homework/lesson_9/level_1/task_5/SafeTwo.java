package student_aleksejs_ivanovs.homework.lesson_9.level_1.task_5;

/*Создайте класс сейф версии 2 с двумя свойствами: пароль и количество денег в сейфе.
Начальные значения этим свойствам задавайте через публичный конструктор.
Сделайте так, что бы достать деньги из сейфа или положить деньги в сейф
можно было только предоставя правильный пароль.
Подсказка: реализуйте эту функциональность через публичные методы: getMoney(...), putMoney(...).
Создайте класс демо и продемонстрируйте, принцып инкапсуляции в действии!*/

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class SafeTwo {

    private String pin;
    private int money;

    public SafeTwo(String pin, int money) {
        this.pin = pin;
        this.money = money;
    }

    public int getMoney(String pin, int money) {
        if (pin.equals(this.pin)) {
            this.money -= money;
            return money;
        }
        return 0;
    }

    public int putMoney(String pin, int money) {
        if (pin.equals(this.pin)) {
            this.money += money;
            return money;
        }
        return 0;
    }

    public int getMoney() {
        System.out.println(money);
        return money;
    }

}
