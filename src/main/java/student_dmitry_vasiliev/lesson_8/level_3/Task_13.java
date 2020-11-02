package student_dmitry_vasiliev.lesson_8.level_3;

//Придумайте и создайте абстрактный класс и его потомков.

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Task_13 {

    abstract class Parent {
        int age;
        String sex;
    }

    class Mother extends Parent {

    }

    class Father extends Parent {

    }
}
