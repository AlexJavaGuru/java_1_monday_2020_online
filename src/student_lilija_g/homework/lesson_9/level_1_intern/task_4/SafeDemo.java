package student_lilija_g.homework.lesson_9.level_1_intern.task_4;

import java.math.BigDecimal;

class SafeDemo {
    public static void main(String[] args) {

        Safe mySafe = new Safe(1234, new BigDecimal(1500));
        System.out.println("PinCode is " + mySafe.getPinCode());
        System.out.println("Balance is " + mySafe.getAmountOfMoney());
        mySafe.printSafeInfo();

        mySafe.pinCode = 2345;
        mySafe.amountOfMoney = BigDecimal.valueOf(2000);
        System.out.println("PinCode is " + mySafe.getPinCode());
        System.out.println("Balance is " + mySafe.getAmountOfMoney());
        mySafe.printSafeInfo();
    }
}
