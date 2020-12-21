package student_alexander_shl.homework.lesson_9.level_1_intern.task_4;

import java.math.BigDecimal;

class SafeDemo {
    public static void main(String[] args) {

        Safe safe = new Safe(8888, new BigDecimal(2000));
        System.out.println("PinCode = " + safe.getPinCode());
        System.out.println("Amount = " + safe.getAmount());
        safe.printInformation();

    }

}
