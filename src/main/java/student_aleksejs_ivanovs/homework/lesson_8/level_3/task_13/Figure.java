package student_aleksejs_ivanovs.homework.lesson_8.level_3.task_13;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
abstract class Figure {

    float x;
    float y;

    Figure(float x, float y){
        this.x=x;
        this.y=y;
    }

    public abstract float getPerimeter();

    public abstract float getArea();

}
