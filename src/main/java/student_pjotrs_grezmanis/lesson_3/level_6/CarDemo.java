package student_pjotrs_grezmanis.lesson_3.level_6;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class CarDemo {

    public static void main(String[] args) {
        Car bmw = new Car("Bmw", "dark blue", "diesel", "service");
        bmw.driving();
        bmw.description();
        bmw.refuel();
        bmw.repair();
    }
}
