package student_dmitry_vasiliev.lesson_9.level_1;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

/*
- Task_4 Создайте класс сейф с двумя свойствами: пинкод и количество денег в сейфе.
        Сделайте эти свойства публично доступными.
        Создайте класс демо и продемонстрируйте, что можно делать с публичными свойствами объекта.*/
@CodeReview(approved = true)
class Safe {
    public int pincode = 1111;
    public double moneyAmount = 100.0;

    public int getPincode() {
        return pincode;
    }

    public double getMoneyAmount() {
        return moneyAmount;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public void setMoneyAmount(double moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

}
