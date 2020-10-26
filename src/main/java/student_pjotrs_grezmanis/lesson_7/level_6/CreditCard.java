package student_pjotrs_grezmanis.lesson_7.level_6;

import teacher.annotations.CodeReview;

/*Необходимо разработать класс "кредитная карта" CreditCard
с учетом инкапсуляции, которая обладает следующими характеристиками:

Свойства
-Номер карты
-Пин-код карты
-Баланс
-Кредитный лимит
-Задолженность по кредиту


Методы

-Зачисление средств на карту ("deposit")
-Снятие средств с карты ("withdraw")

При создании карты нужно указывать ее номер и пинкод.
Начальный баланс и задолженность по кредиту равны 0.
Кредитный лимит можно менять после создания карты.

Требования к снятию средств:
-При снятии средств с карты необходимо указывать пин-код и желаемую сумму;
-Если пин-коды не совпадают, операция по снятию денег должна быть отклонена;
-Деньги снимаются с карточного баланса. В случае, если их не хватает, остаток суммы нужно брать за счет задолженности по кредиту;
-Если сумма задолженности превышает кредитный лимит, операция по снятию денег должна быть отклонена;

Требования к зачислению средств:
-При зачислении средств на карту необходимо указывать пин-код и желаемую сумму;
-Если пин-коды не совпадают, операция по зачислению денег должна быть отклонена;
-В первую очередь зачисление покрывает задолженность по кредиту;
-Если задолженность по кредиту равна 0, то остаток средств зачисляется в счет баланса;

Написать тестовые сценарии для класса CreditCard в классе CreditCardTest.
Все тестовые сценарии должны отрабатывать без ошибок.

 */
@CodeReview(approved = true)
class CreditCard {

    private long cardNumber;
    private int pinCode;
    private double balance = 0;
    private double creditLimit = 0;
    private double loanDebt = 0;

    public CreditCard(long cardNumber, int pinCode) {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
    }

    public void deposit(int pinCode, double sum) {
        if (pinCode != this.pinCode) {
            return;
        }
        if (loanDebt == 0) {
            balance = +sum;
            return;
        }
        if (loanDebt > sum) {
            loanDebt = loanDebt - sum;
        } else {
            balance = sum - loanDebt;
            loanDebt = 0;
        }
    }

    public void withDraw(int pinCode, double sum) {
        if (pinCode != this.pinCode) {
            return ;
        }
        if (balance >= sum) {
            balance -= sum;
            return ;
        }
        double debt = sum - balance;
        if (loanDebt + debt <= creditLimit) {
            balance = 0;
            loanDebt += debt;
        }

    }

    public long getCardNumber() {
        return cardNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public double getLoanDebt() {
        return loanDebt;
    }

    public void setCreditLimit(double newCreditLimit) {
        creditLimit = newCreditLimit;
    }



}