package student_pjotrs_grezmanis.lesson_7.level_6;

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

    public void withdraw(int pinCode, double sum) {
        if (pinCode != this.pinCode) {
            return;
        }
        if (balance >= sum) {
            balance = -sum;
            return;
        }
        double debt = sum - balance;
        if (loanDebt + debt <= creditLimit) {
            balance = 0;
            loanDebt = +debt;
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
    public void setCreditLimit(double newCreditLimit){
        creditLimit = newCreditLimit;
    }
}