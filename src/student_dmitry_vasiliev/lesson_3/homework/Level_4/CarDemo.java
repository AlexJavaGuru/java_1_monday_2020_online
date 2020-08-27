package student_dmitry_vasiliev.lesson_3.homework.Level_4;

import student_dmitry_vasiliev.lesson_3.homework.Level_4.Car;
import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class CarDemo {
    public static void main(String[] args) {
        Car myCar = new Car("Nissan");
        String carModel = myCar.getModel();
        System.out.println("Car model = " + carModel);
    }
}
