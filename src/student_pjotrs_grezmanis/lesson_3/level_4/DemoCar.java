package student_pjotrs_grezmanis.lesson_3.level_4;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
 class DemoCar {
    public static void main(String[] args) {
        Car myCar = new Car("Nissan");
        String carModel = myCar.getModel();
        System.out.println("Car model = " + carModel);
    }
}
