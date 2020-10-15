package student_pjotrs_grezmanis.lesson_7.level_6;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class NewCreditCardTest {
    public static void main(String[] args) {
        NewCreditCardTest newCreditCardTest = new NewCreditCardTest();
        newCreditCardTest.testCreditCardNumber();
        newCreditCardTest.testDepositBalance();
        newCreditCardTest.testWithdrawWithLoan();
        newCreditCardTest.testWithdrawWithoutLoan();
    }

    public void testCreditCardNumber() {
        CreditCard test = new CreditCard(123456, 254300);
        int expectedResult = 123456;
        check(expectedResult, test.getCardNumber(), "testCreditCardNumber");
    }

    public void testDepositBalance() {
        CreditCard testCard = new CreditCard(123456, 254300);
        check(0, testCard.getBalance(), "testDepositBalance: verify initial balance");
        testCard.deposit(254300, 20);
        check(20, testCard.getBalance(), "testDepositBalance: verify balance after deposit");
    }

    public void testWithdrawWithLoan() {
        CreditCard testCard = new CreditCard(123456, 254300);
        testCard.setCreditLimit(100);
        testCard.withDraw(254300, 20);
        check(20, testCard.getLoanDebt(), "testWithdrawWithLoan: verify LoanDebt after Withdraw");
        check(0, testCard.getBalance(), "testWithdrawWithLoan: verify Balance after Withdraw");
    }

    public void testWithdrawWithoutLoan() {
        CreditCard testCard = new CreditCard(123456, 254300);
        testCard.setCreditLimit(100);
        testCard.deposit(254300,50);
        testCard.withDraw(254300, 20);
        check(0, testCard.getLoanDebt(), "testWithdrawWithoutLoan: verify LoanDebt after Withdraw");
        check(30, testCard.getBalance(), "testWithdrawWithoutLoan: verify Balance after Withdraw");
    }

    public void check(int expectedResult, long actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected result was " + expectedResult + " but actual result " + actualResult);
        }
    }

    public void check(double expectedResult, double actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected result was " + expectedResult + " but actual result " + actualResult);
        }
    }

}
