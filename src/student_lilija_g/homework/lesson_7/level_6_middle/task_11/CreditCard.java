package student_lilija_g.homework.lesson_7.level_6_middle.task_11;

import java.math.BigDecimal;

/*
Необходимо разработать класс "кредитная карта" CreditCard
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

class CreditCard {
    private final String cardPinCode;
    private BigDecimal cardBalance;
    private BigDecimal cardCreditLimit;
    private BigDecimal cardLoanDebs;

    public CreditCard(String cardNumber, String cardPinCode) {
        this.cardPinCode = cardPinCode;
        this.cardBalance = BigDecimal.ZERO;
        this.cardCreditLimit = BigDecimal.ZERO;
        this.cardLoanDebs = BigDecimal.ZERO;
    }

    public void changeCardCreditLimit(String pinCode, BigDecimal creditLimit) {
        if (checkPinCode(pinCode)) {
            if (creditLimit.compareTo(BigDecimal.ZERO) > 0) {
                this.cardCreditLimit = creditLimit;
            }
        }
    }

    public void withdraw(String pinCode, BigDecimal amount) {
        if (checkPinCode(pinCode)) {
            if (cardBalance.compareTo(amount) >= 0) {
                cardBalance = cardBalance.subtract(amount);
            } else {
                if (cardCreditLimit.compareTo(cardLoanDebs.add(amount.subtract(cardBalance))) >= 0) {
                    cardLoanDebs = cardLoanDebs.add(amount.subtract(cardBalance));
                    cardBalance = BigDecimal.ZERO;
                }
            }
        }
    }

    public boolean deposit(String pinCode, BigDecimal amount) {
        if (checkPinCode(pinCode)) {
            if (cardLoanDebs.compareTo(BigDecimal.ZERO) > 0) {
                if (cardLoanDebs.compareTo(amount) >= 0) {
                    cardLoanDebs = cardLoanDebs.subtract(amount);
                } else {
                    cardBalance = cardBalance.add(amount.subtract(cardLoanDebs));
                    cardLoanDebs = BigDecimal.ZERO;
                }
            } else {
                cardBalance = cardBalance.add(amount);
            }
            return true;
        }
        return false;
    }

    private boolean checkPinCode(String pinCode) {  // public -> private
        return cardPinCode.equals(pinCode);
    }

    public BigDecimal getCardCreditLimit() {
        return cardCreditLimit;
    }

    public BigDecimal getCardBalance() {
        return cardBalance;
    }

    public BigDecimal getCardLoanDebs() {
        return cardLoanDebs;
    }
}
