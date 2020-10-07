package student_artur_martinenko.homework.lesson_9.level_1_intern.task_4;
/* Task 4
Создайте класс сейф с двумя свойствами: пинкод и количество денег в сейфе.
Сделайте эти свойства публично доступными.
Создайте класс демо и продемонстрируйте, что можно делать с публичными свойствами объекта.
 */

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Safe {
    int balance;
    String pinCode;

    public Safe(int balance, String pinCode) {
        this.balance = balance;
        this.pinCode = pinCode;
    }

    public int getBalance() {
        return balance;
    }

    public String getPinCode() {
        return pinCode;
    }

}
