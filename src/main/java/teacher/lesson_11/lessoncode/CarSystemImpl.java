package teacher.lesson_11.lessoncode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CarSystemImpl implements CarSystem {

    private List<Car> carStorage = new LinkedList<>();

    @Override
    public void addCar(Car car) {
        carStorage.add(car);
    }

    @Override
    public Car findCarByIndex(int index) {
        Car car = carStorage.get(index);
        return car;
    }

    @Override
    public Car findCarByColor(String color) {
        for (Car car : carStorage) {
            if (car.getColor().equals(color)) {
                return car;
            }
        }
        return null;
    }

    @Override
    public void removeCar(Car car) {
        carStorage.remove(car);
    }

    @Override
    public void removeByIndex(int index) {
        carStorage.remove(index);
    }
}
