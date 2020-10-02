package student_aleksejs_ivanovs.homework.lesson_7.level_6.task_11;

class CreditCard {

    private final int cardNumber;
    private final int cardPin;
    private double balance;
    private double creditLimit;
    private double loanDebt;

    public CreditCard(int cardNumber, int cardPin) {
        this.cardNumber = cardNumber;
        this.cardPin = cardPin;
        this.balance = 0;
        this.loanDebt = 0;
    }

    public void changeCreditLimit(double newCreditLimit) {
        this.creditLimit = newCreditLimit;
    }

    public int deposit(int cardPin, double enrollmentBalance) {
        if (this.cardPin == cardPin) {
            if (loanDebt > 0) {
                if ((loanDebt - enrollmentBalance) >= 0) {
                    loanDebt = Math.abs(loanDebt - enrollmentBalance);
                } else {
                    balance += Math.abs(loanDebt - enrollmentBalance);
                    loanDebt = 0;
                }
            } else {
                balance += enrollmentBalance;
            }
        } else {
            return 0;
        }
        return 0;
    }

    public int withdraw(int cardPin, double withdrawBalance) {
        if (this.cardPin == cardPin) {
            if (balance < withdrawBalance) {
                if (loanDebt > creditLimit || (loanDebt + (withdrawBalance - balance)) > creditLimit) {
                    return 0;
                } else {
                    loanDebt += Math.abs(withdrawBalance - balance);
                    balance = 0;
                }
            } else {
                balance -= withdrawBalance;
            }
        } else {
            return 0;
        }
        return 0;
    }

    public double getBalance() {
        return balance;
    }

    public double getLoanDebt() {
        return loanDebt;
    }

    public int getCardNumber() {
        return cardNumber;
    }
}
