package student_artur_martinenko.homework.lesson_12.level_2_intern.task_7_17;

import teacher.annotations.CodeReview;

//Task_9
/*
Для описания клиентов банка, данных к которым мы хотим дать доступ,
создайте класс BankClient:

class BankClient {

    private String uid;      // уникальный идентификатор клиета
    private String fullName; // полное имя клиента

    // созжайте конструктор класса, в котором вы получите значения указанных свойств

    // создайте get() методы для каждого из свойств

}
 */
@CodeReview(approved = true)
class BankClient {

    private String uid;
    private String fullName;

    public BankClient(String uid, String fullName) {
        this.uid = uid;
        this.fullName = fullName;
    }

    public String getUid() {
        return uid;
    }

    public String getFullName() {
        return fullName;
    }


}
