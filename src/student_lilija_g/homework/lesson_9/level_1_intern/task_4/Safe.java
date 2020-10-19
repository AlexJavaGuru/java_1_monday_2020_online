package student_lilija_g.homework.lesson_9.level_1_intern.task_4;

import teacher.annotations.CodeReview;

import java.math.BigDecimal;

/*
Создайте класс сейф с двумя свойствами: пинкод и количество денег в сейфе.
Сделайте эти свойства публично доступными.
Создайте класс демо и продемонстрируйте, что можно делать с публичными свойствами объекта.
 */
@CodeReview(approved = true)
class Safe {
    int pinCode;
    BigDecimal amountOfMoney;

    public Safe(int pinCode, BigDecimal money) {
        this.pinCode = pinCode;
        this.amountOfMoney = money;
    }

    public int getPinCode() {
        return pinCode;
    }

    public BigDecimal getAmountOfMoney() {
        return amountOfMoney;
    }

    void printSafeInfo() {
        System.out.println("PinCode is " + pinCode + ", Money in safe is " + amountOfMoney);
    }
}
