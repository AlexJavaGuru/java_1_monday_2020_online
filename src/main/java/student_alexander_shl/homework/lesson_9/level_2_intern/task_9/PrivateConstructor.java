package student_alexander_shl.homework.lesson_9.level_2_intern.task_9;

import java.math.BigDecimal;

/*
Создайте класс PrivateConstructor.
Создайте класс PrivateConstructorDemo и в его main() методе создайте инстанцию класса PrivateConstructor.
После этого сделайте так, что бы инстанцию класса PrivateConstructor нельзя было создать
в демо классе. Подсказка кроется в названии класса!
PS: не забудьте закоментировать не компилирующийся код в демо классе.
 */

class PrivateConstructor {
    String account;
    BigDecimal amount;

    private PrivateConstructor(String account, BigDecimal amount) {
        this.account = account;
        this.amount = amount;
    }
}
