package student_alexander_shl.homework.lesson_9.level_1_intern.task_5;

import java.math.BigDecimal;

/*
Создайте класс сейф версии 2 с двумя свойствами: пароль и количество денег в сейфе.
Начальные значения этим свойствам задавайте через публичный конструктор.
Сделайте так, что бы достать деньги из сейфа или положить деньги в сейф
можно было только предоставя правильный пароль.
Подсказка: реализуйте эту функциональность через публичные методы: getMoney(...), putMoney(...).
Создайте класс демо и продемонстрируйте, принцып инкапсуляции в действии!
 */
class Safe {
    private int pinCode;
    private BigDecimal amount;

    public Safe(int pinCode, BigDecimal amount) {
        this.pinCode = pinCode;
        this.amount = amount;
    }

    public boolean getMoney(int pinCode, BigDecimal value) {
        if (this.pinCode == pinCode) {
            amount = amount.subtract(value);
            return true;
        }
        return false;
    }

    public boolean putMoney(int pinCode, BigDecimal value) {
        if (this.pinCode == pinCode) {
            amount = amount.add(value);
            return true;
        }
        return false;
    }
    void printInformation() {
        System.out.println("Information: PinCode = " + pinCode + ", Amount = " + amount);
    }

    public BigDecimal balance(int pinCode) {
        return amount;
    }
}
