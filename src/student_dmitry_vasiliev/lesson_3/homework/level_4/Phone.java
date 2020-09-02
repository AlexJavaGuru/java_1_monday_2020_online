package student_dmitry_vasiliev.lesson_3.homework.level_4;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Phone {
    private String model;

    public Phone (String newModel) {
        this.model = newModel;
    }

    public String getModel() {
        return this.model;
    }

}
