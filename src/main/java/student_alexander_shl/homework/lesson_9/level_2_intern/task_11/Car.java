package student_alexander_shl.homework.lesson_9.level_2_intern.task_11;
/*
Создайте иерархию наследования из двух уровней (родительский и дочерний).
Продемонстрируйте использование протектед конструктора в родительском классе.
Продемонстрируйте вызов протектед конструктора из класса потомка.
 */

abstract class Car {

    protected String model;
    protected String fuel;
    protected String transmission;
    protected int productionDate;
    protected int doors;

    protected Car(String model, String fuel, String transmission, int productionDate, int doors) {
        this.model = model;
        this.fuel = fuel;
        this.transmission = transmission;
        this.productionDate = productionDate;
        this.doors = doors;
    }

    abstract void engine();

}
