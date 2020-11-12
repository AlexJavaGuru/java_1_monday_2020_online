package student_regina_svistunov.lesson_9.level_1.task_5;

//        Создайте класс сейф версии 2 с двумя свойствами: пароль и количество денег в сейфе.
//        Начальные значения этим свойствам задавайте через публичный конструктор.
//        Сделайте так, что бы достать деньги из сейфа или положить деньги в сейф
//        можно было только предоставя правильный пароль.
//        Подсказка: реализуйте эту функциональность через публичные методы: getMoney(...), putMoney(...).
//        Создайте класс демо и продемонстрируйте, принцып инкапсуляции в действии!


import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Safe {

    String pinCode;
    int moneyAmount;

    public Safe(String pinCode, int moneyAmount) {
        this.pinCode = pinCode;
        this.moneyAmount = moneyAmount;
    }

    public boolean getMoney(String pin, int money) {
        if (pinCode.equalsIgnoreCase(pin)) {
            moneyAmount -= money;
            return true;
        } else return false;
    }

    public boolean putMoney(String pin, int money) {
        if (pinCode.equalsIgnoreCase(pin)) {
            moneyAmount += money;
            return true;
        } else return false;
    }

    public int getBalance() {
        return moneyAmount;
    }





}
