package teacher.lesson_8.lessoncode.abstraction;

public class CarDemo {

    public static void main(String[] args) {
//        Car car = new Car();
        ElectricalCar electricalCar = new ElectricalCar("Tesla", 20);
        electricalCar.start();

        PetrolCar petrolCar = new PetrolCar("KIA Sportage");
        petrolCar.start();

        electricalCar.setBatteryCapacity(0);
        electricalCar.start();
    }
}
