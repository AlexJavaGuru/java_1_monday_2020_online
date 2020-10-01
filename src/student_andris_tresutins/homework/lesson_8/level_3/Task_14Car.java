package student_andris_tresutins.homework.lesson_8.level_3;

abstract class Task_14Car {

    abstract void accelerate();

}

abstract class ElectricCar extends Task_14Car {

    private int batteryCharge;


}

abstract class PetrolCar extends Task_14Car {

    private double petrolTankCapacity;

}

