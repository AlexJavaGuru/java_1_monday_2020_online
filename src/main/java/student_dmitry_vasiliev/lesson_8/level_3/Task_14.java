package student_dmitry_vasiliev.lesson_8.level_3;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Task_14 {

/*    Исправьте код программы так, что бы он компилировался.
    Класс Car менять нельзя.
    Классы ElectricCar и PetrolCar должны наследоваться
    от класса Car.*/


    abstract class Car {

        abstract void accelerate();

    }

    class ElectricCar extends Car {
        @Override
        void accelerate() {

        }

        private int batteryCharge;
    }

    class PetrolCar extends Car {
        @Override
        void accelerate() {

        }

        private double petrolTankCapacity;

    }
}
