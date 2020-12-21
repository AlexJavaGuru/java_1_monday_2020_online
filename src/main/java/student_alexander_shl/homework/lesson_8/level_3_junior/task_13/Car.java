package student_alexander_shl.homework.lesson_8.level_3_junior.task_13;

/*
Придумайте и создайте абстрактный класс и его потомков.
 */
abstract class Car {

    public String model;
    public String fuel;
    public String transmission;
    public int productionDate;
    public int doors;



    public Car(String model, String fuel, String transmission, int productionDate, int doors) {
        this.model = model;
        this.fuel = fuel;
        this.transmission = transmission;
        this.productionDate = productionDate;
        this.doors = doors;
    }

    abstract void engine();

}
