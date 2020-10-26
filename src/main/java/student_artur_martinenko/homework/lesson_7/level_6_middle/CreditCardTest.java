package student_artur_martinenko.homework.lesson_7.level_6_middle;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.math.BigDecimal;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Очень много тестов. Это конечно хорошо, но у нас не цель покрыть все тестами на 100%. Вы могли бы смело обойтись половиной чтобы не нагружать себя лишний раз" +
        "")
class CreditCardTest {

    public static void main(String[] args) {
        CreditCardTest victim = new CreditCardTest();
        victim.pinCodeCheckTest();
        victim.zeroBalanceWithdrawTest1();
        victim.zeroBalanceWithdrawTest2();
        victim.zeroBalanceWithdrawTest3();
        victim.depositNegativeTest();
        victim.creditLimitSetNegative();
        victim.creditLimitSet();
        victim.creditLimitSetAndChange();
        victim.depositTest1();
        victim.depositTest2();
        victim.setLimitDepositWithdrawTest1();
        victim.setLimitDepositWithdrawTest2();
        victim.setLimitDepositWithdrawTest3();
        victim.fullCreditLimitTest();
        victim.deptPayOffTest();
        victim.balanceAfterDebtPayOff();
    }

    public void check(boolean expected, boolean actual, String testName) {
        if (expected == actual) {
            System.out.println("Test " + testName + " - PASSED");
        } else {
            System.out.println("Test " + testName + " - FAILED");
            System.out.println("\tExpected " + expected + " but passed " + actual);
        }
    }

    public void pinCodeCheckTest() {
        CreditCard creditCard = new CreditCard(123456789, 0110);
        boolean flag = creditCard.deposit(new BigDecimal("50.05"), 0000);
        check(false, flag, "pinCodeCheckTest");
    }

    public void zeroBalanceWithdrawTest1() {
        CreditCard creditCard = new CreditCard(123456789, 0110);
        creditCard.withdraw(new BigDecimal("50.05"), 0110);
        boolean flagBalance = creditCard.getBalance().compareTo(BigDecimal.ZERO) == 0;
        check(true, flagBalance, "zeroBalanceWithdrawTest1");
    }

    public void zeroBalanceWithdrawTest2() {
        CreditCard creditCard = new CreditCard(123456789, 0110);
        creditCard.withdraw(new BigDecimal("50.05"), 0110);
        boolean flagCreditDept = creditCard.getCreditDept().compareTo(BigDecimal.ZERO) == 0;
        check(true, flagCreditDept, "zeroBalanceWithdrawTest2");
    }

    public void zeroBalanceWithdrawTest3() {
        CreditCard creditCard = new CreditCard(123456789, 0110);
        creditCard.withdraw(new BigDecimal("50.05"), 0110);
        boolean flagCreditLimit = creditCard.getCreditLimit().compareTo(BigDecimal.ZERO) == 0;
        check(true, flagCreditLimit, "zeroBalanceWithdrawTest3");
    }


    public void depositNegativeTest() {
        CreditCard creditCard = new CreditCard(123456789, 0110);
        creditCard.deposit(new BigDecimal("-50.05"), 0110);
        boolean flagBalance = creditCard.getBalance().compareTo(BigDecimal.ZERO) == 0;
        check(true, flagBalance, "depositNegativeTest");
    }

    public void creditLimitSetNegative() {
        CreditCard creditCard = new CreditCard(123456789, 0110);
        creditCard.setCreditLimit(new BigDecimal("-50.05"), 0110);
        boolean flagPositive = creditCard.getCreditLimit().compareTo(BigDecimal.ZERO) == 0;
        check(true, flagPositive, "creditLimitSetNegative");
    }

    public void creditLimitSet() {
        CreditCard creditCard = new CreditCard(123456789, 0110);
        creditCard.setCreditLimit(new BigDecimal("500"), 0110);
        boolean flagSet = creditCard.getCreditLimit().compareTo(new BigDecimal("500")) == 0;
        check(true, flagSet, "creditLimitSet");
    }

