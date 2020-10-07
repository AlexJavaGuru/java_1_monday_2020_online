package student_andris_tresutins.homework.lesson_8.level_4;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public abstract class Shape_T15 {

    private String title;

    public Shape_T15(String title) {
        this.title = title;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

}