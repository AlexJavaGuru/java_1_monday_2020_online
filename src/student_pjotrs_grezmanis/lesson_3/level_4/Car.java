package student_pjotrs_grezmanis.lesson_3.level_4;

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

