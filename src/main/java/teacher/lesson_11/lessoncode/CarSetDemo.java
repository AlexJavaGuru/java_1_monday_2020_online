package teacher.lesson_11.lessoncode;

import java.util.HashSet;
import java.util.Set;

public class CarSetDemo {

    public static void main(String[] args) {
        Car car1 = new Car("White", 4);
        Car car2 = new Car("Yellow", 4);
        Car car3 = new Car("Black", 4);
        Car car4 = new Car("Brown", 4);
        Car car5 = new Car("White", 4);
        Car car6 = new Car("Yellow", 4);
        Car car7 = new Car("Black", 4);
        Car car8 = new Car("Brown", 4);

        Set<Car> cars = new HashSet<>();

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);
        cars.add(car8);

        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
