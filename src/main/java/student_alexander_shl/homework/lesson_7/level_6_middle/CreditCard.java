package student_alexander_shl.homework.lesson_7.level_6_middle;
/*

Task_11:

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
    private final String cardNumber;
    private final int cardPinCode;
    private double balance;
    private double creditLimit;
    private double loanDebt;

    public CreditCard(String cardNumber, int cardPinCode) {
        this.cardNumber = cardNumber;
        this.cardPinCode = cardPinCode;
        this.balance = 0;
        this.creditLimit = 0;
        this.loanDebt = 0;
    }

    public void changeCreditLimit(double newCreditLimit) {
        this.creditLimit = newCreditLimit;
    }

    public double deposit(int cardPinCode, double amount) {
        if (this.cardPinCode == cardPinCode) {
            if (loanDebt > 0) {
                if ((loanDebt - amount) >= 0) {
                    loanDebt = Math.abs(loanDebt - amount);
                } else {
                    balance += Math.abs(loanDebt - amount);
                    loanDebt = 0;
                }
            } else {
                balance = balance + amount;
            }
        } else {
            return 0;
        }
        return 0;
    }

    public int withdraw(int cardPinCode, double withdrawBalance) {
        if (this.cardPinCode == cardPinCode) {
            if (balance < withdrawBalance) {
                if (loanDebt > creditLimit ||
                        (loanDebt + (withdrawBalance - balance)) > creditLimit) {
                    return 0;
                } else {
                    loanDebt = loanDebt + Math.abs(withdrawBalance - balance);
                    balance = 0;
                }
            } else {
                balance = balance - withdrawBalance;
            }
        } else {
            return 0;
        }
        return 0;
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
}
