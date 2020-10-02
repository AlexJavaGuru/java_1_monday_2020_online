package student_artur_martinenko.homework.lesson_8.level_2_intern.task_7;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Mother {  //can inherit only fom one parent class.
    private String name;
    private String age;

    public Mother(String name, String age) {
        this.name = name;
        this.age = age;
    }
}
