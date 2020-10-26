package teacher.lesson_8.lessoncode.abstraction;

public abstract class Car {

    protected String model;

    public Car(String model) {
        this.model = model;
    }

    abstract void start();

    abstract void stop();
}
