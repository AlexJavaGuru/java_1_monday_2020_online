package student_lilija_g.homework.lesson_9.level_1_intern.task_5;

import teacher.annotations.CodeReview;

import java.math.BigDecimal;

@CodeReview(approved = true)
class SafeDemo {
    public static void main(String[] args) {

        Safe mySafe = new Safe("L!l1ja", new BigDecimal(500));
        SafeDemo mySafeDemo = new SafeDemo();

        mySafe.putMoney("L!l1ja", new BigDecimal(200));
        mySafeDemo.totalBigDecimalTest(new BigDecimal(700), mySafe.balance("L!l1ja"), "putMoney");
        mySafe.putMoney("Lilija", new BigDecimal(100));
        mySafeDemo.totalBigDecimalTest(new BigDecimal(700), mySafe.balance("L!l1ja"), "putMoney");

        mySafe.getMoney("L!l1ja", new BigDecimal(300));
        mySafeDemo.totalBigDecimalTest(new BigDecimal(400), mySafe.balance("L!l1ja"), "getMoney");
        mySafe.getMoney("Lilija", new BigDecimal(300));
        mySafeDemo.totalBigDecimalTest(new BigDecimal(400), mySafe.balance("L!l1ja"), "getMoney");
    }

    void totalBigDecimalTest(BigDecimal expectedValue, BigDecimal actualValue, String testName) {

        if (expectedValue.compareTo(actualValue) >= 0) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
            System.out.println(actualValue + " test = FAIL");
        }
    }
}
