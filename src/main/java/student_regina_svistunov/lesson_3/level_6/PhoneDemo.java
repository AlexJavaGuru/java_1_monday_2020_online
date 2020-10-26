package student_regina_svistunov.lesson_3.level_6;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class PhoneDemo {
    public static void main(String[] args) {

        Phone phone = new Phone("Iphone" ,"64 GB", "rosegold");

        phone.voice();
    }
}