    public void creditLimitSetAndChange() {
        CreditCard creditCard = new CreditCard(123456789, 0110);
        creditCard.setCreditLimit(new BigDecimal("500"), 0110);
        creditCard.setCreditLimit(new BigDecimal("0.00"), 0110);
        boolean flagCreditToZero = creditCard.getCreditLimit().compareTo(BigDecimal.ZERO) == 0;
        check(true, flagCreditToZero, "creditLimitSetAndChange");
    }

    public void depositTest1() {
        CreditCard creditCard = new CreditCard(123456789, 0110);
        creditCard.deposit(new BigDecimal("50.05"), 0110);
        boolean flagBalance1 = creditCard.getBalance().compareTo(new BigDecimal("50.05")) == 0;
        check(true, flagBalance1, "depositTest1");
    }

    public void depositTest2() {
        CreditCard creditCard = new CreditCard(123456789, 0110);
        creditCard.deposit(new BigDecimal("50.05"), 0110);
        creditCard.deposit(new BigDecimal("49.95"), 0110);
        boolean flagBalance2 = creditCard.getBalance().compareTo(new BigDecimal("100.00")) == 0;
        check(true, flagBalance2, "depositTest2");
    }

    public void setLimitDepositWithdrawTest1() {
        CreditCard creditCard = new CreditCard(123456789, 0110);
        creditCard.setCreditLimit(new BigDecimal("500.00"), 0110);
        creditCard.deposit(new BigDecimal("100"), 0110);
        creditCard.withdraw(new BigDecimal("300"), 0110);
        boolean flagBalance = creditCard.getBalance().compareTo(new BigDecimal("0.00")) == 0;
        check(true, flagBalance, "setLimitDepositWithdrawTest1");
    }

    public void setLimitDepositWithdrawTest2() {
        CreditCard creditCard = new CreditCard(123456789, 0110);
        creditCard.setCreditLimit(new BigDecimal("500.00"), 0110);
        creditCard.deposit(new BigDecimal("100"), 0110);
        creditCard.withdraw(new BigDecimal("300"), 0110);
        boolean flagCreditDept = creditCard.getCreditDept().compareTo(new BigDecimal("200.00")) == 0;
        check(true, flagCreditDept, "setLimitDepositWithdrawTest2");
    }

    public void setLimitDepositWithdrawTest3() {
        CreditCard creditCard = new CreditCard(123456789, 0110);
        creditCard.setCreditLimit(new BigDecimal("500.00"), 0110);
        creditCard.deposit(new BigDecimal("100"), 0110);
        creditCard.withdraw(new BigDecimal("300"), 0110);
        boolean exceedLimits = creditCard.withdraw(new BigDecimal("300.01"), 0110);
        check(true, !exceedLimits, "setLimitDepositWithdrawTest3");
    }

    public void fullCreditLimitTest() {
        CreditCard creditCard = new CreditCard(123456789, 0110);
        creditCard.setCreditLimit(new BigDecimal("500.00"), 0110);
        creditCard.withdraw(new BigDecimal("500"), 0110);
        boolean flagCreditDeptFull = creditCard.getCreditDept().compareTo(new BigDecimal("500.00")) == 0;
        check(true, flagCreditDeptFull, "fullCreditLimitTest");
    }

    public void deptPayOffTest() {
        CreditCard creditCard = new CreditCard(123456789, 0110);
        creditCard.setCreditLimit(new BigDecimal("500.00"), 0110);
        creditCard.withdraw(new BigDecimal("500"), 0110);
        creditCard.deposit(new BigDecimal("600"), 0110);
        boolean flagCreditDeptNull = creditCard.getCreditDept().compareTo(new BigDecimal("0.00")) == 0;
        check(true, flagCreditDeptNull, "deptPayOffTest");
    }

    public void balanceAfterDebtPayOff() {
        CreditCard creditCard = new CreditCard(123456789, 0110);
        creditCard.setCreditLimit(new BigDecimal("500.00"), 0110);
        creditCard.withdraw(new BigDecimal("500"), 0110);
        creditCard.deposit(new BigDecimal("600"), 0110);
        boolean flagBalance = creditCard.getBalance().compareTo(new BigDecimal("100.00")) == 0;
        check(true, flagBalance, "balanceAfterDebtPayOff");
    }

}
