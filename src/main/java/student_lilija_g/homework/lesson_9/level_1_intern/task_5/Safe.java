package student_lilija_g.homework.lesson_9.level_1_intern.task_5;

import teacher.annotations.CodeReview;

import java.math.BigDecimal;

/*
Создайте класс сейф версии 2 с двумя свойствами: пароль и количество денег в сейфе.
Начальные значения этим свойствам задавайте через публичный конструктор.
Сделайте так, что бы достать деньги из сейфа или положить деньги в сейф
можно было только предоставя правильный пароль.
Подсказка: реализуйте эту функциональность через публичные методы: getMoney(...), putMoney(...).
Создайте класс демо и продемонстрируйте, принцып инкапсуляции в действии!
 */
@CodeReview(approved = true)
class Safe {
    private String password;
    private BigDecimal amountOfMoney;

    public Safe(String password, BigDecimal money) {
        this.password = password;
        this.amountOfMoney = money;
    }

    public boolean getMoney(String password, BigDecimal money) {
        if (this.password.equalsIgnoreCase(password)) {
            amountOfMoney = amountOfMoney.subtract(money);
            return true;
        }
        return false;
    }

    public boolean putMoney(String password, BigDecimal money) {
        if (this.password.equalsIgnoreCase(password)) {
            amountOfMoney = amountOfMoney.add(money);
            return true;
        }
        return false;
    }

    public BigDecimal balance(String password) {
        return amountOfMoney;
    }
}
