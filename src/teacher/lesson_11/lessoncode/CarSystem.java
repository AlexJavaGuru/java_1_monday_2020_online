package teacher.lesson_11.lessoncode;

public interface CarSystem {

    void addCar(Car car);

    Car findCarByIndex(int index);

    Car findCarByColor(String color);

    void removeCar(Car car);

    void removeByIndex(int index);

}
