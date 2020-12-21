package student_alexander_shl.homework.lesson_9.level_1_intern.task_4;

import java.math.BigDecimal;

/*
Создайте класс сейф с двумя свойствами: пинкод и количество денег в сейфе.
Сделайте эти свойства публично доступными.
Создайте класс демо и продемонстрируйте, что можно делать с публичными свойствами объекта.
 */

class Safe {

    public int pinCode;
    public BigDecimal amount;

    public Safe(int pinCode, BigDecimal amount) {
        this.pinCode = pinCode;
        this.amount = amount;
    }

    public int getPinCode() {
        return pinCode;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    void printInformation() {
        System.out.println("Information: PinCode = " + pinCode + ", Amount = " + amount);
    }
}
