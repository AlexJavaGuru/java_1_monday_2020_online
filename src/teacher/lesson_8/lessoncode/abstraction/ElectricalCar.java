package teacher.lesson_8.lessoncode.abstraction;

public class ElectricalCar extends Car {

    private int batteryCapacity;

    public ElectricalCar(String model, int batteryCapacity) {
        super(model);
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    void start() {
        if (batteryCapacity > 0) {
            System.out.println("Electrical car started...");
        } else {
            System.out.println("Low battery capacity");
        }
    }

    @Override
    void stop() {
        System.out.println("Electrical car stoped...");
    }
}
