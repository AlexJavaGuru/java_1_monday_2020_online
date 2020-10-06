package student_lilija_g.homework.lesson_7.level_6_middle.task_11;

import teacher.annotations.CodeReview;

import java.math.BigDecimal;

@CodeReview(approved = true)
class CreditCardTest {

    public static void main(String[] args) {

        CreditCard myCreditCard = new CreditCard("1111 2222 3333 4444 ", "0235");
        CreditCardTest myCreditCardTest = new CreditCardTest();

//      myCreditCardTest.totalBooleanTest(true,myCreditCard.checkPinCode("0235"),"checkPinCode");
//      myCreditCardTest.totalBooleanTest(false,myCreditCard.checkPinCode("1111"),"checkPinCode");

        myCreditCardTest.totalBigDecimalTest(new BigDecimal(0), myCreditCard.getCardCreditLimit(), "Begin getCardCreditLimit 0.00");

        myCreditCard.changeCardCreditLimit("0235", new BigDecimal(1500));
        myCreditCardTest.totalBigDecimalTest(new BigDecimal(1500), myCreditCard.getCardCreditLimit(), "Current getCardCreditLimit 1500.00");

        myCreditCardTest.totalBigDecimalTest(new BigDecimal(0), myCreditCard.getCardBalance(), "Begin getCardBalance 0.00");

        myCreditCard.deposit("0235", new BigDecimal(500));
        myCreditCardTest.totalBigDecimalTest(new BigDecimal(500), myCreditCard.getCardBalance(), "After deposit=500, Balance=500.00, getCardBalance +500.00");

        myCreditCard.withdraw("0235", new BigDecimal(800));
        myCreditCardTest.totalBigDecimalTest(new BigDecimal(0), myCreditCard.getCardBalance(), "After withdraw=800.00, getCardBalance=0.00");
        myCreditCardTest.totalBigDecimalTest(new BigDecimal(300), myCreditCard.getCardLoanDebs(), "After withdraw=800.00, getCardLoanDebs=300.00");

        myCreditCard.withdraw("0235", new BigDecimal(700));
        myCreditCardTest.totalBigDecimalTest(new BigDecimal(1000), myCreditCard.getCardLoanDebs(), "After withdraw=700.00, getCardLoanDebs=1000.00");

        myCreditCard.deposit("0235", new BigDecimal(1200));
        myCreditCardTest.totalBigDecimalTest(new BigDecimal(0), myCreditCard.getCardLoanDebs(), "After deposit=1200.00, getCardLoanDebs=0.00");
        myCreditCardTest.totalBigDecimalTest(new BigDecimal(200), myCreditCard.getCardBalance(), "After deposit=1200.00, getCardBalance=200.00");

        myCreditCard.withdraw("0235", new BigDecimal(1800));
        myCreditCardTest.totalBigDecimalTest(new BigDecimal(0), myCreditCard.getCardLoanDebs(), "After withdraw=1800.00, getCardLoanDebs=0.00");   // Отказ, т.к. лимит 1500.00
        myCreditCardTest.totalBigDecimalTest(new BigDecimal(200), myCreditCard.getCardBalance(), "After withdraw=1800.00, getCardBalance=200.00");

        myCreditCard.withdraw("0235", new BigDecimal(1700));
        myCreditCardTest.totalBigDecimalTest(new BigDecimal(1500), myCreditCard.getCardLoanDebs(), "After withdraw=1700.00, getCardLoanDebs=1500.00");
        myCreditCardTest.totalBigDecimalTest(new BigDecimal(0), myCreditCard.getCardBalance(), "After withdraw=1700.00, getCardBalance=0.00");

        myCreditCard.deposit("0235", new BigDecimal(2000));
        myCreditCardTest.totalBigDecimalTest(new BigDecimal(0), myCreditCard.getCardLoanDebs(), "After deposit=2000.00, getCardLoanDebs=0.00");
        myCreditCardTest.totalBigDecimalTest(new BigDecimal(500), myCreditCard.getCardBalance(), "After deposit=2000.00, getCardBalance=500.00");

        myCreditCard.withdraw("0235", new BigDecimal(300));
        myCreditCardTest.totalBigDecimalTest(new BigDecimal(0), myCreditCard.getCardLoanDebs(), "After withdraw=300.00, getCardLoanDebs=0.00");
        myCreditCardTest.totalBigDecimalTest(new BigDecimal(200), myCreditCard.getCardBalance(), "After withdraw=300.00, getCardBalance=200.00");

    }

// Для проверки checkPinCode:
//    void totalBooleanTest(Boolean expectedValue, Boolean actualValue, String testName) {
//
//        if (expectedValue == actualValue) {
//            System.out.println(testName + " test = OK");
//        } else {
//            System.out.println(testName + " test = FAIL");
//        }
//    }

    void totalBigDecimalTest(BigDecimal expectedValue, BigDecimal actualValue, String testName) {

        if (expectedValue.compareTo(actualValue) >= 0) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }
}
