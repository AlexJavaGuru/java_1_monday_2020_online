package student_aleksejs_ivanovs.homework.lesson_9.level_1.task_4;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class SafeDemo {

    public static void main(String[] args) {
        Safe safe = new Safe("123", 50);
        System.out.println("Given pin : " + safe.pin);
        System.out.println("Given money : " + safe.money);

        safe.pin = "321";
        safe.money = 666;

        System.out.println("Changed pin : " + safe.pin);
        System.out.println("Changed money : " + safe.money);
    }

}
