package student_artur_martinenko.homework.lesson_9.level_1_intern.task_5;
/*
Создайте класс сейф версии 2 с двумя свойствами: пароль и количество денег в сейфе.
Начальные значения этим свойствам задавайте через публичный конструктор.
Сделайте так, что бы достать деньги из сейфа или положить деньги в сейф
можно было только предоставя правильный пароль.
Подсказка: реализуйте эту функциональность через публичные методы: getMoney(...), putMoney(...).
Создайте класс демо и продемонстрируйте, принцып инкапсуляции в действии!
 */
class Safe {
    private int balance;
    private String pinCode;

    public Safe(int balance, String pinCode) {
        this.balance = balance;
        this.pinCode = pinCode;
    }

    public boolean getMoney(int money, String pin) {
        if (pinCode.equalsIgnoreCase(pin)){
            this.balance -= money;
            return true;
        }
        return false;
    }
    public boolean putMoney(int money, String pin) {
        if (pinCode.equalsIgnoreCase(pin)){
            this.balance += money;
            return true;
        }
        return false;
    }

    public int getBalance() {
        return balance;
    }


}
