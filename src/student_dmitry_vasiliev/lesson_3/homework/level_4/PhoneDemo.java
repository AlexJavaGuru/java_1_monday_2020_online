package student_dmitry_vasiliev.lesson_3.homework.level_4;

import student_dmitry_vasiliev.lesson_3.homework.level_4.Phone;
import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class PhoneDemo {
    public static void main(String[] args) {
        Phone myPhone = new Phone("Huawei");
        String phoneModel = myPhone.getModel();
        System.out.println("Phone model = " + phoneModel);
    }
}
