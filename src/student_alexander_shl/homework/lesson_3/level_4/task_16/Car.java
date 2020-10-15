package student_alexander_shl.homework.lesson_3.level_4.task_16;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Car {

    private String model;

    public Car(String newModel) {
        this.model = newModel;
    }

    public String getModel(){
        return this.model;
    }
}
