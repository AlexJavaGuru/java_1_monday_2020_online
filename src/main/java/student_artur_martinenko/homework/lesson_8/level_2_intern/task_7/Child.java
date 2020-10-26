package student_artur_martinenko.homework.lesson_8.level_2_intern.task_7;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Child extends Mother {   //multiple inheritance is forbidden in Java, only one.

    //calling a constructor from patent class
    public Child(String name, String age) {
        super(name, age);   //super means we are calling constructor from super(parent) class.
    }
}
