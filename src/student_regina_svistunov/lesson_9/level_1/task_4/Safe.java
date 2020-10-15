package student_regina_svistunov.lesson_9.level_1.task_4;

//Task_4
//Создайте класс сейф с двумя свойствами: пинкод и количество денег в сейфе.
//        Сделайте эти свойства публично доступными.
//        Создайте класс демо и продемонстрируйте, что можно делать с публичными свойствами объекта.

public class Safe {

    private String pinCode;
    private int moneyAmount;

    public Safe(String pinCode, int moneyAmount) {
        this.pinCode = pinCode;
        this.moneyAmount = moneyAmount;
    }

    public String getPinCode() {
        return pinCode;
    }

    public int getMoneyAmount() {
        return moneyAmount;
    }
}
