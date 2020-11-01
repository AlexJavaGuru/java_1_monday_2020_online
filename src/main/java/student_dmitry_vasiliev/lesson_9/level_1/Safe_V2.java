package student_dmitry_vasiliev.lesson_9.level_1;

import teacher.annotations.CodeReview;

/*
- Task_5 Создайте класс сейф версии 2 с двумя свойствами: пароль и количество денег в сейфе.
        Начальные значения этим свойствам задавайте через публичный конструктор.
        Сделайте так, что бы достать деньги из сейфа или положить деньги в сейф
        можно было только предоставя правильный пароль.
        Подсказка: реализуйте эту функциональность через публичные методы: getMoney(...), putMoney(...).
        Создайте класс демо и продемонстрируйте, принцып инкапсуляции в действии!*/
@CodeReview(approved = true)
class Safe_V2 {

    private int pincode = 1111;
    private double moneyAmount = 100.0;

    public  void getMoney(double money, int pincode) {
        if (pincodeCheck(pincode) && moneyAmount >= money) {
            moneyAmount -= money;
            System.out.println("Account balance of Safe_V2 is: " + moneyAmount);
        }else {
            System.out.println("Pincode is wrong or balance of money too small!");
        }
    }

    public  void putMoney(double money, int pincode) {
        if (pincodeCheck(pincode)) {
            moneyAmount += money;
            System.out.println("Account balance of Safe_V2 is: " + moneyAmount);
        }else {
            System.out.println("Pincode is wrong!");
        }
    }

    public boolean pincodeCheck(int pincodeForCheck) {
        if (pincode == pincodeForCheck) {
            return true;
        } else {
            return false;
        }
    }
}
