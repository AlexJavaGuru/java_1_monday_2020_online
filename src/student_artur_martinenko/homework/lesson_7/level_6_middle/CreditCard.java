package student_artur_martinenko.homework.lesson_7.level_6_middle;

import java.math.BigDecimal;


class CreditCard {
    private int cardNumber;
    private int pinCode;
    private BigDecimal balance;
    private BigDecimal creditLimit;
    private BigDecimal creditDept;

    public CreditCard(int cardNumber, int pinCode) {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
        this.balance = BigDecimal.ZERO;
        this.creditLimit = BigDecimal.ZERO;
        this.creditDept = BigDecimal.ZERO;
    }

    public boolean deposit(BigDecimal amount, int pin) {
        if (!pinCodeCheck(pin)) {
            return false;
        } else {
            addToBalance(amount);
        }
        return false;
    }

    public boolean addToBalance(BigDecimal amount) {    //private
        if(amount.compareTo(BigDecimal.ZERO) <0){
            return false;
        }
        BigDecimal deposit = creditDept.subtract(amount);
        if (deposit.compareTo(BigDecimal.ZERO) <= 0) {
            creditDept = BigDecimal.ZERO;
            balance = balance.add(deposit.abs());
        } else {
            creditDept = creditDept.subtract(amount);
        }
        return true;
    }

    public boolean withdraw(BigDecimal amount, int pin) {
        if (!pinCodeCheck(pin)) {
            return false;
        } else {
            subtractFromBalance(amount);
        }
        return false;
    }

    public boolean subtractFromBalance(BigDecimal amount) {    //private
        if (ifEnoughFundsForWithdrawal(amount)) {
            BigDecimal withdraw = balance.subtract(amount);
            //    -     <            0
            if (withdraw.compareTo(BigDecimal.ZERO) <= 0) {
                balance = BigDecimal.ZERO;
                creditDept = creditDept.add(withdraw.abs());
            } else {
                balance = withdraw;
            }
            return true;
        }
        return false;
    }

    private boolean ifEnoughFundsForWithdrawal(BigDecimal toWithdraw) {    //private
        return ((toWithdraw.add(creditDept).compareTo(balance.add(creditLimit)) <= 0));
    }

    public BigDecimal getCreditLimit() {
        return new BigDecimal(String.valueOf(creditLimit));
    }


    private boolean pinCodeCheck(int pin) {
        return pinCode == pin;
    }

    public BigDecimal getBalance() {
        return new BigDecimal(String.valueOf(balance));
    }

    public BigDecimal getCreditDept() {
        return new BigDecimal(String.valueOf(creditDept));
    }

    public boolean setCreditLimit(BigDecimal limit, int pin) {
        if(!pinCodeCheck(pin)) return false;
        if (limit.compareTo(BigDecimal.ZERO) < 0) {
            return false;
        }
        if(creditDept.compareTo(BigDecimal.ZERO) == 0){
            this.creditLimit = limit;
            return true;
        }
        return false;
    }

}
