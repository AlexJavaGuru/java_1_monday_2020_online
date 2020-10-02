package student_aleksejs_ivanovs.homework.lesson_7.level_6.task_11;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class CreditCardTest {

    public static void main(String[] args) {
        CreditCardTest test = new CreditCardTest();
        test.creditCardTest();
        test.creditCardTestTwo();
    }

    public void creditCardTest() {
        CreditCard card = new CreditCard(333,123);
        card.changeCreditLimit(300);
        card.deposit(123,100);
        card.withdraw(123,50);

        if (card.getBalance() == 50 && card.getLoanDebt() == 0) {
            System.out.println("Test has passed");
        } else {
            System.out.println("Test failed!");
        }
    }

    public void creditCardTestTwo() {
        CreditCard card = new CreditCard(333,123);
        card.changeCreditLimit(300);
        card.withdraw(123,200);
        card.withdraw(123,210);

        if (card.getBalance() == 0 && card.getLoanDebt() == 200) {
            System.out.println("Test has passed");
        } else {
            System.out.println("Test failed!");
        }
    }

}
