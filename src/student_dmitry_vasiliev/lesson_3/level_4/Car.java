package student_dmitry_vasiliev.lesson_3.homework.Level_4;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Car {
    private String model;

    public Car(String newModel) {
        this.model = newModel;
    }

    public String getModel() {
        return this.model;
    }
}
