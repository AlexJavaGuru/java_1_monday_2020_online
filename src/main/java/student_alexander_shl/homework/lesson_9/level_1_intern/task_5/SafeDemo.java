package student_alexander_shl.homework.lesson_9.level_1_intern.task_5;

import java.math.BigDecimal;

class SafeDemo {

    public static void main(String[] args) {

        Safe safe = new Safe(8888, new BigDecimal(2000));
        SafeDemo safeDemo = new SafeDemo();
        safe.printInformation();

        safe.putMoney(8888, new BigDecimal(1000));
        safeDemo.checkTest(new BigDecimal(3000), safe.balance(8888), "PinCode 8888, PutMoney +1000, Result 3000");

        safe.putMoney(7777, new BigDecimal(1000));
        safeDemo.checkTest(new BigDecimal(3000), safe.balance(8888), "PinCode 7777, PutMoney +1000, Result 3000");

        safe.getMoney(8888, new BigDecimal(1000));
        safeDemo.checkTest(new BigDecimal(2000), safe.balance(8888), "PinCode 8888, GetMoney -1000, Result 2000");

        safe.getMoney(7777, new BigDecimal(1000));
        safeDemo.checkTest(new BigDecimal(3000), safe.balance(8888), "PinCode 7777, GutMoney -1000, Result 2000");

    }

    void checkTest(BigDecimal calculatedValue, BigDecimal realValue, String testName) {

        if (calculatedValue.compareTo(realValue) >= 0) {
            System.out.println(testName + ": Test OK");
        } else {
            System.out.println(testName + ": Test WRONG");
            System.out.println("calculatedValue = " + calculatedValue);
            System.out.println("realValue = " + realValue);
        }
    }
}
