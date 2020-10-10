package student_alexander_shl.homework.lesson_3.level_6.task_24;

import java.math.BigDecimal;

class PhoneDemo {

    public static void main(String[] args) {
        Phone phone = new Phone("Huawei","red", 120, 320.12);
        System.out.println("Phone model = " + phone.model);
        System.out.println("Phone color = " + phone.color);
        System.out.println("Phone weight = " + phone.weight);
        System.out.println("Phone price = " + phone.price);

    }
}
